

public class RandomEasy {	
	
     public static void main(String[] args) {
    	 java.util.Random random = new java.util.Random();
          Integer[] a = new Integer[100];
          for(int i = 0; i < 100;i++) {          	          	
          		a[i] = random.nextInt()%50+1;
          }
      
          int o = 0, j= 0;
          for(int i=0; i<100; i++){
        	 if(a[i]%2 == 0){ o++; }
        	 else { j++; }
          }         
          System.out.println("\n 偶数："+o+"\n奇数："+j);
     }   
 
}