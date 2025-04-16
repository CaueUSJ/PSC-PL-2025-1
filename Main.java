public class Main {

    public static void main(String[] args) {

        Aluno caue = new Aluno("Cauê ", 24, 1.72, "82329174@ulife.com.br", "82329174", 0);
        Coordenador coordenador = new Coordenador(" Carlos", 40, 1.80, "Carlos@email.com", "123456");

        caue.exibirDados();

        coordenador.exibirDados();
        
    }

}
