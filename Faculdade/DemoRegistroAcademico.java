package Classes.Faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico micheal = new RegistroAcademico();
        micheal.inicializaRegistroAcademico("Michael","cs999" , 3, 0.75);
        System.out.println("Mensalidade: " + micheal.calculaMensalidade());

        RegistroAcademico Roberto = new RegistroAcademico();
        System.out.println("Mensalidade: " + Roberto.calculaMensalidade());



    }
}
