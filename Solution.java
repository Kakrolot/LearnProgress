package learnprogress;
/*��һ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
���һ���㷨�����������ܻ�ȡ�������������Ծ����ܵ���ɸ���Ľ��ף��������һ֧��Ʊ����*/
public class Solution {
		
	public int maxProfit(int[] prices) {
		int sum=0;
		int p=0;
		for(int i=0;i<prices.length;i++)
		{
			if (prices[i]<prices[i+1])
			{
				p=prices[i+1]-prices[i];
				sum=sum+p;
			}
		}
		return sum;
	
		
	}
	}


