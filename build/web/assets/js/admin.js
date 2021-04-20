
document.addEventListener("DOMContentLoaded", function(event) {
    
    // Your code to run since DOM is loaded and ready
    console.log('READY');
    document.getElementById('check-theme').addEventListener("click",() =>{
        var body = document.getElementById('body');
        if(body.classList.contains('theme-dark')){
          body.classList.remove('theme-dark');
          body.classList.add('theme-light');
        }else{
          body.classList.remove('theme-light');
          body.classList.add('theme-dark');
        }
    });
    
    document.getElementById('user-photo').addEventListener("click",() =>{
        var navbarProfile= document.getElementById('navbar-profile');
        navbarProfile.classList.toggle('open');
    });
    
    document.getElementById('sign-out').addEventListener("click", () =>{
        window.location="http://localhost:8084/SupermercadoChutas/index.htm";
    });
    
    document.getElementById('l-hamburguer').addEventListener("click", () =>{
        
        var sidebar = document.getElementById('sidebar');
        var portal = document.getElementById('portal');
        if(sidebar.classList.contains('open')){
          sidebar.classList.remove('open');
          setTimeout(() => portal.classList.remove('open'),300);
        }else{
          sidebar.classList.add('open');
          portal.classList.add('open');
        }
        
    });
    
    document.getElementById('portal').addEventListener("click", () =>{
        var sidebar = document.getElementById('sidebar');
        var portal = document.getElementById('portal');
        if(sidebar.classList.contains('open')){
          sidebar.classList.remove('open');
          setTimeout(() => portal.classList.remove('open'),300);
        }else{
          sidebar.classList.add('open');
          portal.classList.add('open');
        } 
    });
    
    document.getElementById('sidebar-bottom-angle').addEventListener("click",() =>{
        
        var sidebar = document.getElementById('sidebar');
        var main = document.getElementById('main');
        var parrafo = document.querySelectorAll('.module-parrafo');

        var icons_span = document.querySelector('.w-sidebar__icons span');
        var icons_firs = document.querySelector('.w-sidebar__icons .first');
        var icons_second = document.querySelector('.w-sidebar__icons .second');

        sidebar.classList.toggle('expanded');
        main.classList.toggle('expanded');
        parrafo.forEach(x => x.classList.toggle('expanded'));

        icons_span.classList.toggle('expanded');
        icons_firs.classList.toggle('expanded');

        if(icons_second.classList.contains('expanded')){
          icons_second.classList.replace(icons_second.classList[1],'fa-angle-double-left');
          icons_second.classList.remove('expanded');
        }else{
          icons_second.classList.replace(icons_second.classList[1],'fa-angle-double-right');
          icons_second.classList.add('expanded');
        }
    
    });

});


