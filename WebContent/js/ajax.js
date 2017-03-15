
$(document).ready(function() {
	$('#countryList').change(function() {
		$.ajax({
			url : 'StateController',
			data : {
				Country : $('#countryList :selected').text()
			},
			success : function(responseText) {
				$("#stateList option").remove();
				var newValue = responseText.replace('[', '').replace(']', '');
				var array = newValue.split(',');
				 $.each(array, function(i, l){
				        $("#stateList").append('<option value="'+ l +'">'+ l +'</option>')
				 });
			}
		});
	});
});