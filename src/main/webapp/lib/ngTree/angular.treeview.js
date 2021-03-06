/*
	@license Angular Treeview version 0.1.6
	ⓒ 2013 AHN JAE-HA http://github.com/eu81273/angular.treeview
	License: MIT


	[TREE attribute]
	angular-treeview: the treeview directive
	tree-id : each tree's unique id.
	tree-model : the tree model on $scope.
	node-id : each node's id
	node-label : each node's label
	node-children: each node's children

	<div
		data-angular-treeview="true"
		data-tree-id="tree"
		data-tree-model="roleList"
		data-node-id="roleId"
		data-node-label="roleName"
		data-node-children="children" >
	</div>
*/

(function (angular) {
	'use strict';

	angular.module('angularTreeview', []).directive('treeModel', ['$compile', function($compile) {
		return {
			restrict: 'A',
			link: function (scope, element, attrs) {
				//tree id
				var treeId = attrs.treeId;
			
				//tree model
				var treeModel = attrs.treeModel;

				//node id
				var nodeId = attrs.nodeId || 'id';

				//node label
				var nodeLabel = attrs.nodeLabel || 'label';

				//children
				var nodeChildren = attrs.nodeChildren || 'children';

				//tree template
				var template =
					'<ul>' +
						'<li data-ng-repeat="node in ' + treeModel + '">' +
						    '<div class="truncated" data-ng-class="node.selected" data-ng-click="' + treeId + '.nodeClicked(node)">' +
							   '<i class="collapsed" data-ng-show="node.' + nodeChildren + '.length && node.collapsed"></i>' +
							   '<i class="expanded" data-ng-show="node.' + nodeChildren + '.length && !node.collapsed"></i>' +
							   '<i class="normal" data-ng-hide="node.' + nodeChildren + '.length"></i> ' +
							   '<span>{{node.' + nodeLabel + '}}</span>' +
						    '</div>' +
							'<div class="children" data-ng-hide="node.collapsed" data-tree-id="' + treeId + '" data-tree-model="node.' + nodeChildren + '" data-node-id=' + nodeId + ' data-node-label=' + nodeLabel + ' data-node-children=' + nodeChildren + '></div>' +
						'</li>' +
					'</ul>';

				//check tree id, tree model
				if(treeId && treeModel) {

					//root node
					if(attrs.angularTreeview) {
					
						//create tree object if not exists
						scope[treeId] = scope[treeId] || {};

						scope[treeId].nodeClicked = scope[treeId].nodeClicked || function(selectedNode){
							if (selectedNode.children.length) {
								selectedNode.collapsed = !selectedNode.collapsed;
							} else {
								if( scope[treeId].currentNode && scope[treeId].currentNode.selected ) {
									scope[treeId].currentNode.selected = undefined;
								}
								selectedNode.selected = 'selected';
								scope[treeId].currentNode = selectedNode;							
							}
						}
					}

					//Rendering template.
					element.html('').append($compile(template)(scope));
				}
			}
		};
	}]);
})( angular );
