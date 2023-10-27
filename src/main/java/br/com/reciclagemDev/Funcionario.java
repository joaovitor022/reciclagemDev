public class Funcionario extends Contas{

int cnpj;
String nomeEmpresa;

public Funcionario(int cnpj, String nomeEmpresa, String e_mail, String senha, String endereco){
super(e_mail, senha, endereco);
  
this.cnpj = cnpj;
this.nomeEmpresa = nomeEmpresa;
 
 }
}

