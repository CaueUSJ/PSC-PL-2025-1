public class Aluno extends Pessoa{

    private static String ra;
    private static double nota;

    public Aluno(String nome, int idade, double altura, String email, String ra, double nota) {

        super(nome, idade, altura, email);

        this.ra = ra;
        this.nota = nota;
        
    }

}
