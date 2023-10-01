//Funções dos botões do cadastro
function mostrarEmpresa(){
    document.querySelector('.usuario').style.display = 'none';
    document.querySelector('.empresa').style.display = 'flex';

    document.querySelector('.btn-empresa').style.color = '#0db0b8';
    document.querySelector('.btn-empresa').style.border = '2px solid #0db0b8';
    document.querySelector('.btn-empresa').style.backgroundColor = '#ffffff';

    document.querySelector('.btn-usuario').style.color = '#ffffff';
    document.querySelector('.btn-usuario').style.backgroundColor = '#0db0b8';
}
function mostrarUsuario(){
    document.querySelector('.empresa').style.display = 'none';
    document.querySelector('.usuario').style.display = 'flex';

    document.querySelector('.btn-usuario').style.color = '#0db0b8';
    document.querySelector('.btn-usuario').style.border = '2px solid #0db0b8';
    document.querySelector('.btn-usuario').style.backgroundColor = '#ffffff';

    document.querySelector('.btn-empresa').style.color = '#ffffff';
    document.querySelector('.btn-empresa').style.backgroundColor = '#0db0b8';
}

//Funções dos botões da página inicial
document.querySelector('.login').addEventListener('mouseover', hoverLogin);
document.querySelector('.cadastro').addEventListener('mouseover', hoverCadastro);
document.querySelector('.login').addEventListener('mouseout', hoverLoginOut);
document.querySelector('.cadastro').addEventListener('mouseout', hoverCadastroOut);
function hoverLogin() {
    document.querySelector('.login').style.backgroundColor = '#38b6ff';
    document.querySelector('.login').style.color = '#ffffff';
    document.querySelector('.cadastro').style.backgroundColor = '#ffffff';
    document.querySelector('.cadastro').style.color = '#38b6ff';
}
function hoverCadastro() {
    document.querySelector('.cadastro').style.backgroundColor = '#38b6ff';
    document.querySelector('.cadastro').style.color = '#ffffff';
    document.querySelector('.login').style.backgroundColor = '#ffffff';
    document.querySelector('.login').style.color = '#38b6ff';
}
function hoverLoginOut() {
    document.querySelector('.login').style.backgroundColor = '';
    document.querySelector('.login').style.color = '';
    document.querySelector('.cadastro').style.backgroundColor = '';
    document.querySelector('.cadastro').style.color = '';
}
function hoverCadastroOut() {
    document.querySelector('.cadastro').style.backgroundColor = '';
    document.querySelector('.cadastro').style.color = '';
    document.querySelector('.login').style.backgroundColor = '';
    document.querySelector('.login').style.color = '';
}