
public class BuscaPrimeiraOcorrencia {
	
	public static void main(String[] args) {
		
		int cont = 0;
		boolean sinal = false;
		
		//Vetor com 11 posi��es para os tr�s casos
		int[] A = { 1, 4, 7, 44, 2, 7, 8, 98, 23, 65, 22};
		int[] A1 = { 6, 3, 6, 9, 2, 5, 8, 98, 23, 65, 22};
		int[] A2 = { 7, 3, 6, 9, 2, 12, 8, 98, 23, 65, 22};
		int n = A.length - 1;
		int x = 1;
		int x1 = 5;
		int x2 = 11;
		
		//Vetor com 21 posi��es para os tr�s casos
		int[] B = { 1, 43, 7, 44, 2, 7, 8, 98, 23, 65, 22, 5, 24, 5, 34, 5, 8, 5, 90, 5, 42};
		int[] B1 = { 10, 1, 7, 44, 2, 7, 8, 98, 23, 65, 11, 5, 24, 5, 34, 5, 8, 5, 90, 5, 42};
		int[] B2 = { 10, 1, 7, 44, 2, 7, 8, 98, 23, 65, 22, 5, 24, 5, 34, 5, 8, 5, 90, 5, 42};
		int n1 = B.length - 1;
		int y = 1;
		int y1 = 11;
		int y2 = 21;
		
		//Vetor com 42 posi��es para os tr�s casos
		int[] C = { 1, 43, 7, 44, 2, 7, 8, 98, 23, 65, 2, 5, 24, 5, 34, 5, 8, 5, 90, 5, 45, 
				22, 1, 7, 44, 2, 7, 8, 98, 23, 65, 22, 5, 24, 5, 34, 5, 8, 5, 90, 5, 59};
		
		int[] C1 = { 1, 56, 7, 44, 2, 7, 8, 98, 23, 65, 2, 5, 24, 5, 34, 5, 8, 5, 90, 5, 45, 
				22, 1, 7, 44, 2, 7, 8, 98, 23, 65, 22, 5, 24, 5, 34, 5, 8, 5, 90, 5, 59};
		
		int[] C2 = { 1, 55, 7, 44, 2, 7, 8, 98, 23, 65, 2, 5, 24, 5, 34, 5, 8, 5, 90, 5, 45, 
				22, 1, 7, 44, 2, 7, 8, 98, 23, 65, 22, 5, 24, 5, 34, 5, 8, 5, 90, 5, 59};
		int n2 = C.length - 1;
		int z = 1;
		int z1 = 22;
		int z2 = 42;
		
		//Saida para vetor com 11 posi��es para os tr�s casos
		System.out.println("Vetor com 11 posi��es \n");
		System.out.println("Elemento encontrado na primeira posi��o:");
		busca(cont, n, A, x, sinal);
		System.out.println("Elemento encontrado na posi��o intermediaria:");
		busca(cont, n, A1, x1, sinal);
		System.out.println("Elemento n�o encontrado:");
		busca(cont, n, A2, x2, sinal);
		
		System.out.println("---------------------------------");
		
		//Saida para vetor com 21 posi��es para os tr�s casos
		System.out.println("Vetor com 21 posi��es: \n");
		System.out.println("Elemento encontrado na primeira posi��o:");
		busca(cont, n1, B, y, sinal);
		System.out.println("Elemento encontrado na posi��o intermediaria:");
		busca(cont, n1, B1, y1, sinal);
		System.out.println("Elemento n�o encontrado:");
		 busca(cont, n1, B2, y2, sinal);
		
		System.out.println("---------------------------------");
		
		//Saida para vetor com 42 posi��es para os tr�s casos
		 System.out.println("Vetor com 42 posi��es  \n");
		 System.out.println("Elemento encontrado na primeira posi��o:");
		busca(cont, n2, C, z, sinal);
		System.out.println("Elemento encontrado na posi��o intermediaria:");
		busca(cont, n2, C1, z1, sinal);
		System.out.println("Elemento n�o encontrado:");
		busca(cont, n2, C2, z2, sinal);
	}
	
	//aplica a busca
	static public void busca(int cont, int n, int A[], int x, boolean sinal) {
		
		//contador de tempo
		long init = System.currentTimeMillis(); 
		long end;								
		long dif = 0;
		
		int j = 0;
		
		//aplicando o algoritmo
		while (A[j] != x && j < n) {
			j = j + 1;
			
			try {
				Thread.sleep(1000); //espera 1 segundo
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		cont = j;
		
		if (A[j] != x) { //verifica 
			System.out.println("Valor n�o encontrado");
			cont++;
			try {
				Thread.sleep(1000); //espera 1 segundo
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			sinal = true;
			System.out.println("Valor encontrado na posi��o " + j);
			cont++;
			try {
				Thread.sleep(1000); //espera 1 segundo
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		end = System.currentTimeMillis();
		
		dif = ((end - init)/1000);

		System.out.println("Contador: " + cont + " sinal: " + sinal +" - Tempo: " + dif + " segundos \n");
		
	}


}
