<%-- 
    Document   : ArticuloListaGui
    Created on : 11/05/2021, 09:08:41 PM
    Author     : Jose
--%>

<%@page import="vista.ArticuloPresentador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard | Supermercado Tick</title>
        <style>@import"./assets/css/styles.css";</style>
        <link rel="icon" type="image/x-icon" href="./assets/img/tick.png">
        <meta name="theme-color" content="#0078D7">
        <meta name='viewport' content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'/>
        <script src="https://kit.fontawesome.com/2fb25d77eb.js" crossorigin="anonymous"></script>
        
        
        <!-- BOOSTSTRAP -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

    </head>
    <body class="theme-light" id="body">
        
        <main class="l-admin" id="admin">
            
            <!-- START NAVBAR -->
            <section class="l-navbar" id="navbar">
                <article class="l-navbar__icon">

                    <aside class="l-hamburguer" id="l-hamburguer">
                        <div class="hamburger hamburger--slider" id="hamburger">
                            <span class="hamburger__box">
                                <span class="hamburger__inner"></span>
                            </span>
                        </div>
                    </aside>

                    <img src="./assets/img/tick.png">

                </article>
                <article class="l-navbar__main">

                    <p class="mb-0">Supermercado</p> <span>/</span> <p class="mb-0">Tick - Dashboad...</p>
                    

                </article>
                <article class="l-navbar__options">

                    <div class="l-toggle-theme">
                        <div>
                            <input type="checkbox" class="checkbox" id="check-theme" />
                            <label class="label" for="check-theme">
                                <i class="fas fa-moon"></i>
                                <i class="fas fa-sun"></i>
                                <div class="ball"></div>
                            </label>
                        </div>
                    </div>

                </article>
                <article class="l-navbar__hero">
                    <img src="./assets/img/admin/user.png" id="user-photo"> 
                </article>
            </section>

            <section class="l-navbar-profile" id="navbar-profile">

                <article class="l-navbar-profile__name">
                    <p class="mb-0" >Supermercado Tick</p>
                </article>

                <article class="l-navbar-profile__logout">
                    <p class="mb-0" id="sign-out">Sign out</p>
                </article>

                <article class="l-navbar-profile__info">

                    <aside class="l-navbar-profile__info-hero">

                        <img src="./assets/img/admin/user.png"> 

                    </aside>

                    <aside class="l-navbar-profile__info-user">
                        <% Object[]fil = (Object[])session.getAttribute("fil"); %>
                        <h2 class="mb-0"> <%= fil[0] %> </h2>
                        <p class="mb-0" > <%= fil[1] %> </p>
                        <p class="mb-0" >View account</p>
                        <p class="mb-0" >Switch directory</p>
                    </aside>

                </article>

            </section>
            <!-- END NAVBAR -->

            <section class="l-portal" id="portal">

            </section>
            
            <!-- START SIDEBAR -->
            <section class="l-sidebar" id="sidebar">
                <main class="w-sidebar">

                    <article class="w-sidebar__title">
                        <a href="javascript:void(0)">
                            <span>
                                <img src="./assets/img/admin/proyecto.png" /> 
                            </span>
                            <span class="module-parrafo">
                                Supermercado Tick - Sist...
                            </span>
                        </a>
                    </article>

                    <article class="w-sidebar__separator top">
                    </article>

                    <article class="w-sidebar__modules">

                            <section class="modules">

                                <div class="modules__main">
                                    <a href="Admin.jsp">
                                        <span>
                                            <img src="./assets/img/sidebar/01-analysis.svg" alt="modulo">
                                        </span>
                                        <span class="module-parrafo">
                                            Dashboard
                                        </span>
                                    </a>
                                </div>

                            </section>

                            <section class="modules" id="module-empleado">

                                <div class="modules__main">
                                    <a href="javascript:void(0)">
                                        <span>
                                            <img src="./assets/img/sidebar/08-id_card.svg" alt="modulo">
                                        </span>
                                        <span class="module-parrafo">
                                            Empleado
                                        </span>
                                    </a>
                                </div>
                                <div class="modules__sub">
                                    <a href="EmpleadoBuscar.jsp">
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            Buscar
                                        </span>
                                    </a>
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            <form action="EmpleadoControl" method="post">
                                                <input type="submit" class="btn btn-link p-0 text-dark" name="acc" value="Listar">
                                            </form>
                                        </span>
                                    </a>
                                </div>

                            </section>

                            <section class="modules" id="module-cliente">

                                <div class="modules__main">
                                    <a href="javascript:void(0)">
                                        <span>
                                            <img src="./assets/img/sidebar/08-id_card.svg" alt="modulo">
                                        </span>
                                        <span class="module-parrafo">
                                            <form action="EmpleadoControl">
                                                Cliente
                                            </form>
                                        </span>
                                    </a>
                                </div>
                                <div class="modules__sub">
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            Buscar
                                        </span>
                                    </a>
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            Listar
                                        </span>
                                    </a>
                                </div>

                            </section>

                            <section class="modules" id="module-proveedor" >

                                <div class="modules__main">
                                    <a href="javascript:void(0)">
                                        <span>
                                            <img src="./assets/img/sidebar/08-id_card.svg" alt="modulo">
                                        </span>
                                        <span class="module-parrafo">
                                            Proveedor
                                        </span>
                                    </a>
                                </div>
                                <div class="modules__sub">
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            Buscar
                                        </span>
                                    </a>
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            Listar
                                        </span>
                                    </a>
                                </div>

                            </section>

                            <section class="modules" id="module-articulo" >

                                <div class="modules__main">
                                    <a href="javascript:void(0)">
                                        <span>
                                            <img src="./assets/img/sidebar/05-packing.svg" alt="modulo">
                                        </span>
                                        <span class="module-parrafo">
                                            Articulo
                                        </span>
                                    </a>
                                </div>
                                <div class="modules__sub">
                                    <a href="ArticuloRegistro.jsp">
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            Crear
                                        </span>
                                    </a>
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            <form action="ArticuloControl" method="post" >
                                                <input type="submit" class="btn btn-link p-0 text-dark" name="acc" value="Listar"/>
                                            </form>
                                        </span>
                                    </a>
                                </div>

                            </section>

                            <section class="modules" id="module-pedido" >

                                <div class="modules__main">
                                    <a href="javascript:void(0)">
                                        <span>
                                            <img src="./assets/img/sidebar/12-settings.svg" alt="modulo">
                                        </span>
                                        <span class="module-parrafo">
                                            Nota Pedido
                                        </span>
                                    </a>
                                </div>
                                <div class="modules__sub">
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            <form action="PedidoControl" method="post" >
                                                <input type="hidden" name="cod" value="<%= fil[0] %>" >
                                                <input type="submit" class="btn btn-link p-0 text-dark" name="acc" value="Nuevo"/>
                                            </form>
                                        </span>
                                    </a>
                                </div>

                            </section>
                                                
                            
                            <section class="modules" id="module-compra" >

                                <div class="modules__main">
                                    <a href="javascript:void(0)">
                                        <span>
                                            <img src="./assets/img/sidebar/12-settings.svg" alt="modulo">
                                        </span>
                                        <span class="module-parrafo">
                                            Orden Compra
                                        </span>
                                    </a>
                                </div>
                                <div class="modules__sub">
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            <form action="CompraControl" method="post">
                                                <input type="hidden" name="cod" value="<%= fil[0] %>" >
                                                <input type="submit" class="btn btn-link p-0 text-dark" name="acc" value="Nuevo"/>
                                            </form>
                                        </span>
                                    </a>
                                </div>

                            </section>

                    </article>

                    <article class="w-sidebar__separator bottom">
                    </article>

                    <article class="w-sidebar__icons">

                        <i class="fa fa-cog first"></i>
                        <span>Project settings</span>
                        <i class="fas fa-angle-double-left second" id="sidebar-bottom-angle"></i>

                    </article>


                </main>
            </section>
            <!-- END SIDEBAR -->
            
            <!-- START MAIN -->
            <section class="l-main" id="main">
                <main class="l-articulo-lista">

                    
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-5 py-3">
                                <p>Lista de Articulos</p>
                                <% ArticuloPresentador artPre = (ArticuloPresentador) session.getAttribute("artPre"); %>
                                <table class="table table-hover">
                                    <tr class="table-primary">
                                        <td>
                                            Codigo
                                        </td>
                                        <td>
                                            Nombre
                                        </td>
                                        <td>
                                            Precio
                                        </td>
                                        <td>
                                            Stock
                                        </td>
                                        <td></td>
                                    </tr>
                                    <% for(int i=1; i<artPre.getLis().size();i++){ %>
                                    <% Object[]f = (Object[])artPre.getLis().get(i); %>
                                    <tr>
                                        <form action="ArticuloControl" method="post">
                                            <td>
                                                <input type="text" size="5" name="cod" value="<%= f[0] %>" />
                                            </td>
                                            <td>
                                                <input type="text" size="5" name="nom" value="<%= f[1] %>" />
                                            </td>
                                            <td>
                                                <input type="text" size="5" name="pre" value="<%= f[2] %>" />
                                            </td>
                                            <td>
                                                <input type="text" size="5" name="sto" value="<%= f[3] %>" />
                                            </td>
                                            <td>
                                                <input type="submit" class="btn btn-danger" name="acc" value="Quitar" />
                                            </td>
                                        </form>
                                    </tr>
                                    <% } %>
                                </table>
                            </div>
                        </div>
                    </div>
                    
                </main>

            </section>
            <!-- END SIDEBAR -->

        </main>
        
        <script type="text/javascript" src="./assets/js/admin.js">
        </script>
    </body>
</html>
