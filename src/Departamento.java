import java.util.ArrayList;
import java.util.List;

public class Departamento {
    String nome, telefone;
    List<Funcionario> funcionarios = new ArrayList<>();
    Gerente gerente;

    String dados(){
        return "Nome Departamento: "+nome+"\n" +
                "Telefone: "+telefone+"\n" +
                "=========   Gerente  =========\n" +
                gerente.dados()+"\n" +
                "======== Funcionários ========\n" +
                funcionarios()+"\n";
    }

    String funcionarios(){
        String funcionariosTexto = "";
        for (Funcionario f: funcionarios) {
            funcionariosTexto += f.dados();
        }
        return funcionariosTexto;
    }

    public static void main(String[] args) {
        Estagiario estagiario1 = new Estagiario();
        estagiario1.nome = "Eduardo";
        estagiario1.salario = 1200.0;
        estagiario1.curso = "Sistemas para Internet";

        Gerente gerente1 = new Gerente();
        gerente1.nome = "Paulo Henrique";
        gerente1.salario = 2500.0;
        gerente1.gratificacao = 800.0;

        Departamento departamento1 = new Departamento();
        departamento1.nome = "Desenvolvimento";
        departamento1.telefone = "(63)3217-1515";
        departamento1.gerente = gerente1;
        departamento1.funcionarios.add(estagiario1);
        gerente1.departamento = departamento1;

        System.out.println(departamento1.dados());
    }
}
