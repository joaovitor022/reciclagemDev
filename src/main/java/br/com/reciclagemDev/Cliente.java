public class Cliente extends Contas{

private String nome;
private String sobreNome;
private int cpf;

public Cliente(String nome, String sobreNome, int cpf, String email, String senha, String endereco){
super(email, senha, endereco);

this.nome = nome;
this.sobreNome = sobreNome;
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
 





}