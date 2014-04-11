
public class MoveQ {

	public static void main(String[] args) {
		int i=0, j=80, k=0;
		for(int n=0;n < 100; n++){
			i = (i + 3) % 100;
			if((j - 5) < 0) {
				j = j - 5 + 100;
			} else j = j - 5;
//			System.out.println(i + "," + j);
			if(i == j){
				k++;
				System.out.println(k);
			}
		}
	}

}
