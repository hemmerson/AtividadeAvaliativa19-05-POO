public class Main {
    public static void main(String[] args) {
        Estagiario estagiario1 = new Estagiario();
        Gerente gerente1 = new Gerente();
        Departamento departamento1 = new Departamento();
        Empresa empresa = new Empresa();
        Funcionario funcionario1 = new Funcionario();

        estagiario1.nome = "Eduardo";
        estagiario1.salario = 1200.0;
        estagiario1.curso = "Sistemas para Internet";
        estagiario1.departamento = departamento1;

        funcionario1.nome = "Tiago";
        funcionario1.salario = 2000.0;
        funcionario1.departamento = departamento1;

        gerente1.nome = "Paulo Henrique";
        gerente1.salario = 2500.0;
        gerente1.gratificacao = 800.0;
        gerente1.departamento = departamento1;

        departamento1.nome = "Desenvolvimento";
        departamento1.telefone = "(63)3217-1515";
        departamento1.gerente = gerente1;
        departamento1.funcionarios.add(estagiario1);
        departamento1.funcionarios.add(funcionario1);

        empresa.razaoSocial = "RL Sistemas";
        empresa.cnpj = "32.124.523/0001-99";
        empresa.departamentos.add(departamento1);

        System.out.println(empresa.funcionario(estagiario1));
    }
}