public class Cliente extends Contas{

String nome;
String sobrenome;
int cpf;

public Cliente(String nome, String sobrenome, int cpf, String e_mail, String senha, String endereco){
super(e_mail, senha, endereco);

this.nome = nome;
this.sobrenome = sobrenome;
this.cpf = cpf;

}


}