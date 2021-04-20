<%-- 
    Document   : Admin
    Created on : 20/04/2021, 12:18:20 AM
    Author     : Jose
--%>

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

                    <p>Supermercado</p> <span>/</span> <p>Tick - Dashboad...</p>

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
                    <p>Supermercado Tick</p>
                </article>

                <article class="l-navbar-profile__logout">
                    <p id="sign-out">Sign out</p>
                </article>

                <article class="l-navbar-profile__info">

                    <aside class="l-navbar-profile__info-hero">

                        <img src="./assets/img/admin/user.png"> 

                    </aside>

                    <aside class="l-navbar-profile__info-user">
                        <h2>Jose Chutas Ramos</h2>
                        <p>jose@gmail.com</p>
                        <p>View account</p>
                        <p>Switch directory</p>
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
                                    <a>
                                        <span>
                                            <img src="./assets/img/sidebar/01-analysis.svg" alt="modulo">
                                        </span>
                                        <span class="module-parrafo">
                                            Dashboard
                                        </span>
                                    </a>
                                </div>

                            </section>

                            <section class="modules">

                                <div class="modules__main">
                                    <a href="javascript:void(0)" routerLinkActive="active">
                                        <span>
                                            <img src="./assets/img/sidebar/02-increase.svg" alt="modulo">
                                        </span>
                                        <span class="module-parrafo">
                                            Ventas
                                        </span>
                                    </a>
                                </div>
                                <div class="modules__sub">
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            Cotización a Clientes
                                        </span>
                                    </a>
                                </div>

                            </section>

                            <section class="modules">

                                <div class="modules__main">
                                    <a href="javascript:void(0)">
                                        <span>
                                            <img src="./assets/img/sidebar/05-packing.svg" alt="modulo">
                                        </span>
                                        <span class="module-parrafo">
                                            Almacén
                                        </span>
                                    </a>
                                </div>
                                <div class="modules__sub">
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            Cotizaciones
                                        </span>
                                    </a>
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            Proformas
                                        </span>
                                    </a>
                                </div>

                            </section>

                            <section class="modules">

                                <div class="modules__main">
                                    <a href="javascript:void(0)">
                                        <span>
                                            <img src="./assets/img/sidebar/11-wrench.svg" alt="modulo">
                                        </span>
                                        <span class="module-parrafo">
                                            Mantenimiento
                                        </span>
                                    </a>
                                </div>
                                <div class="modules__sub">
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            Solicitudes de Compra
                                        </span>
                                    </a>
                                    <a>
                                        <span>
                                            <i class="fab fa-shirtsinbulk"></i>
                                        </span>
                                        <span class="module-parrafo">
                                            Órdenes de Compra
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
                <main class="l-dashboard">

                    <section class="l-dashboard__title l-wrapper">
                        <img src="./assets/img/admin/proyecto.png" />
                        <h1> Tick - Sistema</h1>
                    </section>

                    <section class="l-dashboard__content">
                        <p>
                            Bienvenido al sistema
                        </p>
                    </section>

                </main>

            </section>
            <!-- END SIDEBAR -->

        </main>
        
        
        <script type="text/javascript" src="./assets/js/admin.js">
        </script>
    </body>
</html>
