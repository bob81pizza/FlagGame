/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validateName(){
    
    if(document.nameForm.name.value == ""){
        document.getElementById("error").innerHTML = "Please enter a name to begin the game";
        return false;
    }
    return true;
}

function validateCountry(){
    
    if(document.flagForm.country.value == ""){
        document.getElementById("error").innerHTML = "Please enter a guess";
        return false;
    }
    return true;
}