package day2019304;
/**
 * 
 * @author 40272
 *�滻���� 
 *        String��Ĺ���
 *        public String replaceAll(String regex,String replacement)
 */
public class RegexDemo03 {
	public static void main(String[] args) {
		//����:��̳�в��ܳ��������ַ�����*�滻
		String s = "headsf2314124afoajsf";
		String ss = s.replace("\\d+", "***");
		
		System.out.println(ss);
				
	}

}
