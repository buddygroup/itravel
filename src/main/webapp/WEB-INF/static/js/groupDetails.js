$(document).ready(function() {
		
		$("#div1").hide();
		 
		});
	
	$(function () {
	    /* BOOTSNIPP FULLSCREEN FIX */
	    if (window.location == window.parent.location) {
	        $('#back-to-bootsnipp').removeClass('hide');
	    }
	    
	    
	    $('[data-toggle="tooltip"]').tooltip();
	    
	    $('#fullscreen').on('click', function(event) {
	        event.preventDefault();j
	        window.parent.location = "http://bootsnipp.com/iframe/4l0k2";
	    });
	    $('a[href="#add-group-details"]').on('click', function(event) {
	        event.preventDefault();
	        $('#add-group-details').modal('show');
	    })
	    
	    $('[data-command="toggle-search"]').on('click', function(event) {
	        event.preventDefault();
	        $(this).toggleClass('hide-search');
	        
	        if ($(this).hasClass('hide-search')) {        
	            $('.c-search').closest('.row').slideUp(100);
	        }else{   
	            $('.c-search').closest('.row').slideDown(100);
	        }
	    })
	    
	   
	});