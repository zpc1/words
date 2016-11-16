package words;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

public class Words {

	public static void clear() throws AWTException
    {
        Robot r = new Robot();
        r.mousePress(InputEvent.BUTTON3_MASK);       // ��������Ҽ�
        r.mouseRelease(InputEvent.BUTTON3_MASK);    // �ͷ�����Ҽ�
        r.keyPress(KeyEvent.VK_CONTROL);             // ����Ctrl��
        r.keyPress(KeyEvent.VK_R);                    // ����R��
        r.keyRelease(KeyEvent.VK_R);                  // �ͷ�R��
        r.keyRelease(KeyEvent.VK_CONTROL);            // �ͷ�Ctrl��
        r.delay(100);       

    }
	
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
				"The just budget judge just justifies the adjustment of justice;������Ԥ�㷨��ֻ����Ϊ˾�������绤����",
				"I used to abuse the unusual usage,but now i'm not used to doing so;�ҹ�ȥ�����������Ѱ�����÷����������ڲ�ϰ����������",
				"The lace placed in the palace is replaced first,and displaced later;���ڻʹ��Ĵ����ȱ��滻���ˣ�������ת��",
				"I paced in the peaceful spacecraft;��������������ɴ����ⲽ",
				"Sir,your bird stirred my girlfriend's birthday party;����,����������Ů���ѵ����վۻ�",
				"The waterproof material is suitable for the aerial used near the waterfall;������ˮ�����ʺ������ٲ�����������",
				"I hint that the faint saint painted the printer with a pint of paint;�Ұ�ʾ˵������ʥͽ����һƷ������Ϳӡˢ��",
				"At any rate,the separation ratio is accurate;������Σ����������Ǿ�ȷ��",
				"The boundary around the round ground separates us from the surroundings;Χ����Բ�γ��صı߽罫����ͬ���ܸ���",
				"The blunder made the underground instrument undergo an undermining of the thunderbolt;���ʧ���õ�������������һ���׵���ƻ�",
				"The tilted salt filters halt alternately for altering;��б���ι����������ͣ���Ա����",
				"The wandering band abandoned her bandaged husband on Swan island;���˵��ֶӰ�����λ���ű������ɷ���������쵺��",
				"The manly Roman woman manager by the banner had man's manner;��������λ���������ŵĹ�����Ů����������ӷ��",
				"In the lane the planer saw a planet airplane under the crane;������ٹ����������ػ��µ����Ƿɻ�",
				"The wet pet in the net hasn't got on the jet plane yet;���е�ʪ���ﻹû�е��������ɻ�",
				"After Maintenance the main remains and remainders are left on the domain;ά��֮����Ҫ�ź���ʣ���������������",
				"The grandson branded the brandy randomly;���Ӹ������������������ӡ",
				"The landlord's land on the hightland of the mainland expanded a lot;�����ڴ�½��ԭ�ϵ����������˺ܶ�",
				"Utilize the fertilizer to keep the land fertile;���û��ʱ������ط���",
				"The grand commander demands thousands of sandy sandwiches;��˾���Ҫ��ǧ��ɳ��������",
				"I infer that he is indifferent to differentiating the offers in different conferences;���ƶ��������ֲ�ͬ��̸�ı���Į������",
				"The maximum plus or minus the minimum makes minute difference;���ֵ���ϻ��߼�ȥ��Сֵֻ������С�Ĳ���",
				"The witty witness withdraws his words within minutes without any reason;ڶг��֤���ڼ�����֮���޹ʵ��ջ�����˵�Ļ�",
				"The cake maker shakes a naked snake with the quaking rake without sake;������������Ե�޹ʵ��ö����İ���ҡһ���������",
				"By the crook,the cook looked through a cookbook before making hooked cookies;��Ϫ�ߣ������������α���֮ǰ������һ��ʳ��",
				"The writer writes the white book quite quietly in quilt;�����ڱ�����ʮ��ƽ����д��Ƥ��",
				"On the chilly hillside, he is unwilling to write his will on the ten-shilling bill;�ں����ɽ����,����Ը�⽫����д��ʮ������˵���",
				"The weaver will leave for the heavy heaven;��λ��֯����Ҫ�������������ȥ",
				"The handy left-hander left a handsome handkerchief on the handle of the handbag;���ɵ���Ʋ�Ӱ�һ��Ư�����������������������",
				"The thief chief achieved the theft of a handkerchief for mischief;�����������͵�����Ķ�����",
				"I believe my brief words will relieve her grief;�������Ҽ�̵Ļ���������ı�ʹ",
//				<-------------------------------------------------------------------------------------------------->
				"At the dock I��m shocked to see the pocket rocket made of a block of rock;����ͷ����һ����ʯ����С�ɻ��,�Ҹе���",
				"Standing under the outstanding rock I misunderstood his standard standpoint;վ��ͻ������ʯ��,����������ı�׼����",
				"The substantial part of the constitution about the institution of institutes is substituted;�ܷ����й�����Э���ʵ���Բ��ֱ��滻",
				"Spell smell! Very well, the well-being for human being will swell;ƴд��ζ(һ��)!�ܺ�,����ĸ�����������",
				"Once none of you is here, the man in throne will live alone in the lonely zone;һ������û�����ڴ�,��λ�ϵ��˾�Ҫ�¶�������������¼ŵĵش�",
				"Nowadays the once unknown snowy hill is well-known for snowstorm;������������������Ķ�ѩСɽ�򱩷�ѩ������",
				"For instance, I can instantly know the constant distance;����,�ҿ��Լ���֪���ú㶨����",
				"The man beyond the bond is fond of the second wonderful diamond;��λ����Լ������ϲ���ڶ����������ʯ",
				"While sinking into thinking, the shrinking linkman drank the pink ink sprinkled on the wrinkly paper;�����˼ʱ,����������Ա�ȵ�����������ֽ�ϵķۺ�ɫīˮ",
				"The contribution distributor thinks the microcomputer pollution is absolutely beyond dispute;����������Ϊ΢����Ⱦ�Ǿ��Բ������ɵ�"};
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
//		(int)(1+Math.random()*(10-1+1))
		System.out.println(num.length);
		for (int i = 30; i < num.length; i++) {
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
				
				
				try {
					clear();
				} catch (AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("right!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				error = 0;
			}
			
		}

	}

}
