'use strict';

angular.module('myApp.controllers.ReportsController', [])
    .controller('ReportsController', function ($scope, ReportSvc, FilterOprSvc, ReportResultsSvc) {
		init();
		function init() {
			$scope.reports = ReportSvc.list(); //ReportsSvc.get();
			$scope.filterOperators = FilterOprSvc.get();

            $scope.gap = 5;
            $scope.itemsPerPage = 5;
            $scope.pagedItems = [];
            $scope.currentPage = 0;
			$scope.currTemplate = {fields: null,orgs: null,filters: [],newFilter: null,editingFilter: -1};
		};
		$scope.$watch('reportsTree.currentNode.id', function(newVal, oldVal){
			ReportSvc.getTemplate({ id: newVal}, function(repfields) {
				$scope.currTemplate = {
					fields: repfields,
					orgs: [{"orgId":4499, "orgName":"USAA"},{"orgId":2685, "orgName":"NAVY"}],
					filters: [],
					newFilter: null,
					editingFilter: -1,					
				};
				$scope.pagedItems = [];
			});			
			
//			var templ = null;
//			TemplateSvc.get(function(data){
//				angular.forEach(data.templates, function(template) {
//					if(template.reportId==newVal){
//						templ = template;
//					}
//				});
//				$scope.currTemplate = templ;
//				$scope.currTemplate.filters = [];
//                $scope.pagedItems = [];
//			});
		}, true);

		$scope.operatorForField = function(operator) {
			if ($scope.currTemplate.newFilter==null)
				return false;
			else 
				return _.contains(operator.forType, $scope.currTemplate.newFilter.field.dataType);
			//return operator.forType.indexOf($scope.currTemplate.newFilter.field.DataType) != -1
		};
		
		$scope.addFilter = function(){
			if ($scope.currTemplate.editingFilter>-1) {
				$scope.currTemplate.filters[$scope.currTemplate.editingFilter] = $scope.currTemplate.newFilter;
			} else {
				$scope.currTemplate.filters.push($scope.currTemplate.newFilter);
			}			
			$scope.currTemplate.newFilter = null;
			$scope.currTemplate.editingFilter = -1;
		};

		$scope.deleteFilter = function(index){
			$scope.currTemplate.filters.splice(index,1);
			if ($scope.currTemplate.editingFilter==index) {
				$scope.currTemplate.editingFilter = -1;
			}
		};
		
		$scope.editFilter = function(index){
			$scope.currTemplate.newFilter = $scope.currTemplate.filters[index];
			$scope.currTemplate.editingFilter = index;
			console.log("field " + JSON.stringify($scope.currTemplate.newFilter.field));
		};
		
		$scope.runReport = function() {
			//$scope.serializedParams = JSON.stringify($scope.currTemplate);
			
            ReportResultsSvc.get(function(data){
                $scope.results = {
                	header: data.fields,
                	data: data.rows
                };
                angular.forEach($scope.results.data, function(row) {
                	console.log(row);
                });
                $scope.currentPage = 0;
                $scope.groupToPages($scope.results.data);                
            });
            
//            var criteria = {reportId: 40};
//            ReportSvc.runReport(criteria, function(repResult){
//                $scope.results = {
//                	header: repResult.fields,
//                	data: repResult.rows
//                };                
//                angular.forEach(repResult.rows, function(row) {
//                	console.log(row);
//                });
//                $scope.currentPage = 0;
//                $scope.groupToPages($scope.results.data);            	
//            });
		};

        // calculate page in place
        $scope.groupToPages = function (data) {
            $scope.pagedItems = [];
            for (var i = 0; i < data.length; i++) {
                if (i % $scope.itemsPerPage === 0) {
                    $scope.pagedItems[Math.floor(i / $scope.itemsPerPage)] = [ data[i] ];
                } else {
                    $scope.pagedItems[Math.floor(i / $scope.itemsPerPage)].push(data[i]);
                };
            };
        };

        $scope.range = function (size,start,end) {
            var ret = [];
            console.log(size,start,end);

            if (size < end) {
                end = size;
                start = (size<$scope.gap?0:size-$scope.gap);
            }
            for (var i = start; i < end; i++) {
                ret.push(i);
            }
            console.log(size,start,end);
            console.log(ret);
            return ret;
        };

        $scope.prevPage = function () {
            if ($scope.currentPage > 0) {
                $scope.currentPage--;
            }
        };

        $scope.nextPage = function () {
            if ($scope.currentPage < $scope.pagedItems.length - 1) {
                $scope.currentPage++;
            }
        };

        $scope.setPage = function () {
            $scope.currentPage = this.n;
        };

        $scope.selectRow = function(row){
            $scope.selectedRow = row;
            window.document.location = '#/workflow';
        };
	});