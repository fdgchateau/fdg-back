let icon = document.getElementById("icon");
let menu = document.querySelector(".menu");
let button = document.querySelector(".button-live");
let title = document.querySelector(".title");
let iconx = document.getElementById("iconx");
let mainElement = document.querySelector("main");
let responsive = document.getElementsByClassName("menu-responsive");



icon.addEventListener('click', myFunction);

function myFunction() {
  
    menu.style.display = "block";
    if (menu.display === "block"){
    title.style.display = "none";
    icon.style.display = "none";
    /* mainElement.style.marginTop ="200px";
    responsive.backgroundColor ="yellow";
   icon.src ="icon-croix.png";*/
    }

  
}




  


    
    
    


