package dio.com.java.variaveis;

public class Variaveis {
    public static void main (String [] args) {
        System.out.println ("Hello World");

        //Tipos primitivos
        String meuNome = "Eric";
        byte idade = 25;
        short ano = 2025;
        int cep = 98840808;
        long cpf = 8742847982l;
        System.out.println (cpf);

        float pi = 3.14f;
        double salario = 1340.45;

        // Reatribuição de variável
        int numero = 10;
        numero = 4;
        System.out.println (numero);

        // Constantes (valores que não mudam)
        final double VALOR_PI = 3.14;
        System.out.println (VALOR_PI);
    }
}
