<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="desciption" content="Projeto PI-Reciclagem">
        <link rel="stylesheet" href="../css/main.css">
        <link rel="stylesheet" href="../css/Login.css">

        <link rel="shortcut icon" href="../Imagens/Logo/icone-logo1.png" type="image/x-icon">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Inter&display=swap" rel="stylesheet">
        <title>Login</title>
    </head>
        <body>
            <header>
                <div class="image">
                    <a href="../index.html"><img src="../Imagens/Logo/icone-logo1.png" alt="Ícone"> </a>
                </div>
            </header>
                    <main>
                        <div class="message">${requestScope.message}</div>

                        <section class="tela-login">
                            <div class="btns">
                                <button onclick="mostrarUsuario()" class="btn-usuario">Usuário</button>
                                <button onclick="mostrarEmpresa()" class="btn-empresa">Empresa</button>
                            </div>
                                <div class="usuario">
                                    <h2>Login</h2>
                                    <form action="/loginUs" method="post">
                                        <label for="email">Email:</label>
                                        <input type="text" id="email" name="email" required>
                                    
                                        <label for="senha">Senha:</label>
                                        <input type="password" id="senha" name="senha" required>
                                    
                                        <button type="submit">Entrar</button>
                                    </form>
                                    <div class="registro">
                                        <p>Não possui login?</p>
                                        <a href="../pages/Cadastro.html"><button type="button">Registrar-se</button></a>
                                    </div>
                                </div>
                                <div class="empresa">
                                    <h2>Login</h2>
                                    <form action="/loginEm" method="post">
                                        <label for="email">Email:</label>
                                        <input type="text" id="email" name="email" required>
                                    
                                        <label for="senha">Senha:</label>
                                        <input type="password" id="senha" name="senha" required>
                                    
                                        <button type="submit">Entrar</button>
                                    </form>
                                    <div class="registro">
                                        <p>Não possui login?</p>
                                        <a href="../pages/Cadastro.html"><button type="button">Registrar-se</button></a>
                                    </div>
                                </div>
                        </section>
                    </main>
                    <div class="direitos">
                        <p>&copy;2023 ReciclaDev. todos os direitos reservados.</p>
                    </div>
                    <script src="../js/front.js"></script>
        </body>
</html>