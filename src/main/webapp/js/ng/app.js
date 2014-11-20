'use strict';

// Declare app level module which depends on filters, and services
angular.module('myApp', [
  'ngRoute',
  'myApp.filters',
  'myApp.services',
  'myApp.directives',
  'myApp.controllers',
  'myApp.controllers.MainController',
  'myApp.controllers.ReportsController',
  'angularTreeview'
  //'jsonService'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/home', {templateUrl: 'home.html', controller: 'homeCtrl'});
  $routeProvider.when('/organizations', {templateUrl: 'organizations.html', controller: 'homeCtrl'});
  $routeProvider.otherwise({redirectTo: '/home'});
}]);