$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
			
		var href = $(this).attr('href');
			$.get(href, function(user, status){
			$('#idEdit').val(user.id);
			
			$('#firstNameEdit').val(user.firstName);
			$('#lastNameEdit').val(user.lastName);
			$('#userNameEdit').val(user.username);
			$('#emailEdit').val(user.email);
			$('#passEdit').val(user.password);
			$('#confirmPassEdit').val(user.confirmPassword);
			$('#orgIdEdit').val(user.org_id);
			$('#rolesEdit').val(user.roles);
			});					
		$('#editModal').modal();
	});
	
	$('table #deleteButton').on('click', function(event){
		event.preventDefault();
		
		var href= $(this).attr('href');
		
		$('#confirmDeleteButton').attr('href', href);
		
		$('#deleteModal').modal();
	});
		
});