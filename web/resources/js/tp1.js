var val = document.querySelector("#password");
var conf = document.querySelector("#password2");


function validateForm() {   
    var i = false;
    
    i = (val.value === conf.value) ? true : false;
    
    if(i == false) {
        alert("Falha na confirmação da senha!\n Por favor, confirme a nova senha corretamente.");
    }
    
    return i;
}
