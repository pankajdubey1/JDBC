var app = angular.module("myNoteApp", []);

app.controller("myNoteCtrl", function($scope) {
    $scope.message = "";
    $scope.left  = function() {return 100 - $scope.message.length;};
    $scope.clear = function() {$scope.message = "";};
    $scope.save  = function() {alert("Note Saved");};
});

app.controller("loginCtrl",["$scope",'$http',  function($scope,$http) {
     
	$scope.data = {};
	$scope.login = function() {
		/*if($scope.idd=="123" && $scope.pass=="123"){*/
        
			/*$http('/user/'+$scope.idd+ '/'+ $scope.pass).//
					save(
					
							function success(data) {
								alert("login success");
							},
							function error(data){
								
							}
					);*/
			
			
			 $http.post('api/user/'+$scope.idd+ '/'+ $scope.pass).success(function(data, status) {
		            //$scope.hello = data;
				 alert(data.message);
				// alert("login success");
		        });
			
		
		/*}
		else{
			alert("incorrect");
		}*/
		//alert("incorrect");
	};
}]);

app.controller("testCtrl",["$scope","$http", function($scope,$http){
	$scope.data = {};
	$scope.testing = function(){
		
		/*$http.post('api/user2/'+$scope.t).success(function(data, status){
			 //alert(data.message);
			//alert("success");
			alert(data.message);
		});*/
		$http.post('http://localhost:8080/BillPay/api/customer/register1').success(function(data, status){
			 //alert(data.message);
			//alert("success");
			alert(data);
		});
		
		
	}
	
}]);

/*$resource($scope.API_BASE_URL + //
		'/user/' + $rootScope.FBUserID + '/' + $scope.data.newapin).//
		save(

		function success(data) {

			$rootScope.message = data.message;

			if (data.status == "SUCCESS") {
				showAlert('success');
				$scope.loadPage("/apin/verify");
			} else {
				showAlert('error');
			}
		}, //

		function error(data) {

			$rootScope.message = data.message;
			showAlert('error');
		});*/