
var app = angular.module('myApp', ['ngRoute','ui.grid',
                                      'ui.grid.edit',
                                      'ui.grid.cellNav',
                                      'ui.grid.autoResize',
                                      'ui.bootstrap',
                                      'ui.grid.pagination']);


app.config(function($routeProvider, $httpProvider){
	
	$routeProvider.when('/hello', {
	    templateUrl : 'poc1.html',
	    	controller : 'pocOneController'
	})
	.otherwise('/');
	
	$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
	
});




app.controller('myController',function($scope, $http) {
    $scope.details = {
        enableGridMenus: false,
        enableSorting: false,
        enableFiltering: false,
        enableCellEdit: false,
        enableColumnMenus: false,
        enableHorizontalScrollbar: 0,
        enableVerticalScrollbar: 0,
        paginationPageSizes: [5, 10, 20, 30],
        paginationPageSize: 10,
        useExternalPagination: true,

        columnDefs: [
            {
            	name: 'trainingPartnerId', 
                displayName: 'TP ID'
            },
            {
            	name: 'trainingPartnerName',
            	displayName: 'Name'
            },
            {
                name: 'tpAddress',
                displayName: 'Address'
            },
            {
                name: 'tpContact',
                displayName: 'Contact No.'
            },
            {
                name: 'tpEmail',
                displayName: 'Email Id'
             },
             {
            	 name: 'tpDocUrl', 
            	 displayName: 'Document', 
            	 cellTemplate: '<a ng-href="{{row.entity.tpDocUrl}}" target="_blank" download><img src="images/pdf.png" class="pointer"></a>'
             }
        ]
    };
    
    
    
    
    $http.get('/getTrainingPartnerDetailForPOC')
    .then(function (response) {
    	 $scope.details.data= response.data;

    });
    
    
   
 
     
});

