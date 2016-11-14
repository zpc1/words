package test;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

public class test {

	public static void main(String[] args) {
		int error = 0;
		ArrayList<String[]> list = new ArrayList<String[]>();
		String[] num = {"With my own ears i clearly heard the heart beat of nuclear bomb;我亲耳清楚的听到原子弹的心脏跳动",
				"Next year the bearded bear will bear a dear baby in the rear;明年长胡子的熊将在后方产一头可爱的崽",
				"Early i searched through the earth for earthware so as to research in earthquake;早些我在泥土中搜寻陶器以研究地震",
				"I learn that learned earnest men earn much by learning;我得知有学问而认真的人靠学问挣好多钱",
				"She swears to wear the peals that appear to be pears;她发誓要带那些看起来像梨子的珍珠",
				"I nearly fear to tear the tearful girl's test paper;我几乎害怕撕那个泪流满面的女孩的试卷",
				"The bold folk fold up the gold and hold it in hand;大胆的人们将黄金折叠起来拿在手里",
				"The customer are accustomed to the disgusting custom;顾客们习惯了令人讨厌的风俗",
				"The dust in the industrial zone frustrated the industrious men;工业园区的灰尘使勤劳的人们灰心",
				"The just budget judge just justifies the adjustment of justice;公正的预算法官只不过为司法调整辩护而已"};
		String[] num11 = {"左前门","左前门","右前门","右前门","后备箱","后备箱","左后门","左后门","右后门","右后门","撞正前","撞正前","撞正前","撞正前","撞正后","撞正后","撞正后","撞正后",
				"撞正左","撞正左","撞正左","撞正左","撞正右","撞正右","撞正右","撞正右","撞左前","撞左前","撞左前","撞左前","撞右前","撞右前","撞右前","撞右前",
				"撞左后","撞左后","撞左后","撞左后","撞右后","撞右后","撞右后","撞右后","车辆经过","车辆经过"};
		String tmp = "0F";

//		for(int x=0; x<11;x++){
//			list.add(num1);
//		}
		
	//	int fun = Integer.parseInt(tmp.substring(0, 2),16);
//		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		String input = null;
//		
		Scanner scan=new Scanner(System.in); 
		scan.useDelimiter("\n");
		for (int i = 7; i < num.length; i++) {
			if (error != -1) {
				String[] haha = num[i].split("\\;");
				System.out.println("Num:"+(i+1)+" "+haha[1]);
				
				do {
					if (error != 0 && !tmp.equals("exit")) {
						System.out.println(haha[0]);
						System.out.println(tmp);
						System.out.println("erro,try again!");
					}
					else if (tmp.equals("exit")) {
						error = -1;
					}
					error++;
				} while (!haha[0].equals(tmp = scan.nextLine()));
				System.out.println("right!");
				error = 0;
			}
			
		}

	}

}
