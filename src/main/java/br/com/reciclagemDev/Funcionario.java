public class Funcionario extends Contas{

private int cnpj;
private String nomeEmpresa;

public Funcionario(int cnpj, String nomeEmpresa, String email, String senha, String endereco){
super(email, senha, endereco);

this.cnpj = cnpj;
this.nomeEmpresa = nomeEmpresa;

 }

public int getCnpj(){
return cnpj;  
}
  public void setCnpj(int cnpj){
  this.cnpj = cnpj;  
  }

public String getNomeEmpresa(){
return nomeEmpresa;  
}
  public void setNomeEmpresa(String nomeEmpresa){
  this.nomeEmpresa = nomeEmpresa;  
  }


}

