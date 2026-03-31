package atividade_pessoa;


public class Funcionario extends Pessoa{
    public int chapa;
    public String dtAdm;
    private float salario;

    public Funcionario(int chapa, String dtAdm, float salario, String nome, String CPF) {
        super(nome, CPF);
        this.chapa = chapa;
        this.dtAdm = dtAdm;
        this.salario = salario;
}
    
    Funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void status() {
        super.status();
        System.out.println("Chapa: " + this.chapa);
        System.out.println("Data Admissão: " + this.dtAdm);
        System.out.println("Salário: " + this.salario);
    }
   
    
    public void alterarSal (float salario){
        setSalario (salario);
    }

    public int getChapa() {
        return chapa;
    }

    public void setChapa(int chapa) {
        this.chapa = chapa;
    }

    public String getDtAdm() {
        return dtAdm;
    }

    public void setDtAdm(String dtAdm) {
        this.dtAdm = dtAdm;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
}
