
package atividade_pessoa;

public class Aluno extends Pessoa{
   int RA;
   String curso;
   String situacao;

    public Aluno(int RA, String curso, String situacao, String nome, String CPF) {
        super(nome, CPF);
        this.RA = RA;
        this.curso = curso;
        this.situacao = "MATRICULADO";
    }
   
   @Override
    public void status() {
        super.status();
        System.out.println("RA: " + this.RA);
        System.out.println("Curso: " + this.curso);
        System.out.println("Situação: " + this.situacao);
    }
   
   public void cancelarCurso (String situacao){
       setSituacao (situacao);
       System.out.println("O curso "+this.curso+" foi "+this.situacao);
   }
   
   public void alterarCurso (String curso) {
       setCurso (curso);
   }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
