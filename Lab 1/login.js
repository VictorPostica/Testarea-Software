function validate(){
var username = document.getElementById("username").value
var password = document.getElementById("password").value;
if ( username == "victor" && password == "victor123")
{
window.open('victor.html');
}
else{
alert ("ID sau parola gresita!!");
}
}
