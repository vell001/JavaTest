import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class View {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int N = 5;
		try {
			N = Integer.parseInt(buffer.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		View.Viewer(N, '*');
	}
	
	public static void Viewer(int n, char c){
		int i=0;
		for(i=0; i<n; i++){
			for(int j=0; j<n+i; j++){
				if(j>=n-1)
					System.out.print(c);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		for(i=0;i<n; i++){
			for(int j=0; j<n; j++){
				if(j<i)
					System.out.print(" ");
				else
					System.out.print(c);
			}
			System.out.println("");
		}
	}
}
