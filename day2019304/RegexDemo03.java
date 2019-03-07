package day2019304;
/**
 * 
 * @author 40272
 *替换功能 
 *        String类的功能
 *        public String replaceAll(String regex,String replacement)
 */
public class RegexDemo03 {
	public static void main(String[] args) {
		//需求:论坛中不能出现数字字符，用*替换
		String s = "headsf2314124afoajsf";
		String ss = s.replace("\\d+", "***");
		
		System.out.println(ss);
				
	}

}
