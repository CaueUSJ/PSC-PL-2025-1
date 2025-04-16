public class Aluno extends Pessoa{

    private static String ra;
    private static double nota;

    public Aluno(String nome, int idade, double altura, String email, String ra, double nota) {

        super(nome, idade, altura, email);

        this.ra = ra;
        this.nota = nota;

    }

    public static String getRa(){
        return ra;
    }

    public static double getNota(){
        return nota;
    }

    public static void exibirDados(){
        System.out.println(" Olá aluno " + getNome() + ", seja bem vindo!");
        System.out.println(" Idade: " + getIdade());
        System.out.println(" Altura: " + getAltura());
        System.out.println(" RA: " + ra);
        System.out.println(" Email: " + getEmail());
        System.out.println(" Nota: " + nota);
        System.out.println("  ");
    }

}
