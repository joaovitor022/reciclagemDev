import java.ArrayList;
public class Cadastros{

public ArrayList armazenarContas(String E_mail, String senha, ArrayList cadastros){
cadastros.add(E_mail, senha);   
return cadastros; 
}

}