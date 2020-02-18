// 計算第n項費伯那序列的遞迴程式
public class WORK04_02 {
    static int fib(int n){
        if(n==0) 
            return 0;
        if(n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2); //遞迴引用本身2次
    }
    public static void main(String args[]){
    // 建立Scanner物件
    java.util.Scanner sc=
        new java.util.Scanner(System.in);
    System.out.print("請輸入費伯那數= ");
    int n=sc.nextInt();
    for (int i=0;i<=n;i++)
        System.out.println("fib("+i+")= "+fib(i));
    }
}