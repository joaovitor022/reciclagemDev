public class Contas{

private String email;
private String senha; 
private String endereco;

public Contas(String email, String senha, String endereco){
this.email = email;
this.senha = senha;
this.endereco = endereco;
    
  }
  public String getEmail(){
  return email;  
  }
   public void setEmail(String email){
    this.email = email;  
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