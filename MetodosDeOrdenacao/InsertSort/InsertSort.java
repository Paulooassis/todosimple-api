package MetodosDeOrdenacao;

public class InsertSort {
	public static void main(String[] args) {
		int arr[] = {5, 1, 2, 7, 8, 3, 0, 15, 4};
		
		int temp;
		
		for (int i = 1; i < arr.length; i++) {  // Inicia o loop a partir do segundo elemento (i = 1), pois o primeiro elemento já está "ordenado" por si só.
		    temp = arr[i];  // Armazena o elemento atual (arr[i]) que será comparado e inserido na posição correta.
		    int j = i - 1;  // Inicializa j como o índice do elemento à esquerda de i (o elemento anterior).
		    
		    // Enquanto j for válido (j >= 0) e o elemento à esquerda de arr[j] for maior que temp,
		    // movemos o elemento à direita para abrir espaço para o temp.
		    while (j >= 0 && arr[j] > temp) {
		        arr[j + 1] = arr[j];  // Move o elemento arr[j] uma posição para a direita (para arr[j+1]).
		        j--;  // Move o índice j para a esquerda, para comparar o próximo elemento à esquerda.
		    }
		    
		    arr[j + 1] = temp;  // Coloca o valor de temp (o elemento original arr[i]) na posição correta (j+1).
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
