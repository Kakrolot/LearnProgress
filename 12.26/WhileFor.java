package learnprogress;

import sun.net.www.content.audio.x_aiff;

public class WhileFor {
	public static void main(String[] args) {
		for(int x=100;x<1000;x++){
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			if(x==(ge*ge*ge+shi*shi*shi+bai*bai*bai)){
				System.out.println(x);
			}
		}
		int x=100;
		while(x<1000){
			int ge=x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			if(x==(ge*ge*ge+shi*shi*shi+bai*bai*bai)){
				System.out.println(x);
			}
			x++;
		}
}
}
