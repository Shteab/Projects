var euroclick = document.getElementById("clickeuro");
var euroshow = document.getElementById("euro");
euroclick.addEventListener("click", function(event)
															 {
															  event.preventDefault();
																euroshow.style.display = "inline";
															 }, false);
															 
var renminbiClick = document.getElementById("clickrenminbi");
var renminbiShow = document.getElementById("renminbi");
renminbiClick.addEventListener("click", function(event)
																			 {
																			 	event.preventDefault();
																				renminbiShow.style.display = "inline";
																			 }, false);
var pesoClick = document.getElementById("clickpeso");
var pesoShow = document.getElementById("peso");
pesoClick.addEventListener("click", function(event)
																		{
																		 event.preventDefault();
																		 pesoShow.style.display = "inline";
																		}, false);
																		
var swissClick = document.getElementById("clickswiss");
var swissShow = document.getElementById("swiss");
swissClick.addEventListener("click", function(event)
																		 {
																		 	event.preventDefault();
																			swissShow.style.display = "inline";
																		 }, false);