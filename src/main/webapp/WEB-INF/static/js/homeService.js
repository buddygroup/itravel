'use strict';

iTravelApp.factory('homeService', function($http) {
	var factory = {}; 
		factory.putContactUsInfo = function(contactUsInfo){
			return $http.put("http://localhost:8080/ITravel/contactUsInfo",contactUsInfo).then(function(response){
				alert("Response status is" +response.status)
				return response;
			},
			function(errResponse){
				
			}
			);
		}

		factory.addMember = function(userDetail){
			alert("I am in check hotel"+userDetail);
			return $http.put("http://localhost:8080/ITravel/addMember", userDetail).then(function(response){
				alert("Response status is" +response.status)
				return response;
			},
			function(errResponse){
				
			}
			);
		}
		
		factory.login = function(userDetail){
			alert("I am in login service"+userDetail);
			return  $http.get("http://localhost:8080/ITravel/login", userDetail).then(function(response){
				alert("Response status is" +response.status);
				return response;
			},
			function(errResponse){
				
			}
			);
			return "success";
		}
		
		//adding new group info
		factory.addGrpInfo = function(grpInfo){
			
			return $http.put("http://localhost:8080/ITravel/createGroup", grpInfo).then(function(response){
				alert("Response status is" +response.status)
				return response;
			},
			function(errResponse){
				
			}
			);
		}
	return factory;
});