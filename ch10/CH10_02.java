/*檔案:CH10_02.java
 *說明:Math類別的計算方法
 */ 
public class CH10_02{
    public static void main(String[] args){
        int num1=68,num2=77;
        int Max=Math.max(num1,num2);
        System.out.println("Max="+Max);//找最大值
        double d1=45.67,d2=86.11;
        double min=Math.min(d1,d2);//找最小值
        System.out.println("min="+min);
 		
        System.out.println("次方與開根號的計算:");
        int a=5,b=4,c=25;
        System.out.println(a+"的"+b+"次方="+Math.pow(a,b));//計算次方
        System.out.println(c+"的開根號="+Math.sqrt(c));//計算開根號
    }	
}