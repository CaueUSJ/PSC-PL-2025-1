public class Professor extends Pessoa{
    
    private static String matricula;


    public Professor(String nome, int idade, double altura, String email, String matricula){

        super(nome, idade, altura, email);
        
        this.matricula = matricula;
    }

    public static String getMatricula(){
        return matricula;
    }


}
