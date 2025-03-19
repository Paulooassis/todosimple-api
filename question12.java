package exerc;

public class question12 {
    /*)Implemente um método recursivo em Java que receba um array de caracteres e retorne
    um número inteiro indicando a quantidade de vogais do mesmo. */
    public static int contVogais(char car[], int tam) {
        if(tam == 0) {
            return 0;
        }
        if(car[tam] == 'a' || car[tam-1] == 'e' || car[tam-1] == 'i' || car[tam-1] == 'o' || car[tam-1] == 'u') {
        	return contVogais(car, tam-1) + 1;
        }
        return contVogais(car, tam-1);
    }

    public static void main(String[] args) {
        char[] caracteres = {'a', 'b', 'c', 'e', 'i', 'o', 'u', 'x', 'z'};
        int quantidadeVogais = contVogais(caracteres, caracteres.length);
        System.out.println("Quantidade de vogais: " + quantidadeVogais);
    }
}

