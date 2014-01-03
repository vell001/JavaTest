package test50;

/**
 * @author VellBibi
 * 【程序18】 Prog.java 
 * 题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。
 * 有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。 
 */
public class Prog {

	public static void main(String[] args) {
		String[] team1 = {"a","b","c"};
		String[] team2 = {"x","y","z"};
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(i == 0 && j == 0)//a说他不和x比
					continue;
				else if(i == 2 && (j == 0 || j == 2))
					continue;//c说他不和x,z比
				else{
					System.out.println(team1[i] + "<-->" + team2[j]);
				}
			}
		}
	}

}
