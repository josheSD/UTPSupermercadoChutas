
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleado Registro | Supermercado Tick</title>
        <style>@import"./assets/css/styles.css";</style>
        <style>@import"./assets/css/components/login.css";</style>
        <link rel="icon" type="image/x-icon" href="./assets/img/tick.png">
        <meta name="theme-color" content="#0078D7">
        <meta name='viewport' content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'/>
        <script src="https://kit.fontawesome.com/2fb25d77eb.js" crossorigin="anonymous"></script>
        
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>
    <body class="theme-light" id="body">
        
        <main class="l-auth">

            <section class="l-auth__hero">

                <article class="l-auth__hero-top"></article>
                <article class="l-auth__hero-top-left"> <img src="./assets/img/tick.png"> </article>
                <article class="l-auth__hero-bottom"></article>

            </section>

            <section class="l-auth__content">

                <article>

                    <aside>
                        <p class="title">Bienvenido al Sistema de</p>
                        <p class="subtitle">Supermercado <span>Tick</span></p>
                        <img src="./assets/img/login/laptop-erp.png" alt="laptop">
                    </aside>

                </article>

            </section>

            <section class="l-auth__login">

                <!-- START REGISTER EMPLEADO -->
                
                <section class="l-login-hero">
                    <img src="./assets/img/tick.png" alt="logo">
                </section>

                <main class="l-login">

                    <section class="l-login__title">

                        <h1> Registrar Empleado </h1>

                    </section>

                    <section class="l-login__content">

                        <form method="post" action="EmpleadoControl" >
                            <div class="container">
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input id="cod" name="cod" type="text" class="validate">
                                        <label for="cod">Codigo</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input id="nom" name="nom" type="text" class="validate">
                                        <label for="nom">Nombre</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input id="tip" name="tip" type="text" class="validate">
                                        <label for="tip">Tipo</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input id="usu" name="usu" type="text" class="validate">
                                        <label for="usu">Usuario</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input id="pas" name="pas" type="password" class="validate">
                                        <label for="pas">Password</label>
                                    </div>
                                </div>
                            </div>
                            
                            <button type="submit" class="btn-session" id="btn-session">
                                <p>Crear</p>
                            </button>
                            
                            <a href="./Login.jsp" class="aviso-regitro">Volver</a>

                        </form>
                    </section>

                </main>
                <!-- START REGISTER EMPLEADO -->

            </section>

        </main>
        
    </body>
</html>
