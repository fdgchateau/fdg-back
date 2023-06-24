
let tl = gsap.timeline();

tl.from('.logo, .menu',{
    duration: 0.75,
    opacity:0
})

tl.from('.slidefdg h1',{
  duration:0.75,
  opacity:0,
  x:'100%',
  
})
tl.from('.button',{
    duration:0.75,
    opacity:0,
    x:'100%',
    
  })






  






// récupération de l'ensemble des images
let img_slider = document.getElementsByClassName('img_slider');

// attribution de la valeur à la première image
let etape = 0;// affichage 1ère image

let nbr_img = img_slider.length; // nombre d'images dans le slider

let precedent = document.querySelector('.precedent');
let suivant = document.querySelector('.suivant');

//Lors de chaque clique, désactive l'image précédente
function enleverActiveImages(){
    for (let i=0; i < nbr_img; i++){
        img_slider[i].classList.remove('active'); //rechercher à l'intérieur mes images et je supprime celle indiquée comme active
    }
}

//Permet d'activer le bouton droit du slider
suivant.addEventListener('click', function(){
    etape++;
    if(etape >=nbr_img){
        etape = 0;
    }
    enleverActiveImages();
    img_slider[etape].classList.add('active');
})
 
//Permet d'activer le bouton gauche du slider
precedent.addEventListener('click', function(){
    etape--;
    if(etape < 0 ){
        etape = nbr_img -1;
    }
    enleverActiveImages();
    img_slider[etape].classList.add('active');
})

//Permet de faire défiler automatiquement après 3 secondes
setInterval(function(){
    etape++;
    if(etape >=nbr_img){
        etape = 0;
    }
    enleverActiveImages();
    img_slider[etape].classList.add('active');
},3000)








