import java.util.*;

class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  Metodos func = new Metodos();
  Contas cont = new Contas();
    
  int escolha = 0;
  boolean sair = false;
  String e_mail;
  String senha;
    
while(sair != true){
  escolha = 0;
  while (escolha != 1 && escolha !=2 && sair != true){
  
    try{
    System.out.println("1.Login");
    System.out.println("2.Cadastro");
    System.out.println("3.Sair");
    System.out.print("- "); 
    escolha = input.nextInt();
    
      if(escolha == 1){
      System.out.print("E-mail: ");
      e_mail = input.next();
      System.out.print("senha: ");
      senha = input.next();
      sair = func.verificarLogin(e_mail, senha);
      }
        
      else if(escolha == 2){
      System.out.print("E-mail: ");
      e_mail = input.next();
      System.out.print("senha: ");
      senha = input.next();
      sair = func.adicionarConta(e_mail, senha);  
      }
        
    else if(escolha == 3){
    sair = true;  
    escolha = 2;
    }
    
    }
    catch(Exception e){
    input.next();
  
    } 
    
   
  } 
}




    
  }
}