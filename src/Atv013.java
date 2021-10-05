

public class Atv013 {

    public static void main(String[] args) {
        cabecalho();
        int soma1 = soma(10, 20);
        int soma2 = soma(20, 25);
        int soma3 = soma(43, 98);
        int soma4 = soma(77, 13);
        double media1 = media(soma1, soma2, soma3, soma4);
        imprime_resultado(soma1, soma2, soma3, soma4, media1);
    }

    static void cabecalho() {
        System.out.println("========== Cálculo de média ========== \n");
    }

    static int soma(int n1, int n2) {
        int somaN = n1 + n2;
        return somaN;
    }

    static double media(int n1, int n2, int n3, int n4) {
        double resultado = (n1 + n2 + n3 + n4) / 4.0;
        return resultado;
    }

    static void imprime_resultado(int soma1, int soma2, int soma3, int soma4, double media1) {
        System.out.println("O valor da soma 1 foi: " + soma1 + "\nO valor da soma 2 foi: " + soma2 + "\nO valor da soma 3 foi: " + soma3 + "\nO valor da soma 4 foi: " + soma4);
        System.out.printf("O valor da média calculada foi: %.2f", media1);
    }


}
