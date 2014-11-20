'use strict';

angular.module('myApp.controllers.MainController', [])
	.controller('MainController', function ($scope, $location, UserService, AppPropertiesService) {
		init();
		function init() {
			UserService.get(function(data){
				$scope.user = data;
				angular.forEach($scope.user.assignedOrgs, function(org) {
					if(org.isDefault==true){
						$scope.selectedOrg = org;
					}
				});
			});
			AppPropertiesService.get(function(data){
				$scope.props = {
					version: data.version,
					appName: data.appName
				};
			});
		};
		$scope.isCurrentView = function(path){
			return ($location.path().substr(0,path.length) == path);
		};
		$scope.getAllNotiCounts = function(list) {
			var total = 0;
			angular.forEach(list, function(item) {
				total += item.count;
			});
			return total;
		};
		$scope.setNotiType = function(notiType) {
			$scope.showNotiType = notiType;
			console.log(notiType + ' notifications');
		};
		$scope.selectOrg = function(org) {
			if ((!org.disabled) && ($scope.selectedOrg.orgId != org.orgId)) {
				$scope.selectedOrg = org;
			}
			changeOrg();
		};
		function changeOrg() {
			console.log($scope.selectedOrg);
		};
		$scope.selectDoc = function() {
			console.log($scope.recentDoc);
			$scope.recentDoc = '';
		};
		$scope.searchBy = function(searchByValue) {
			console.log($scope.searchFor + ', ' + searchByValue);
		};
	});