package day2019301;

public class StringBufferDemo03 {
	public static void main(String[] args) {
		String s = "mnanm";
		boolean b2 = isDuicheng(s);
		System.out.println(b2);
	}
	public static boolean isDuicheng(String s) {
	
		//·´×ª
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String ss = new String(s);
		return ss.equals(s);
		
		
		
	}

}
