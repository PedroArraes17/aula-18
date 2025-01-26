package pedro.cursojava.aula18;

import java.util.Scanner;

public class deverarray {

	public static void main(String[] args) {
		

 Scanner scan = new Scanner(System.in);
		
        /*int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
 
        for(int i=0; i<vetorA.length; i++){   
        
        	System.out.println("Entre com o valor da posição: " + i);
        	vetorA[i] = scan.nextInt();
        }	

        for(int i=0; i<vetorA.length; i++){
        vetorB[i] = vetorA[i];
	    }
        
        System.out.println("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
           System.out.println(vetorA[i] + "");
        }
         System.out.println();
        
         System.out.println("Vetor B = ");
         for (int i=0; i<vetorB.length; i++){
            System.out.println(vetorB[i] + "");
         }
          System.out.println();
        
        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

          for(int i=0; i<vetorA.length; i++){   
 
 	       System.out.println("Entre com o valor da posição: " + i);
 	        vetorA[i] = scan.nextInt();
 }	

             for(int i=0; i<vetorA.length; i++){
             vetorB[i] = vetorA[i] *2 ;
 }
 
            System.out.println("Vetor A = ");
            for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + "");
 }
            System.out.println();
 
            System.out.println("Vetor B = ");
            for (int i=0; i<vetorB.length; i++){
            System.out.println(vetorB[i] + "");
  }
            System.out.println();*/
 
          
 double[] Notas1 = new double[3];
 double[] Notas2 = new double[Notas1.length];
 double[] Resultados = new double[Notas1.length];
 
 for (int i=0; i<Notas1.length; i++){
 
	 System.out.println("Entre com a nota 1 do aluno: " + (i+1));
	 Notas1[i] = scan.nextDouble();
 
	 System.out.println("Entre com a nota 2 do aluno: " + (i+1) );
	 Notas2[i] = scan.nextDouble();
	 
	 Resultados[i] = (Notas1[i] + Notas2[i]) / 2;
        }
	 System.out.println("Notas 1 = ");
	 for (int i=0; i<Notas1.length; i++){
	    System.out.println(Notas1[i] + "" );
	      System.out.println();
	    
	    System.out.println("Notas 2 = ");
		 for (int u=0; u<Notas2.length; u++){
		    System.out.println(Notas2[u] + "");
	          System.out.println();
		    
		    System.out.println("Resultados: ");
			 for (int g=0; g<Resultados.length; g++){ 
				 
				 if (Resultados[g] >=7){
			      System.out.println(Resultados[g] + " Aprovado");	    
				 } else {
		          System.out.println(Resultados[g] + " Reprovado");
				 }
			 
			 }
		    
	    }
	  }
	}	
	
}
        
        
