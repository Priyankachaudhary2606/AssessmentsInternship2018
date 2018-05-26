var app = angular.module('app', ['ngRoute',
								'ui.grid',
							    'ui.grid.edit',
							    'ui.grid.cellNav',
							    'ui.grid.autoResize',
							    'ui.bootstrap',
							    'ui.grid.pagination']);


app.controller('mainController', function($scope, $http) {
	
	$scope.user={
			username: "",
			password: ""
	}
	
	$scope.login=function(){
		
		
	}
	
});