public class Coordenador extends Professor {
    
    public Coordenador(String nome, int idade, double altura, String email, String matricula){

        super(nome, idade, altura, email, matricula);
            
    }

    public static void exibirDados(){
        System.out.println(" Olá coordenador " + getNome() + ", seja bem vindo!");
        System.out.println(" Idade: " + getIdade());
        System.out.println(" Altura: " + getAltura());
        System.out.println(" Matricula: " + getMatricula());
        System.out.println(" Email: " + getEmail());
        System.out.println("  ");
    }

}
