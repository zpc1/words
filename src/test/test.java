package test;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

public class test {

	public static void main(String[] args) {
		int error = 0;
		ArrayList<String[]> list = new ArrayList<String[]>();
		String[] num = {"With my own ears i clearly heard the heart beat of nuclear bomb;���׶����������ԭ�ӵ�����������",
				"Next year the bearded bear will bear a dear baby in the rear;���곤���ӵ��ܽ��ں󷽲�һͷ�ɰ�����",
				"Early i searched through the earth for earthware so as to research in earthquake;��Щ������������Ѱ�������о�����",
				"I learn that learned earnest men earn much by learning;�ҵ�֪��ѧ�ʶ�������˿�ѧ�����ö�Ǯ",
				"She swears to wear the peals that appear to be pears;������Ҫ����Щ�����������ӵ�����",
				"I nearly fear to tear the tearful girl's test paper;�Ҽ�������˺�Ǹ����������Ů�����Ծ�",
				"The bold folk fold up the gold and hold it in hand;�󵨵����ǽ��ƽ��۵�������������",
				"The customer are accustomed to the disgusting custom;�˿���ϰ������������ķ���",
				"The dust in the industrial zone frustrated the industrious men;��ҵ԰���Ļҳ�ʹ���͵����ǻ���",
				"The just budget judge just justifies the adjustment of justice;������Ԥ�㷨��ֻ����Ϊ˾�������绤����"};
		String[] num11 = {"��ǰ��","��ǰ��","��ǰ��","��ǰ��","����","����","�����","�����","�Һ���","�Һ���","ײ��ǰ","ײ��ǰ","ײ��ǰ","ײ��ǰ","ײ����","ײ����","ײ����","ײ����",
				"ײ����","ײ����","ײ����","ײ����","ײ����","ײ����","ײ����","ײ����","ײ��ǰ","ײ��ǰ","ײ��ǰ","ײ��ǰ","ײ��ǰ","ײ��ǰ","ײ��ǰ","ײ��ǰ",
				"ײ���","ײ���","ײ���","ײ���","ײ�Һ�","ײ�Һ�","ײ�Һ�","ײ�Һ�","��������","��������"};
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
