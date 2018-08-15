var us_ex = document.getElementById("US");
var euro_ex = document.getElementById("Euro");
var output = document.getElementById("output");
var currency_Conv = document.getElementById("euro_ex");
currency_Conv.addEventListener("submit", function(event)
																				 {
																				  var exchange = document.getElementById("money_Ex").value;
																					event.preventDefault();
																					 if(us_ex.checked)
																					 {
																					  exchange *= 19.940610;
																						output.innerHTML = exchange.toFixed(2) + " Peso";
																					 }
																					 else
																					 {
																					  exchange *= 0.050138;
																						output.innerHTML = exchange.toFixed(2) + " U.S Dollars";
																					 }
																				 }, false);
var resetNow = document.getElementById("resetBTN");
resetNow.addEventListener("click", function(event)
																{
																 output.innerHTML = "";
																}, false);
