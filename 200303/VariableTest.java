
public class VariableTest {

	public static void main(String[] args) {
		// 痕呪 
		int num = 100;					//汽戚斗 展脊(舛呪莫 4byte) 痕呪戚硯 = 軒斗群. 痕呪拭 持奄澗 井壱澗 痕呪研 薄仙 紫遂馬走 省澗陥澗 税耕
		num = 200;						//持失吉 num 痕呪拭 200戚虞澗 歯稽錘 葵 陥獣 企脊背捜 
		char ch = ' ';					//' '精 因拷 庚切(space ber)稽 紫遂 亜管敗. ''幻 紫遂 X
		char ch2 = '廃'; 				//2byte 照拭 買遂鞠澗 汽戚斗 庚切 馬蟹幻 脊径 亜管
		//char ch3 = 'abc';     		//汽戚斗亜 廃鯵 戚雌戚糠稽 char 紫遂 X
		String str = "";				//庚切伸精 ""(搾嬢赤澗 庚切伸)亜 亜管廃汽 庚切澗''亜 災亜管, 巷情亜亜 脊径戚 鞠嬢醤敗. 庚切研 朔因娃生稽 紫遂馬形檎 '\0'聖 脊径背醤敗
		String str2 = null;		
		num = 300;

		//雌呪
		final float PI;					//森鉦嬢 汽戚斗展脊
		PI = 4.0f;						//雌呪澗 葵聖 痕井拝 呪 蒸製
		//PI = 3.14f;
		
		
		int a = 10;						//舛呪 
		float f = a;					//叔呪
		/*
		System.out.println(f);			//f澗 窒径背爽檎辞 紫遂梅奄 凶庚拭 井壱亜 紫虞像
		
		float realNumber = 3.14f;		//real引 number税 杯失嬢奄 凶庚拭 砧腰属 舘嬢税 獣拙聖 企庚切稽 拙失背捜
		System.out.println(realNumber);
		
		System.out.printf("%.4f",realNumber);//社呪繊 n切軒猿走 妊獣馬壱 粛聖 凶 %.nf稽 拙失
		*/
		
		
		//(切戟)莫痕発
		// 切疑莫痕発 - (章獣旋/幸獣旋)莫痕発
		// 悪薦莫痕発 - 誤獣旋莫痕発
		int n1 = 5;
		int n2 = 2;
		//蟹完疾 : / 
		System.out.println(((float)n1)/n2);
		//1.float痕鉢 2.域至 授辞企稽 遭楳馬惟喫
		//1)System.out.println((float)(n1/n2));
		//舛呪晦軒税 蟹刊奄亜 鞠糠稽 2拭 企廃 莫痕発戚 鞠嬢獄顕 
		//2)System.out.println((float)n1/n2);  
		//n1引 n2 掻拭 n1幻 float亜 鞠嬢 獄顕. 胤硲澗 胤硲 及拭幻 赤澗 葵拭 企背 莫痕発聖 敗
		
		
		//陥献 切戟莫 娃税 尻至
		//n1 = 5.0f;//痕呪税 展脊戚 痕発馬走澗 省製=>n1戚虞澗 因娃精 integer n1切端研 莫痕発馬澗惟 焼艦壱, n1拭 赤澗 汽戚斗研 莫痕発馬澗依戚糠稽
		//3 + 4 * 5 = 23  => 3 + (4 * 5) = 23 or (3 + 4) * 5 = 35
		//System.out.println(n1/n2);  	  //社呪繊 戚馬税 蟹袴走亜 謝叔鞠澗 神嫌亜 降持敗
		
		float f1 = 3.14f;
		//int nf = f1;					 //笛暗研 拙精暗稽 郊荷檎辞 0.14 汽戚斗亜 劾焼亜糠稽 災亜管
		int nf = (int)f1;				 //汽戚斗 蒸嬢霜依 硝壱 赤生艦猿 益撹 痕井馬虞澗 税耕. 悪薦旋生稽 莫痕発
										
		
		//舛呪 < 叔呪 < 庚切伸 
		//収切税 庚切伸 痕発
		String str3 = "abc";
		int ntoa = 10;
		//str3 = (String)ntoa; 			//展脊戚 含虞辞 隔走 公背辞 莫痕発 背操醤馬澗汽 string莫痕発精 戚訓縦生稽 馬檎 神嫌降持
		str3 = ntoa + "";				
		System.out.println(str3);
				
		
		//庚薦
		//陥製 掻 蝶什闘尻至切税 持繰戚 亜管廃 庚舌精?
		int num1 = 10;					//4byte
		//1. byte稽 痕発
		     byte b1 = (byte)num1;		//4byte->1byte
		//2. double稽 痕発
		     double d = num1;			//4byte->4byte
		//3. short稽 痕発
		     short s = (short)num1;		//4byte->2byte
		//4. long生稽 痕発
		     long l = num1;				//4byte->4byte
		
		//岩 2,4 => byte人 short澗 int左陥 拙奄 凶庚拭 持繰戚 災亜管敗. 切疑莫痕発精 拙精暗拭辞 笛暗稽 亜管敗
		
		//神獄巴稽酔/情希巴稽酔
		byte b = 127;				//-128~127亜走戚糠稽 byte b = 128精 災亜管
		b++;
		
		System.out.println(b);		//128戚 焼観 -128戚 蟹身. 0111/1111(127) + 1 => 1000/0000(-128)
									//痕呪研 広嬢辞 紫遂馬澗 壕伸拭辞 降持敗
		}
		
		
		
		
		
		
	

}


/* 匝郊嘩(enter)猿走 汽戚斗稽 昔縦背操醤敗
 * 採硲 +(丞税 舛呪), -(製税 舛呪) 収切 展脊 byte 256(2^8)亜走  short int long float double
 * 骨是澗 亜走呪 2^8鯵幻鏑 紫遂拝 呪 赤製
 * けけけけけけけけ拭辞 湛腰属澗 採硲 搾闘
 * 0析凶 + 1析凶 -研 蟹展蛙 益君糠稽 -128~127(0聖 匂敗馬奄 凶庚)猿走 蟹展馨 呪 赤製
 * -128~-1猿走 紫遂馬走 省生檎 採硲搾闘 紫遂拝 琶推蒸奄 凶庚拭 unsigned稽 誤獣背捜
 * 
 * 
 * 
 * 
 */
