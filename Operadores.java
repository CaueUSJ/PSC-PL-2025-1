public class Operadores {

    // Metodo principal
    public static void main(String[] args){
        // Operadores aritméticos
        int a = 10;
        int b = 5;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Modulo: " + (a % b));

        // Operadores de comparação
        int c = 8;
        int d = 6;

        System.out.println(c == d);
        System.out.println(c != d);
        System.out.println(c > d);
        System.out.println(c >= d);
        System.out.println(c < d);
        System.out.println(c <= d);

        // Operadores lógicos
        boolean e = true;
        boolean f = false;

        System.out.println(e && f);
        System.out.println(e || f);
        System.out.println(!e);

        // Operadores de atribuição
        int g = 10;

        g += 5;  // g = g + 5;
        g -= 5;  // g = g - 5;
        g *= 5;  // g = g * 5;
        g /= 5;  // g = g / 5;
        g %= 5;  // g = g % 5;        

    }

}

