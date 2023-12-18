package Classes.Faculdade;

public class RegistroAcademico {
    
    String nome;
    String matricula;
    int codigoCurso;
    double percentualCobranca;

    void inicializaRegistroAcademico(String n, String m, int c, double p){
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualCobranca = p;
    }

    double calculaMensalidade(){
        return 100 * codigoCurso * percentualCobranca;
    }

}
