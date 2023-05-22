public class Funcionario {
    String nome;
    double salario;
    Departamento departamento;

    Funcionario(){}

    public Funcionario(String nome, double salario, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    double salario(){
        return salario;
    }

    String dados(){
        return "Nome: "+nome+"\n" +
                "Salário: "+String.format("R$ %.2f",salario())+"\n";
    }
}
