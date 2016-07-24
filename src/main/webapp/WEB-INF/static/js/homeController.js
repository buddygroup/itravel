 // create the controller and inject Angular's $scope
    iTravelApp.controller('homeController', function($scope, homeService) {
        // create a message to display in our view
        $scope.message = 'Everyone come and see how good I look!';
        $scope.addMember = function () {
        	
            $scope.myTxt = "You clicked submit!";
            alert("did you called submit in home");
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
        
      //addming new group info
        $scope.addGrpInfo = function (){        	
        	
        	var grpInfo = {
            		grpTypes : $scope.grpTypes,
            		grpName : $scope.grpName,
            		grpVsble : $scope.grpVsble,
            		adminName : $scope.adminName
            }
            
            homeService.addGrpInfo(grpInfo).then(function(response){
            	$scope.message = reponse.data;
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
    
