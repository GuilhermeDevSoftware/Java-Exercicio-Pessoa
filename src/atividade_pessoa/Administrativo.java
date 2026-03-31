package atividade_pessoa;

public class Administrativo extends Funcionario{
    int horasSemana;
    String setor;
    String situacao;

    public Administrativo(String setor, int chapa, String dtAdm, float salario, String nome, String CPF) {
    super(chapa, dtAdm, salario, nome, CPF);
    this.setor = setor;
}
    
    @Override
    public void status() {
        super.status();
        System.out.println("Horas Semana: " + this.horasSemana);
        System.out.println("Setor: " + this.setor);
        System.out.println("Situação: " + this.situacao);
    }

    public void admitirFunc(String situacao){
        setSituacao (situacao);
    }
    
    public void demitirFunc(String situacao) {
        setSituacao (situacao);
    }
    
    public void alterSetor (String setor){
        setSetor (setor);
    }
    
    
    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
}
