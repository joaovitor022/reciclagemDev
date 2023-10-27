public class Funcionario extends Contas{

private int cnpj;
private String nomeEmpresa;

public Funcionario(int cnpj, String nomeEmpresa, String e_mail, String senha, String endereco){
super(e_mail, senha, endereco);
  
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

public String getE_mail(){
return e_mail;  
}
  public void setE_mail(String e_mail){
  this.e_mail = e_mail;  
  }

public String getSenha(){
return senha;  
}
  public void setSenha(String senha){
  this.senha = senha;  
  }

public String getEndereco(){
return endereco;  
}
  public void setEndereco(String endereco){
  this.endereco = endereco;  
  }

}

