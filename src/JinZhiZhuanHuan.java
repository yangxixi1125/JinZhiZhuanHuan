import java.util.Scanner;

/**
 * 输入10进制数转化16进制，然后转10进制
 * @author yangxixi
 *
 */

public class JinZhiZhuanHuan {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("输入10进制数：");
		int num = Input.nextInt();
		//转换10-16
		String num16 = num10_16(num) ;
		System.out.println();
		//输出16进制数（字符串形式）
		System.out.println(num16);
		
		//转换16-10
		num = num16_10(num16);
		System.out.println(num);

	}
	
	/**
	 *     10进制数转化16进制
	 * @param num 要转换的10进制数
	 * @return nu16 16进制数
	 */
	public static String num10_16(int num) {
		String nu16 = "";
		int temp = Integer.MIN_VALUE;
		while(num >= 16) {
			temp = num % 16;
			if(temp > 9) {
				nu16 = (char)(temp + 'A' - 10) + nu16;
			}
			else {
				nu16 = (char)(temp + '0' ) + nu16;
			}
			num = num / 16;
		}
		if(num > 9) {
			nu16 = (char)(num + 'A' - 10) + nu16;
		}
		else {
			nu16 = (char)(num + '0' ) + nu16;
		}
		return nu16;
	}
	
	public static int num16_10(String num16) {
		int num = 0;
		char temp ;
		for(int i = 0; i < num16.length(); i++) {
			
			temp = num16.charAt((num16.length() - i -1));
			if((temp >= '0') && (temp <= '9')) {
				num = (int) ( (int)(temp - '0')*Math.pow(16, i) ) + num;
				
			}
			else {
				num = (int) ( (int)(temp - 'A' + 10)*Math.pow(16, i) ) + num;
				
			}
			
		}
		
		return num;
		
	}
	
	

}
