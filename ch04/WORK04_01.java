//以遞迴來計算所0!~n!的函數值
public class WORK04_01 {
    static int factorial(int n){  
    if(n== 1 || n==0) //遞迴終止的條件
        return 1;
    else
	return n* factorial(n-1);
    }
    public static void main(String args[]){
    // 建立Scanner物件
    java.util.Scanner sc=
        new java.util.Scanner(System.in);
    System.out.print("請輸入階乘數= ");
    int n=sc.nextInt();
    for (int i=0;i<=n;i++)
        System.out.println(i+"!= "+factorial(i));
    }
}