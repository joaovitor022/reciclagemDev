public class Cliente extends Contas{

private String nome;
private String sobrenome;
private int cpf;

public Cliente(String nome, String sobrenome, int cpf, String e_mail, String senha, String endereco){
super(e_mail, senha, endereco);

this.nome = nome;
this.sobrenome = sobrenome;
this.cpf = cpf;

}

public String getNome(){
return nome;  
}
  public void setNome(String nome){
  this.nome = nome;  
  }

public String getSobreNome(){
return sobreNome;  
}
  public void setSobreNome(String sobreNome){
  this.sobreNome = sobreNome;  
  }

public int getCpf(){
return cpf;  
}
  public void setCpf(int cpf){
  this.cpf = cpf;  
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