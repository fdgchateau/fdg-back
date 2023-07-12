let ti = gsap.timeline();


ti.from('.actions-title h1',{
    duration:0.75,
    opacity:0,
    x:'100%',
    
  });

  ti.from('.actions-title h3',{
    duration:0.75,
    opacity:0,
    x:'100%',
    
  });

  ti.from('.actions-top',{
    duration:0.75,
    opacity:0,
    x:'-100%',
    
  });

  ti.from('.commentaire h3',{
    duration:0.75,
    opacity:0,
    x:'100%',
    
  });



  window.addEventListener('scroll', function() {
    document.getElementById('showScroll').innerHTML = window.scrollY + 'px';
  });


  