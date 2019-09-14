$(document).ready(function() {
	addButtonListeners();
	editAndNewButton();
	deleteButton();
});
function addButtonListeners(){
	$("#btnDatabaseSeed").click(function() {
    	alert("Hello, World!");
    	$.ajax({
    		type: 'GET',
    		url: '/database/seed',
    		data: {}, // not needed, just in case
    		success: function() {
    		    alert("success");
    		    }
    		});
   	});

	$("#btnCreate").click(function() {
		$('.myForm #exampleModal').modal();
	});
	
	
}

function editAndNewButton(){
	$('.nBtn, .table .eBtn').click(function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		var text = $(this).text(); // to be refined #quickAndDirty
		if(text === 'Edit'){
			$.get(href, function(article, status){
				$('.myForm #id').val(article.id);
				$('.myForm #name').val(article.name);
				$('.myForm #price').val(article.price);
			});
			$('.myForm #exampleModal').modal();
		} else {
			$('.myForm #id').val('no worries, id will be generated');
			$('.myForm #name').val('');
			$('.myForm #price').val('');
			$('.myForm #exampleModal').modal();
		}
	});
}

function deleteButton(){
	$(".table .delBtn").click(function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#myModal #delRef').attr('href', href);
		$('#myModal').modal();
	});
}
