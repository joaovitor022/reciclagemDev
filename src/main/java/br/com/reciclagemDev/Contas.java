public class Contas{

private String e_mail;
private String senha; 
private String endereco;

public Contas(String e_mail, String senha, String endereco){
this.e_mail = e_mail;
this.senha = senha;
this.endereco = endereco;
    
  }
  public String getSE_mail(){
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