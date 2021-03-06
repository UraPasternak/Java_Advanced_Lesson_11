$('.all-product').click(function(){
	var products = null;

	$.get("AllProduct", function(data) {
		if (data !== '') {
			products = data;
		}
	}).done(function() {
		
		var cardsContent = "";
		jQuery.each(products, function(i, value) {
		
			cardsContent+="<div class='col'>" +
						  "<div class='card'>" +
						  "<div class='card-body'>" +
						  "<h5 class='card-title'>" + value.name + "</h5>"+
						  "<h6 class='card-subtitle mb-2 text-muted'>" + value.price + "</h6>"+
						  "<p class='card-text'>" + value.description + "</p>"+
						  "<a class='product-buy' href='#'>to buy</a>"+
						  "</div>" +
						  "</div>" +
						  "</div>" +
						  "</div>"
		});
		
		  $('#productCards').html(cardsContent);
		
	});
});