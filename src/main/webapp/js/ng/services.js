'use strict';

angular.module('myApp.services', ['ngResource'])
	.value('version', '0.1')
	.value('appName', 'ELT Direct')
	.factory('UserService', function($resource) {
		return $resource('data/user.json');
	})
	.factory('AppPropertiesService', function($resource) {
		return $resource('data/appProperties.json');
	})
	//.factory('ReportsSvc', function($resource) {
	//	return $resource('data/reports.json');
	//})
	//.factory('ReportsSvc1', function($resource) {
	//	return $resource('service/report', {}, {
	//    list:  { method: 'GET', isArray: true },
	//    create: { method: 'POST' }
	//});
	//})
	.factory('ReportSvc', function($resource) {
		return $resource('service/report/:id', {}, {
			list:  { method: 'GET', isArray: true },
			create: { method: 'POST'},
		    getTemplate: { method: 'GET', isArray: true },
		    runReport: { method: 'POST', url: 'service/report/runReport'}, 
		    update: { method: 'PUT', params: {id: '@id'}},
		    remove: { method: 'DELETE', params: {id: '@id'}}
		});
	})
	//.factory('TemplateSvc', function($resource) {
	//	return $resource('data/template.json');
	//})
	.factory('FilterOprSvc', function($resource) {
		return $resource('data/filterOperators.json');
	})
	.factory('ReportResultsSvc', function($resource) {
		return $resource('data/reportResult.json');
	});