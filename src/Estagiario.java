public class Estagiario extends Funcionario{
    String curso;

    Estagiario(){
        super();
    }

    public Estagiario(String nome, double salario, String curso,Departamento departamento) {
        super(nome, salario, departamento);
        this.curso = curso;
    }

    @Override
    String dados() {
        return super.dados()+
                "Curso: "+curso+"\n\n";
    }

    public static void main(String[] args) {
        Estagiario estagiario1 = new Estagiario();
        estagiario1.nome = "Eduardo";
        estagiario1.curso = "Sistemas para Internet";
        estagiario1.salario = 1200.0;

        System.out.println(estagiario1.dados());
    }
}

