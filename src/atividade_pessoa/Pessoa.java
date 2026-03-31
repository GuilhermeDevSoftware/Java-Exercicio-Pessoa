package atividade_pessoa;


public class Pessoa {
    public String nome;
    private String RG;
    private String CPF;
    public int idade;
    public String sexo;
    private boolean exaluno;

    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void fazerAniversario () {
        setIdade (getIdade() +1);
    }
    
    public void status() {
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("CPF: "+ this.getCPF());
        System.out.println("");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isExaluno() {
        return exaluno;
    }

    public void setExaluno(boolean exaluno) {
        this.exaluno = exaluno;
    }
    
    
    
}
