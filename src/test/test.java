package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

public class test {

	public static void clear() throws AWTException
    {
        Robot r = new Robot();
        r.mousePress(InputEvent.BUTTON3_MASK);       // 按下鼠标右键
        r.mouseRelease(InputEvent.BUTTON3_MASK);    // 释放鼠标右键
        r.keyPress(KeyEvent.VK_CONTROL);             // 按下Ctrl键
        r.keyPress(KeyEvent.VK_R);                    // 按下R键
        r.keyRelease(KeyEvent.VK_R);                  // 释放R键
        r.keyRelease(KeyEvent.VK_CONTROL);            // 释放Ctrl键
        r.delay(100);       

    }
	
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
//				<-------------------------------------------2---------------------------------------->
				"I used to abuse the unusual usage,but now i'm not used to doing so;我过去常滥用这个不寻常的用法，但我现在不习惯这样做了",
				"The lace placed in the palace is replaced first,and displaced later;放在皇宫的带子先被替换掉了，后来被转移",
				"I paced in the peaceful spacecraft;我在宁静的宇宙飞船里踱步",
				"Sir,your bird stirred my girlfriend's birthday party;先生,你的尿搅了我女朋友的生日聚会",
				"The waterproof material is suitable for the aerial used near the waterfall;这种耐水材料适合用在瀑布附近的天线",
				"I hint that the faint saint painted the printer with a pint of paint;我暗示说虚弱的圣徒用了一品脱油漆涂印刷机",
				"At any rate,the separation ratio is accurate;无论如何，这个分离比是精确的",
				"The boundary around the round ground separates us from the surroundings;围绕着圆形场地的边界将我们同四周隔开",
				"The blunder made the underground instrument undergo an undermining of the thunderbolt;这个失策让地下仪器经受了一次雷电的破坏",
				"The tilted salt filters halt alternately for altering;倾斜的盐过滤器交替的停下以便改造",
//				<---------------------------------------------3--------------------------------------->
				"The wandering band abandoned her bandaged husband on Swan island;流浪的乐队把她那位打着绷带的丈夫遗弃到天鹅岛上",
				"The manly Roman woman manager by the banner had man's manner;军旗旁那位有男子气概的古罗马女经理具有男子风度",
				"In the lane the planer saw a planet airplane under the crane;在巷里。刨工看见了起重机下的行星飞机",
				"The wet pet in the net hasn't got on the jet plane yet;网中的湿宠物还没有登上喷气飞机",
				"After Maintenance the main remains and remainders are left on the domain;维修之后，主要遗骸和剩余物留在了领地上",
				"The grandson branded the brandy randomly;孙子给白兰地随机打上了烙印",
				"The landlord's land on the hightland of the mainland expanded a lot;地主在大陆高原上的土地扩张了很多",
				"Utilize the fertilizer to keep the land fertile;利用化肥保持土地肥沃",
				"The grand commander demands thousands of sandy sandwiches;大司令官要成千个沙的三明治",
				"I infer that he is indifferent to differentiating the offers in different conferences;我推断他对区分不同会谈的报价漠不关心",
//				<----------------------------------------------4---------------------------------------->
				"The maximum plus or minus the minimum makes minute difference;最大值加上或者减去最小值只产生极小的差异",
				"The witty witness withdraws his words within minutes without any reason;诙谐的证人在几分钟之内无故地收回了他说的话",
				"The cake maker shakes a naked snake with the quaking rake without sake;蛋糕制造者无缘无故地用抖动的耙子摇一条赤裸的蛇",
				"By the crook, the cook looked through a cookbook before making hooked cookies;在溪边，厨子在做钩形饼干之前查阅了一本食谱",
				"The writer writes the white book quite quietly in quilt;作家在被子里十分平静地写白皮书",
				"On the chilly hillside, he is unwilling to write his will on the ten-shilling bill;在寒冷的山坡上,他不愿意将遗嘱写在十先令的账单上",
				"The weaver will leave for the heavy heaven;那位纺织工将要到阴沉的天国里去",
				"The handy left-hander left a handsome handkerchief on the handle of the handbag;手巧的左撇子把一方漂亮手帕留在手提包的提手上",
				"The thief chief achieved the theft of a handkerchief for mischief;贼首领完成了偷手帕的恶作剧",
				"I believe my brief words will relieve her grief;我相信我简短的话会减轻她的悲痛",
//				<-----------------------------------------------5---------------------------------------->
				"At the dock i'm shocked to see the pocket rocket made of a block of rock;在码头看到一块岩石做的小巧火箭,我感到震惊",
				"Standing under the outstanding rock, i misunderstood his standard standpoint;站在突出的岩石下,我误解了他的标准立场",
				"The substantial part of the constitution about the institution of institutes is substituted;宪法中有关设立协会的实质性部分被替换",
				"Spell smell! very well, the well-being for human being will swell;拼写气味(一词)!很好,人类的福利将会膨胀",
				"Once none of you is here, the man in throne will live alone in the lonely zone;一旦你们没有人在此,王位上的人就要孤独地生活在这个孤寂的地带",
				"Nowadays the once unknown snowy hill is well-known for snowstorm;如今那座曾经不出名的多雪小山因暴风雪而出名",
				"For instance, i can instantly know the constant distance;例如,我可以即刻知道该恒定距离",
				"The man beyond the bond is fond of the second wonderful diamond;那位不受约束的人喜欢第二颗奇异的钻石",
				"While sinking into thinking, the shrinking linkman drank the pink ink sprinkled on the wrinkly paper;陷入沉思时,退缩的联络员喝掉了洒在皱纹纸上的粉红色墨水",
				"The contribution distributor thinks the microcomputer pollution is absolutely beyond dispute;捐款分配者认为微机污染是绝对不容置疑的",
//				<-------------------------------------------------6----------------------------------------->
				"He repeatedly repeats, eat meat;他再三重复说:吃肉 ",
				"Having canceled X-ray scan, the cancerous candidate on the canvas ate the idle candles in the candy can;取消X线扫描后，帆布上的癌症候选人吃了糖果罐里的闲置蜡烛",
				"The dominant candidate is nominally nominated for president;占优势的候选人名义上被任命为总统",
				"The extravagant savage made the interior and exterior criteria of deterioration;奢侈的野蛮人制定了腐败的内外标准",
				"No, nobody's body is noble, nor is his;不,没有任何人的躯体是高贵的,他的也不是",
				"Axe the tax on taxis. Wax may relax the body;削减出租车的税费。蜂蜡可以使身体放松",
				"The man in mask asked me for a task,I let him put the basket on the desk in the dusk;戴面具的人向我要任务,我让他在黄昏时把篮子放到桌子上",
				"The lump jumped off the pump and bumped on the trumpet in the dump;傻大个跳下水泵撞到垃圾堆里的喇叭上",
				"On my request the conqueror questioned the man who jumped the queue;根据我的请求,征服者质问了插队者",
				"They are arguing about the document of the monumental instrument;他们在辩论关于那件不朽乐器的文献",
//				<---------------------------------------------------7----------------------------------------->
				"However, Lever never fevers, nevertheless, he is clever forever;无论如何,杠杆从未发烧;尽管如此,他始终机灵",
				"I never mind your unkind reminding that my grindstone hinders your cylinder;我决不介意你不友善的提醒说我的磨刀石妨碍了你的汽缸",
				"I feed the food to the bleeding man in the flood;我把食品喂给洪水中的那个流血的人",
				"It's a treason terror of the seasonal oversea seafood is reasonable;认为季节性的海外海鲜的价格是合理的就是背叛",
				"The veteran in velvet found that the diameter of the thermometer was one metre;穿天鹅绒的老兵发现温度计的直径为一米",
				"The cube in the tubular cup occupies one cubic meter,筒状杯中的立方体占有一个立方米(的体积)",
				"Put the spotless potatoes, tomatoes and tobacco atoms into the hot pot;把无斑点的土豆、番茄和烟草微粒放进热锅里",
				"The preacher preached to the teacher's teacup;传教士对着老师的茶杯说教",
				"My behavior is on behalf of half zebras,the algebra teacher said;我的行为代表了一半斑马的利益,代数老师说",
				"Unlike my uncle, I likely like that bike (bicycle);我不象叔叔,我很可能喜欢那辆自行车",
//				<---------------------------------------------------8----------------------------------------->	
				"On Revenue avenue, the grave traveler jumped the gravestone bravely;在税收大道（大街）上,严肃的旅行者勇敢地跳过墓碑",
				"The slave safely saved the sharp shavers in a cave nearby the cafeteria;奴隶将锋利的剃刀安全地保存在自助餐厅附近的洞穴里.",
				"Most hosts are hostile to the foremost ghost hostage almost to the utmost;极限大多数主人对最前面的幽灵人质的敌对态度几乎到了极顶.",
				"The mapper trapped in the gap tapped the tap wrapper with strap;陷在缝中的制图者用皮带轻击塞子套.",
				"The scout[skaut] with shoulder-straps shouted on the outermost route as a routine;戴肩章的侦察员照例在最外围的路线上叫喊.",
				"The reproached coach unloaded the loaves to the approachable roadside;遭到责备的教练把面包卸到可接近的路旁",
				"The news about the broadened breadth is broadcast abroad;宽度加宽的消息被广播到(也可be broadcasted)国外",
				"The motive of the emotional movie is to move the removed[ri’mu:vd]离开的 men;那部情感电影的动机在于感动被开除的人",
				"Otherwise, mother will go to another movie together with brother;不然,妈妈就和弟弟一起去看另一场电影",
				"Furthermore, we gathered leather and feather for the future colder weather;而且,我们收集了皮革和羽毛以应付将来更冷的天气",
//				<---------------------------------------------------9----------------------------------------->			
				"Before the premier, the old soldier scolds the cold weather;老兵当着首相的面咒骂寒冷的天气",
				"Whether the weather is good or bad, neither father nor I am going to the gathering;无论天气是好是坏,父亲和我都不去参加那个聚会",
				"The Particle party's partner participated in the particular Parliament;粒子党的合伙人参与了特别议会",
				"For convenience of intensive study, he has an intense intention of making friend with me;为便于强化学习，他有和我交朋友的强烈意向",
				"The virtueless girl's duty is to wash the dirty shirts and skirts in the outskirts;无美德女孩的职责就是在郊区洗脏衬衣和裙子",
				"I glimpsed the dancer balancing herself on the ambulance by chance;我碰巧瞥见舞蹈者在救护车上使自己保持平衡",
				"Balloon, baseball, basketball, football and volleyball all dance ballet on the volcano;气球、棒球、篮球、足球和排球都在火山上跳芭蕾舞",
				"A gallon of gasoline and the nylon overalls fall into the valley;一加仑汽油和尼龙工作裤（overall工作服）落进了山谷",
				"Palm calmly recalled the so-called caller;手掌平静地回忆了那个所谓的拜访者",
				"In the hall, the shallow challenger shall be allowed to swallow the swallows;在大厅里,肤浅的挑战者将被允许吞下燕子",
//				<---------------------------------------------------10----------------------------------------->			
				"The tall man installed a small wallet on the wall;高个男子把一小钱包安放到墙上",
				"Except dishonest ones, anyone who is honest can get honey, everyone thinks so;除了不诚实的人外,任何诚实的人都能得到蜂蜜,人人都这么想",
				"The exhausted man and the trustful guy thrust a knife into the rusty crust;精疲力竭的男子和深信不疑的家伙将一把刀子刺向生锈的外壳",
				"I finally find that the financial findings are binding;我终于发现财经调查结果具有约束力（的）",
				"At the windy window, the widow finds a blind snake winding（n卷；a蜿蜒的）;在当风的窗口,寡妇发现有条瞎眼蛇在游动",
				"I refuse to accuse Fuse of diffusing confusion;我拒绝控告导火索散播混乱",
				"He had an amusing excuse for executing the executive;对于处决决策人,他有一个可笑的理由",
				"At the dawn on the lawn the yawning drowned man began to frown;拂晓时在草坪上，打呵欠的溺水者开始皱眉头",
				"Mr. Brown owns the brown towels in the downtown tower;布朗先生拥有闹市区塔里的棕色毛巾",
				"Lots of pilots plot to dot the rotten robot;大批领航员策划给腐烂的机器人打点",
//				<---------------------------------------------------11----------------------------------------->				
				"In the hot hotel the devoted voter did not notice the noticeable notebook;在炎热的旅馆里,热心的投票者没有注意到显而易见的笔记本",
				"The notorious man's noted notation denotes a notable secret;那个臭名昭著的男子的著名符号代表一个值得关注的秘密",
				"Yes, yesterday was the my pay-day; I pay you the payment today;是的,昨天是我的发薪日,我今天付给你报酬",
				"Lay a layer of clay on the displayed layout before the relay race;接力赛之前在展示的陈设上铺一层黏土", 
				"The gay[gei] mayor maybe lay in the hay by the Baby bay, he says in dismay;他沮丧地说:快活的市长大概躺在婴儿湾边上的干草中",
				"The delayed player delegation stay on the playground;被耽搁的运动员代表团停留在操场上",
				"The X-rayed prayer preyed a gray tray;照过X光的祈祷者捕获了一个灰色盘子",
				"Anyway, the prayer swayed by me always goes away by subway;不管怎样,受我支配的祈祷者总是从地铁走向远方",
				"The chocolates on the plate stimulated my son to calculate;盘子里的巧克力鼓励了儿子进行计算",
				"One of my relatives, a late translator, translated a book relating to public relations;我的一位亲戚,一个已故(的)翻译,翻译了一本有关公共关系的书",
//				<---------------------------------------------------12----------------------------------------->	
				"He relates that he is isolated from his relatives;他叙述说他与亲戚们隔离开了",
				"The educator located the local location allocated to him;教育家定出了分配给他的局部的位置",
				"Comply with the compatible rule of complement when using compliments;使用问候语[恭维；敬意]时遵守补语的相容(的)规则",
				"The complicated indicator is dedicated to the delicate delicious machine;这个复杂的指示器被奉献给精密而美妙的机器",
				"Likewise, my bike gave a striking strike to the two men alike;同样,我的自行车给那两个相象的人惊人的打击",
				"The smoke choked the joking stroker at one stroke;烟一下(一笔；一举)呛住了(窒息；抑制)开玩笑的抚摩者",
				"Somewhere somebody sometimes does something good;在某处某人有时做某些好事",
				"Wherever I go, nowhere I like; I dislike everywhere;无论我到哪里,没有哪里为我喜欢,我讨厌每一个地方",
				"Therefore, the atmosphere is merely a sphere;因此大气层只不过是一个球体",
				"The funny cunning runner uses his gum gun before sunrise or after sunset;滑稽乖巧的赛跑者在日出之前或日落之后使用胶皮枪",
//				<---------------------------------------------------13----------------------------------------->	
				"The applause paused because of the cause caused by a cautious plausible clause;掌声停了是因为一条谨慎的似乎有理的条款引起的原因",
				"The county councilor encountered the accountant at the counter of a countryside shop;县委委员在一乡村商店的柜台边碰到了会计师",
				"I mounted the mountain and found a fountain with large amount of water;我登上那座山发现一个水量很大的喷泉",
				"Step by step, the sleepy creeper crawled into my sleeve to sleep;昏昏欲睡的爬虫(爬行者)一步一步爬进我的袖子里睡觉",
				"After a deep sleep, the weeping sweeper keeps on peeping the sheep on the steep;酣睡之后,哭泣的清扫者继续窥视峭壁上的羊",
				"The vice-adviser advised the reviser to devise a device for getting rid of vice;代理顾问建议校订者想出(设计，发明)一个根除恶习的计策",
				"The wise man used his wisdom in the vertical advertisement device;聪明人把智慧用在垂直的广告装置上",
				"With rhythm , the arithmetic teacher put the artist's artificial articles on the vehicle;算术老师把艺术家的人造(的)物品有节奏地放到运载工具里",
				"The smart star starts to make cart chart for the commencement;精明的明星开始制作授学位典礼用的马车图表",
				"The lady is glad to give the salad to the sad lad on the ladder;女士乐意把色拉送给梯子上的那位悲哀的小伙子",
//				<---------------------------------------------------14----------------------------------------->	
				"You mad madam, my dad doesn't like the bad badminton pad;你这个疯太太,我爸爸不喜欢这种坏羽毛球垫",
				"The one-legged beggar begins to beg eggs illegally;独腿乞丐开始非法讨蛋",
				"The promoter promptly  made a quotation for the remote control motors;发起人立刻制了一份遥控马达的报价单",
				"Each pea and peach on the beach can be reached by the peacock;海滩上的每一颗豌豆和桃子孔雀都能触及",
				"Although the plan was thorough , it was not carried through;尽管计划很周详(十分的，彻底的)，但是没有得到贯彻",
				"Thoughtful men ought not to be thoughtless about the drought;体贴的(深思的)人不应该对干旱考虑不周",
				"Rough cough is tough enough, Bough said while touching the torch;剧烈咳嗽是够难以对付的,大树枝在触摸手电筒时说道",
				"The football team stopped the steam stream with beams;足球队用横杆堵住了蒸汽流",
				"Ice-cream! he screamed in dream;冰淇淋!他在梦中惊叫道",
				"For example, this simple sample similar to his can be exemplified;例如,这件与他的相似的简单样品可以作为例证",
//				<---------------------------------------------------15----------------------------------------->	
				"The spy is shy of taking shelter on the shelf of the shell-like shed;间谍怕在壳子一样的棚里的架子上栖身",
				"The optional helicopter is adopted to help the optimistic helpless in the hell;可选用的直升飞机被用来帮助地狱里那些乐观的无助者",
				"The cell seller seldom sees the bell belt melt;小单间的卖主很少见到铃铛带子融化",
				"The costly post was postponed because of the frost;那件昂贵的邮件由于霜的缘故而延搁",
				"Srain brain on the train is restrained;在列车上过度用脑受到约束",
				"The gained grain drained away with the rain, all the pains were in vain again;收获的谷物随雨水流失了,所有辛劳又白费",
				"Cousin saw a group of couples in cloaks soak their souls in the soapy soup;表哥看见一群穿着斗篷的夫妇在肥皂汤[su:p]里浸泡灵魂",
				"The wounded founder bought a pound of compound;受伤的奠基人买了一磅[paund]化合物",
				"It's easy and feasible to control the disease after cease-fire;停火之后控制这种病很容易也可行(的)",
				"After a decrease, the price of the grease increases increasingly;下跌过一次之后，润滑脂的价格日益上涨",
//				<---------------------------------------------------16----------------------------------------->	
				"Please release that pleasant peasant teaser who brings us plenty of pleasure;请释放那个带给我们巨大快乐的友好的农民逗趣者",
				"In the canal, the Canadian analyzed the bananas;在运河里,那个加拿大人化验了香蕉",
				"I pointed out the joint on the coin at the disappointing appointment;在令人失望的约会上,我指出了硬币上的接头",
				"His parents apparently stare at the transparent cigarettes;他父母显然凝视着透明香烟",
				"The careful man is scarcely scared by the scarce parcel;细心男子勉强(简直不；仅仅)被罕见的包裹吓了一下",
				"I'm rarely aware that the square area is bare;我很少觉察到那个正方形区域是光秃秃的",
				"Beware the software in the warhouse during the warfare,” hare said glaring at me;兔子怒视着我说:“战争期间当心仓库里的软件",
				"I daren't declare that the shares are my spare fare and welfare on the farewell party;在告别会上,我不敢宣称这些股票是我的备用车费和福利",
				"The external and internal interference interrupts my interpretation at short intervals;内部和外部干涉(冲突)以很短的间隔打扰我翻译",
				"The form of the former formula is formally formulated;前一个分子式的形式得到正式表述",
//				<---------------------------------------------------17----------------------------------------->	
				"The performer reformed the performance of the transferred transformer;表演者改良了转让的变压器的性能",
				"Normally, enormous deformation is abnormal;通常，巨大的变形是不正常的",
				"The bookworm in uniform is informed of the storm;穿制服的书呆子[‘bukwə:m]得到暴风雨的消息",
				"The story about the six-storeyed dormitory tells a glorious history;关于六层楼宿舍的故事讲述一段光荣历史",
				"The perfume consumer presumably assumes that the volume is resumed;香水消费者假定地(推测上)设想音量已恢复",
				"The voluntary revolutionaries revolted like the outbreak of volcano;志愿(者)革命者们象火山爆发一样起义了",
				"It's resolved by resolution that the solution will be used to solve the involved problem;决议决定用这个办法解决那个复杂的问题",
				"The generous general's genuine genius is in making generators;那位慷慨[‘d3enərəs]将军的真正天才在于制造发电机",
				"Several severe federal generals drank the mineral water on the miner's funeral;好几个严厉的联邦将军在矿工的葬礼上喝了矿泉水",
				"The lean man leans on the clean bean plant to read a leaf leaflet;瘦人斜靠在干净的豆科植物上读叶片传单",


};
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
		System.out.println(num.length);
		for (int i = 70; i < num.length; i++) {
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
