
package atividade_pessoa;


public class Professor extends Funcionario{
    int cargaHorario;
    String titulacao;
    String situacao;

    public Professor(int cargaHorario, String titulacao, int chapa, String dtAdm, float salario,String nome, String CPF) {
    super(chapa, dtAdm, salario, nome, CPF);
    this.cargaHorario = cargaHorario;
    this.titulacao = titulacao;
}
    
    @Override
    public void status() {
        super.status();
        System.out.println("Carga Horária: " + this.cargaHorario);
        System.out.println("Titulação: " + this.titulacao);
        System.out.println("Situação: " + this.situacao);
    }
    
    public void admitirProf(String situacao) {
        setSituacao (situacao);
    }
    
    public void demitirProf(String situacao) {
        setSituacao (situacao);
    }
    
    public void alterarCH(int cargaHorario) {
        setCargaHorario (cargaHorario);
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
