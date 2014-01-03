import java.util.Scanner;


public class CharNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char[] chs = str.toCharArray();
		int num = 0;
		
		for(int i=1; i<str.length(); i++){
			num++;
			if(chs[i] != chs[i-1] ){
				System.out.print(String.valueOf(chs[i-1]) + num);
				num = 0;
			}
		}
		
		if(chs[str.length()-1] != chs[str.length()-2]){//最后一个字符
			System.out.print(String.valueOf(chs[str.length()-1]) + "1");
		}else{
			System.out.print(String.valueOf(chs[str.length()-1]) + (num + 1));
		}
	}
}
