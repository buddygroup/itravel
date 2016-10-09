 // create the controller and inject Angular's $scope
    iTravelApp.controller('homeController', function($rootScope, $scope,$http, homeService) {
        // create a message to display in our view
    	
    	var self = this
        $scope.message = 'Everyone come and see how good I look!';
        $scope.addMember = function () {
            $scope.myTxt = "You clicked submit!";
            alert("Did you called submit in home");
            var userDetail = {
            		name : $scope.name,
            		email: $scope.email,
            		password:$scope.password,
            		phone : $scope.phone,
            		location : $scope.location
            }
            
            homeService.addMember(userDetail).then(function(response){
            	$scope.message = reponse.data;
            }); 	
            
        }
        
        self.logout = function() {
        	  $http.post("http://localhost:8080/ITravel/logout", {}).then(function successCallback(response) {
        		  $rootScope.authenticated = false;
          	    	$location.path("/");
          	    	$scope.user="";
        		  }, function errorCallback(response) {
        			  $rootScope.authenticated = false;
              	    $location.path("/");
              	  $scope.user="";
        		  }); 
        }
        
        var authenticate = function(callback) {
            $http.get("http://localhost:8080/ITravel/user").success(function(data) {
              if (data.name) {
                $rootScope.authenticated = true;
                $scope.user =data.name;
              } else {
                $rootScope.authenticated = false;
              }
              callback && callback();
            }).error(function() {
              $rootScope.authenticated = false;
              callback && callback();
            });
          }
        authenticate();
          $scope.credentials = {};
          $scope.login = function() {
            $http.post("http://localhost:8080/ITravel/login", $.param($scope.credentials), {
              headers : {
                "content-type" : "application/x-www-form-urlencoded"
              }
            }).success(function(data) {
              authenticate(function() {
                if ($rootScope.authenticated) {
                  $location.path("/");
                  $scope.error = false;
                } else {
                  $location.path("/login");
                  $scope.error = true;
                }
              });
            }).error(function(data) {
              $location.path("/login");
              $scope.error = true;
              $rootScope.authenticated = false;
            })
          };
        
      //addming new group info
        $scope.addGrpInfo = function (){        	
        	
        	authenticate(function() {
                if ($rootScope.authenticated) {
          
                	var grpInfo = {
                    		grpTypes : $scope.grpTypes,
                    		grpName : $scope.grpName,
                    		grpVsble : $scope.grpVsble,
                    		adminName : $scope.adminName
                    }
                    
                    homeService.addGrpInfo(grpInfo).then(function(response){
                    	$scope.message = reponse.data;
                    });
                  $scope.error = false;
                } else {
                 alert("please log in before creating a group");
                  $scope.error = true;
                }
              });
        	
        	
        }
    });

    iTravelApp.controller('groupDetailsController', function($scope) {
        $scope.message = 'Look! I am an about page.';
    });

    iTravelApp.controller('contactController', function($scope, homeService) {
        $scope.message = 'Contact us! JK. This is just a demo.';       
    	
        $scope.contactUsInfoBtn = function () {
        	alert("Buton Clicked" +$scope.name +" " + $scope.email + " " + $scope.message +" " + $scope.subject);
            $scope.myTxt = "You clicked submit!";
            
            var contactUsInfo = {
            	name : $scope.name,
            	email: $scope.email ,
            	subject : $scope.subject,
            	message : $scope.message
            	
            }
            
            homeService.putContactUsInfo(contactUsInfo).then(function(response){
            	$scope.message = reponse.data;
            }); 	
            
        }
        
    });
    
