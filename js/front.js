
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