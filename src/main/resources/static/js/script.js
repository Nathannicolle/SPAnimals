window.addEventListener("load", function(event) {
	document.querySelector(".search_bar").addEventListener("keyup", () => {
		document.querySelectorAll(".card_animal").forEach((element) => {
			document.querySelectorAll(".animal_name").forEach((animal_name) => {
				console.log(animal_name.innerHTML.toLowerCase().includes(document.querySelector(".search_bar").value.toLowerCase()));
				if(animal_name.innerHTML.toLowerCase().includes(document.querySelector(".search_bar").value.toLowerCase())) {
					console.log("find");
					element.style = "display: flex !important;";
				} else {
					console.log("unfind");
					element.style = "display: none !important;";
				}
			});
		});
	});
});