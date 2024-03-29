<%-- 
    Document   : PedidoGui
    Created on : 11/05/2021, 08:53:40 PM
    Author     : Jose
--%>

<%@page import="vista.PedidoPresentador"%>
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
                <main class="l-pedido">

                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-7 py-3">

                                <p class="h5 mb-3">Nota de Pedido</p>
                                <% PedidoPresentador pedPre = (PedidoPresentador) session.getAttribute("pedPre"); %>
                                <%! String tot; %>
                                <table>
                                    <% Object[]f1 = pedPre.getFil(); %>
                                    <% tot=f1[2].toString(); %>
                                    <tr>
                                        <td>
                                            Numero
                                        </td>
                                        <td>
                                            <input class="d-inline-block ml-3 mb-3" type="text" size="10" value='<%= f1[0] %>' />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Fecha
                                        </td>
                                        <td>
                                            <input class="d-inline-block ml-3 mb-3" type="text" size="10" value='<%= f1[1] %>' />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Empleado
                                        </td>
                                        <td>
                                            <input class="d-inline-block ml-3" type="text" size="10" value='<%= f1[3] %>' />
                                        </td>
                                    </tr>
                                </table>

                                <table class="mt-3">
                                    <% Object[]f3 = pedPre.getFil2(); %>
                                    <tr>
                                        <form action="PedidoControl" method="post">
                                            <td>Ingrese codigo cliente<td>
                                            <td><input class="ml-2" placeholder="C001" type="text" name="cod" size="10" value="<%= f3[0] %>"/></td>
                                            <td><input class="d-inline-block btn mx-3 btn-primary" type="submit" name="acc" value="Buscar" /><td>
                                            <td>Cliente nombre</td>
                                            <td><input class="ml-2" type="text" name="nom" size="30" value="<%= f3[1] %>" /></td>
                                        </form>
                                    </tr>
                                </table>

                                <table class="table table-hover mt-4 mb-3">
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
                                            Cantidad
                                        </td>
                                        <td>
                                            Importe
                                        </td>
                                        <td></td>
                                    </tr>
                                    <% for(int i=0;i<pedPre.getLis().size();i++){ %>
                                    <% Object[] f2= (Object[])pedPre.getLis().get(i); %>
                                    <% tot=f2[5].toString(); %>
                                    <tr>
                                        <form action="PedidoControl" method="post">
                                            <td>
                                                <input type="text" name="cod" size="5" value="<%= f2[0] %>" />
                                            </td>
                                            <td>
                                                <input type="text" size="10" value="<%= f2[1] %>" />
                                            </td>
                                            <td>
                                                <input type="text" size="5" value="<%= f2[2] %>" />
                                            </td>
                                            <td>
                                                <input type="text" size="5" value="<%= f2[3] %>" />
                                            </td>
                                            <td>
                                                <input type="text" size="5" value="<%= f2[4] %>" />
                                            </td>
                                            <td>
                                                <input type="submit" name="acc" class="btn btn-danger" value="Quitar" />
                                            </td>
                                        </form>
                                    </tr>
                                    <% } %>
                                </table>

                                <table>
                                    <tr>
                                        <td>
                                            <form action="PedidoControl" method="post">
                                                    <input type="hidden" name="cod" value="<%= f3[0] %>"/>
                                                <input type="submit" class="btn btn-primary" name="acc" value="Nuevo" />
                                                <input type="submit" class="btn btn-primary mx-2" name="acc" value="Listar" />
                                                <input type="submit" class="btn btn-primary" name="acc" value="Grabar" />
                                            </form>
                                        </td>
                                        <td>
                                            <span class="d-inline-block ml-4 mr-2">Total:</span> <input type="text" size="5" value="<%= tot %>" />
                                        </td>
                                    </tr>
                                </table>
                                        
                                <div class="row">
                                    <div class="col-3">
                                        <p class="my-2 alert-link"><%= pedPre.getMsg() %></p>
                                    </div>
                                </div>
                                
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
