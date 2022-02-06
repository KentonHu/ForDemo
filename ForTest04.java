/*
	水仙花数

	需求：
		在控制台输出所有的“水仙花数”
 */

public class ForTest04 {
	public static void main(String[] args) {
		//输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束。
		/*
			for(int i=100 ;i<=999;i++){
			
			}
		 */
		int ge=0;
		int shi=0;
		int bai=0;
		System.out.println("以下是所有的水仙花数。");
		for(int i=100 ;i<=999;i++){
			//获取每一位上的值
			bai=i/100;
			shi=i/10%10;
			ge=i%10;
			//判定条件是将三位数中的每个数值取出来，计算立方和后和原始数字比较是否相等
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				//输出满足条件的数字就是水仙花数
				System.out.println(i);
			}
		}
	}
}