import java.util.*;

public class Metodos{
HashMap<String, String> conta = new HashMap<>();

public boolean isEmpty(){
return this.conta.isEmpty();
}

public void cadastroPessoa(Cliente usuarioComum){
this.conta.put(usuarioComum.getEmail(), usuarioComum.getSenha());  
System.out.println("conta cadastrada"); 
}

public void cadastroEmpresa(){
  
}

public boolean verificarLogin(String email, String senha){
Scanner input = new Scanner(System.in);
  
boolean verif = false;
  
  while(verif != true){
    if(this.conta.containsKey(email)){
      if(this.conta.get(email).equals(senha)){
      verif = true;
      }
    }  
    else{
    try{
    System.out.println("email ou senha inválido, tente novamente");
    System.out.println("email: ");
    email = input.next();
    System.out.println("senha: ");
    senha = input.next();
    verif = false;
    }
    catch(Exception e){
    input.next();  
    }
    }
  }
  return true;
}



  
}