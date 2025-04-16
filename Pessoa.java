public class Pessoa {

    private static String nome;
    private static int idade;
    private static double altura;
    private static String email;

    public Pessoa(String nome, int idade, double altura, String email){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.email = email;
    }

    public static String getNome(){
        return nome;
    }

    public static int getIdade(){
        return idade;
    }
    
    public static double getAltura(){
        return altura;
    }

    public static String getEmail(){
        return email;
    }

}
