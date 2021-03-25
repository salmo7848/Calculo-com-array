	
	
	import java.util.Scanner;
	
	public class ArrayUm_Clomp {
		Scanner sc = new Scanner(System.in);
		
	    public int vetores() {
	    	int i;
	    	System.out.println("informe o valor: ");
			int n = sc.nextInt();
			
		
		int[] dados = new int[n];
		int soma=0;
		/*LINHAS: 19 á 29
		 * Bloco abaixo informa a posição do vetor em que cada numero
		 * informado pelo usuario se encontra*/
	    	for(i=0; i<n; i++) {
	    		
	    		System.out.println("Informe o numero: ");
	    		dados[i]=sc.nextInt();
	    		
	    		System.out.println("posição de "+ dados[i]+" é  "+i);
	    		
	    		
	    		System.out.println(dados[i]);
	    		
	    	}
	    	/*LINHAS: 32 á 40
	    	 * Bloco abaixo informa o numero  de cada posição informada pelo usuario*/
			String resp;
			do{
			sc.nextLine();	
			System.out.print("\nSelecione as posições : ");
			i = sc.nextInt();
			
			System.out.println("Valor de posição "+i+" é: "+dados[i]);
			
			soma+=dados[i];
			/*LINHAS: 46 á 52
			 * O usuario digitando S será solicitado que o mesmo escolha 
			 * mais uma opção do vetor
			 * Caso digite N, sairá do laço e mostrará a soma dos vetores
			 * selecionados*/
			sc.nextLine();
			System.out.print("\nDeseja continuar S/N:  ");
			resp = sc.nextLine();
			}while(!resp.equals("N") && !resp.equals("n"));
			
			
			System.out.println("soma dos vetores selecione "+soma);
			sc.nextLine();
			return vetores();
		
		    
		}
	    
	}


