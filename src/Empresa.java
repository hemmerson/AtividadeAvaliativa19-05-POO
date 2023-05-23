import java.util.ArrayList;
import java.util.List;

public class Empresa {
    String razaoSocial, cnpj;
    List<Departamento> departamentos = new ArrayList<>();

    String dados(){
        return  "========= EMPRESA ========"+"\n" +
                "Razão Social: "+razaoSocial+"\n" +
                "CNPJ: "+cnpj+"\n\n" +
                "====== DEPARTAMENTO ======" + "\n" +
                departamentos()+"\n";
    }

    String departamentos(){
        String departamentosTexto = "";
        for (Departamento d: departamentos) {
            departamentosTexto += d.dados();
        }
        return departamentosTexto;
    }

    String funcionario(Funcionario f){
        return f.dados();
    }

}
