/*
	水仙花数

	需求：
		统计“水仙花数”一共有多少个，并在控制台输出个数
 */

public class ForTest05 {
	public static void main(String[] args) {
		//定义个，十，百变量用于保存个，十，百位数。
		int ge=0;
		int shi=0;
		int bai=0;
		//定义变量count，用于保存"水仙花数"的数量，初始值为0
		int count=0;
		for(int i=100 ;i<=999;i++){
			//获取每一位上的值
			bai=i/100;
			shi=i/10%10;
			ge=i%10;
			//判定条件是将三位数中的每个数值取出来，计算立方和后和原始数字比较是否相等
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				//满足条件使计数器+1
				count++;
			}
		}
		//打印结果
		System.out.println("水仙花数共有:"+count+"个。");
	}
}