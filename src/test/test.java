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
				"The just budget judge just justifies the adjustment of justice;公正的预算法官只不过为司法调整辩护而已",
				"I used to abuse the unusual usage,but now i'm not used to doing so;我过去常滥用这个不寻常的用法，但我现在不习惯这样做了",
				"The lace placed in palace is replaced first,and displaced later;放在皇宫的带子先被替换掉了，后来被转移",
				"I paced in the peaceful spacecraft;我在宁静的宇宙飞船里踱步",
				"Sir,your bird stirred my girlfriend's birthday party;先生,你的尿搅了我女朋友的生日聚会",
				"The waterproof material is suitable for the aerial used near the waterfall;这种耐水材料适合用在瀑布附近的天线",
				"I hint that the faint saint painted the printer with a pint of paint;我暗示说虚弱的圣徒用了一品脱油漆涂印刷机",
				"At any rate,the separation ratio is accurate;无论如何，这个分离比是精确的",
				"The boundary around the round ground separates us from the surroundings;围绕着圆形场地的边界将我们同四周隔开",
				"The blunder made the underground instrment undergo an undermining of the thundbolt;这个失策让地下仪器经受了一次雷电的破坏",
				"The tilted salt filters halt alternately for altering;倾斜的盐过滤器交替的停下以便改造",
				"The wandering band abandoned her bandage husband on Swan island;流浪的乐队把她那位打着绷带的丈夫遗弃到天儿岛上",
				"The manly Roman woman manager by the banner had man's manner;军旗旁那位有男子气概的古罗马女经理具有男子风度",
				"In the lane the planer saw a planet airplane under the crane;在巷里。刨工看见了起重机下的行星飞机",
				"The wet pet in the net hasn't got on the jet plane yet;网中的湿宠物还没有登上喷气飞机",
				"After Maintenance the main remains and remainders are left on the domin;维修之后，主要遗骸和剩余物留在了领地上",
				"The grandson branded the brandy randomly;孙子给白兰地随机打上了烙印",
				"The landlord's land on the highland of mainland expanded a lot;地主在大陆高原上的土地扩张了很多",
				"Utilize the fertilizer to keep the land fertile;利用化肥保持土地肥沃",
				"The grand commander demands thousands of sandy sandwiches;大司令官要成千个萨拉三明治",
				"I infer that he is indifferent to differentiating the offers in different conferences;我推断他对区分不同会谈的报价漠不关心"};
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
//		(int)(1+Math.random()*(10-1+1))
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
