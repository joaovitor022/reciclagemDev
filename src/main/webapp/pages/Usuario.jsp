<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="desciption" content="Projeto PI-Reciclagem">
        <link rel="stylesheet" href="../css/main.css">
        <link rel="stylesheet" href="../css/Usuario.css">

        <link rel="shortcut icon" href="../Imagens/Logo/icone-logo1.png" type="image/x-icon">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Inter&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>ReciclagemDev</title>
</head>

<body>
    <header>
        <img src="../Imagens/Logo/lixo eletronico about.png"
            alt="Logo simbolo de reciclagem com circuitos eletrônicos">

        <ul>
            <a href="../index.html">
                <li>Home</li>
            </a>
            <a href="../pages/Informativo_Lixo.html">
                <li>Tipos de lixo</li>
            </a>
            <a href="">
                <li>Opção 3</li>
            </a>
        </ul>


        <form action="/logout">
            <div class="buttons">
                <button class="cadastro">Sair</button>
            </div>
        </form>
        <c:if test="${not empty sessionScope.loggedUser}">
            <p>Bem-vindo,</p>
            <p>${sessionScope.nomeUser}</p>
        </c:if>
    </header>
    <main>
        <img id="loginem1" src="../Imagens/Empresa/Imagemlogin1.svg" alt="Login empresa">
        <div class="cabe">
            <div class="perfil">
            <h1>${sessionScope.nomeUser} ${sessionScope.sobrenomeUser}</h1>
        </div>
            <span class="placeholder w-75"> </span>
            <img id="bell" src="../Imagens/Empresa/BEll.svg" alt="Bell">
        </div>

        <form action="/delete-account-us" method="post">
            <div class="button-delete">
                <button>Deletar conta</button>
            </div>
        </form>

        <div class="form">
            <h1>Que tal realizar uma nova reciclagem?</h1>
            <form action="/post" method="post"> <!--enctype="multipart/form-data"-->
                <label for="material">Qual o material?</label>
                <select id="material" name="material">
                    <option value="plastico">Plástico</option>
                    <option value="metal">Metal</option>
                    <option value="papel">Papel</option>
                    <option value="vidro">Vidro</option>
                    <option value="outros">Outros</option>
                </select>
        
                <label for="peso">Peso aproximado (Kg)</label>
                <input type="number" id="peso" name="peso" placeholder="Kg" step="0.01" required>
        
                <label for="descricao">Descrição do anúncio</label>
                <textarea id="descricao" name="descricao" rows="4" maxlength="300" placeholder="Descrição do anúncio (limite de 300 caracteres)"></textarea>
        
                <!--<label for="imagens">Adicionar imagens (png ou jpeg)</label>
                <input type="file" id="imagens" name="imagens" accept=".png, .jpeg" multiple>-->
        
                <input type="submit" value="Enviar Anúncio">
            </form>
        </div>
    </main>
    
    <footer>
        <div class="listas">
            <ul>
                <p>Lista 1</p>
                <a href=""> <li>item 1</li> </a>
                <a href=""><li>item 2</li> </a>
                <a href=""><li>item 3</li></a>
            </ul>
    
            <ul>
                <p>Lista 2</p>
                <a href=""> <li>item 1</li> </a>
                <a href=""><li>item 2</li> </a>
                <a href=""><li>item 3</li></a>
            </ul>
    
            <ul>
                <p>Lista 3</p>
                <a href=""> <li>item 1</li> </a>
                <a href=""><li>item 2</li> </a>
                <a href=""><li>item 3</li></a>
            </ul>
        </div>
    </footer>
        <div class="direitos">
            <p>&copy;2023 ReciclaDev. todos os direitos reservados.</p>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
