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
    if (menu.style.display === "block"){
    iconx.src = "../assets/icone-x-bleue.png";
    iconx.style.display="block";
}}

iconx.addEventListener('click', retourne);


function retourne(){
    imagePath ="../assets/icone-x-bleue.png";
    if (menu.style.display === "block" && iconx.src.includes(imagePath)){
        menu.style.display === "none";
        iconx.src = "../assets/burger.png";
    }
}


  


    
    
    


