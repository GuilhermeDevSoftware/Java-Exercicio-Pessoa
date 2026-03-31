 
package atividade_pessoa;

public class Atividade_Pessoa {

    
    public static void main(String[] args) {
     Pessoa p1 = new Pessoa("Guilherme", "482.958.838-10");   
     p1.idade = 27;
    
     p1.status();
     p1.fazerAniversario();
     p1.status();
     
     Funcionario f1 = new Funcionario(
        12,
        "12/10/2020",
        4800,
        "Rodrigo",
        "123.456.789-00"
    );
     
    f1.status();
     
     Professor prof1 = new Professor(
        40,              
        "Mestrado",      
        12,              
        "15/10/1924",    
        9800,            
        "Plinio",       
        "123.456.789-00" 
    ) ;
     
    prof1.status(); 
    prof1.alterarCH(30);
    prof1.status();
    
    Administrativo adm1 = new Administrativo(
        "Financeiro",     
        10,               
        "01/01/2022",     
        3000,             
        "Carlos",         
        "111.222.333-44"  
    );
    
    adm1.status();
    adm1.alterSetor("RH");
    adm1.status();
     
}
    
    
    
    
}
