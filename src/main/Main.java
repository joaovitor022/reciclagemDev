import java.util.*;

class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  Random rng = new Random();
  Metodos func = new Metodos();
    
  int escolha = 0;
  boolean sair = false;
  String e_mail;
  String senha;
  String nome;
  String sobrenome;
  String endereco;
  int cpf;
  String idConta;
  String nomeEmpresa;
  int cnpj;
    
while(sair != true){
  escolha = 0;
  while (escolha != 1 && escolha !=2 && sair != true){
  
    try{
    System.out.println("1.Login");
    System.out.println("2.Cadastro");
    System.out.println("3.Sair");
    System.out.print("- "); 
    escolha = input.nextInt();
    
      if(escolha == 1 && func.isEmpty() == false){
      System.out.print("E-mail: ");
      e_mail = input.next();
      System.out.print("senha: ");
      senha = input.next();
      sair = func.verificarLogin(e_mail, senha);
      }
        
      else if(escolha == 2){
      boolean s = false;
      System.out.print("1.Usuario Comum");
      System.out.print("2.Funcionário");
      System.out.print("3.sair");
      int c = input.nextInt();
        while(c != 1 && c !=2 && s != true){
          if(c == 1){
          System.out.print("informe seu nome");
          nome = input.nextLine();
            
          System.out.print("informe seu sobrenome");
          sobrenome = input.nextLine(); 
            
          System.out.print("informe seu CPF");
          cpf = input.nextInt();
            
          System.out.print("informe seu E_mail");
          e_mail = input.next(); 
            
          System.out.print("informe sua senha");
          senha = input.next();
            
          System.out.print("informe seu endereço"); 
          endereco = input.nextLine();           
          Cliente usuarioComum = new Cliente(nome, sobrenome, cpf, e_mail, senha, endereco);
          }
        else if (c == 2){
          System.out.print("informe o nome da empresa");
          nomeEmpresa = input.nextLine();

          System.out.print("informe o CNPJ");
          cnpj = input.nextInt(); 

          System.out.print("informe seu E-mail");
          e_mail = input.next();

          System.out.print("informe sua senha");
          senha = input.next(); 

          System.out.print("informe o endereço da empresa");
          endereco = input.next();
          Funcionario funcionario = new Funcionario(cnpj, nomeEmpresa, e_mail, senha, endereco);
        }
          else if(escolha == 3){
            sair = true; 
            escolha = 2;
            }
        } 
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