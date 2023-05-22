public class Gerente extends Funcionario{
    double gratificacao;

    public Gerente() {
        super();
    }

    public Gerente(String nome, double salario, double gratificacao, Departamento departamento) {
        super(nome, salario, departamento);
        this.gratificacao = gratificacao;
    }

    @Override
    double salario() {
        return (super.salario()+this.gratificacao);
    }

    @Override
    String dados() {
        return "Nome: "+nome+"\n" +
                "Salário: "+String.format("R$ %.2f",salario())+"\n";
    }
}
