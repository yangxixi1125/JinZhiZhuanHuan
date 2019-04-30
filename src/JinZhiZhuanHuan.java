import java.util.Scanner;

/**
 * ����10������ת��16���ƣ�Ȼ��ת10����
 * ����ֻ��ת������
 * @author yangxixi
 *
 */

public class JinZhiZhuanHuan {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("����10��������");
		int num = Input.nextInt();
		//ת��10-16
		String num16 = num10_16(num) ;
		System.out.println();
		//���16���������ַ�����ʽ��
		System.out.println(num16);
		
		//ת��16-10
		num = num16_10(num16);
		System.out.println(num);

	}
	
	/**
	 *     10������ת��16����
	 * @param num Ҫת����10������
	 * @return nu16 16������
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
	
	/**
	 * 
	 * @param num16 16������
	 * @return 10������
	 */
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
