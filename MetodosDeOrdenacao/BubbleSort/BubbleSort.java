package MetodosDeOrdenacao;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {3, 6, 2, 5, 9, 4, 12};
		// tem como referencia a ultima posição
		int temp;
		
		for(int i = arr.length-1; i> 0; i--) { // começa com o ultimo 
			for(int j=0; j<i; j++) { // vai so ate o valor 
				if(arr[j] > arr[j+1]) { // realiza a comparação entre a posição atual do j e a proxima indo até o valor de i, pois como é j+1
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j +1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
