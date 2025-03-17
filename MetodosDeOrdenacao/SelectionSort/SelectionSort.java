package MetodosDeOrdenacao;

public class SelectionSort {
	// acha a posição do maior ou menor elemento e depois realiza a troca
	
	public static void main(String[] args) {
		
		int[] arr = {3,5, 2, 8, 4, 9};
		int pos;
		int temp;
		
		for(int i=0; i<arr.length-1; i++) { // não percorre todo o array
			pos = i; // armazena a posição
			for(int j= i+1; j < arr.length; j++) { // começa a partir da posição i
				if(arr[pos] > arr[j]) { // compara com o valor da posição
					pos = j; //armazena a posição
				}
			}
			// realiza as trocas
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + " ");
		}
	}
}
