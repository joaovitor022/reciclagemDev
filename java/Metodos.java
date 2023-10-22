import java.util.*;

public class Metodos{
HashMap<String, String> conta = new HashMap<>();

public boolean adicionarConta(String e_mail, String senha){
this.conta.put(e_mail, senha);  
System.out.println("conta cadastrada");
return false;
  
}

public boolean verificarLogin(String e_mail, String senha){
Scanner input = new Scanner(System.in);
  
boolean verif = false;
  
  while(verif != true){
    if(this.conta.containsKey(e_mail)){
      if(this.conta.get(e_mail).equals(senha)){
      verif = true;
      }
    }  
    else{
    System.out.println("e_mail ou senha inválido, tente novamente");
    System.out.println("e_mail: ");
    e_mail = input.next();
    System.out.println("senha: ");
    senha = input.next();
    verif = false;
    }
  }
  return true;
}


  
}