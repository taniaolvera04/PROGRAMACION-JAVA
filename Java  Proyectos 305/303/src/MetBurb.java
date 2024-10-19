
public class MetBurb {
	public static void main(String[] args) {
		 int ar[]={1,3,4,3,4,0,7,1,6,8};
         System.out.println("Array sin ordenar: ");
         for(int i=0;i<ar.length;i++){
             System.out.print(ar[i]+" ");
         }
         for(int i=0; i < ar.length-1; i++){
                for(int j=0; j < (ar.length-1-i); j++){  
                     if(ar[j] > ar[j+1]){  
                             int aux=ar[j];                 
                             ar[j]=ar[j+1];           
                             ar[j+1]=aux;
                      }    
                }
           }
         System.out.println("");
         System.out.println("Array ordenado: ");
         for(int i=0;i<ar.length;i++){
             System.out.print(ar[i]+" ");
}
	}

}
