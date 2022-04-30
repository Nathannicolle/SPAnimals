window.addEventListener("load", function(event) {
	// search an animal after key is pressed inside search bar
	if(document.querySelector(".search_bar_animal")) {
		document.querySelector(".search_bar_animal").addEventListener("keyup", () => {
			document.querySelectorAll(".card_animal").forEach((element) => {
				if(element.innerHTML.toLowerCase().includes(document.querySelector(".search_bar_animal").value.toLowerCase())) {
					element.style = "display: flex !important;";
				} else {
					element.style = "display: none !important;";
				}
			});
		});
	}
	
	if(document.querySelector(".search_bar_refuge")) {
		document.querySelector(".search_bar_refuge").addEventListener("keyup", () => {
			document.querySelectorAll(".line_refuge").forEach((element) => {
				if(element.innerHTML.toLowerCase().includes(document.querySelector(".search_bar_refuge").value.toLowerCase())) {
					element.style = "display: flex !important;";
				} else {
					element.style = "display: none !important;";
				}
			});
		});
	}
});