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