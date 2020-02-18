/*檔案:CH10_03.java
 *說明:Math類別的數值轉換方法
 */ 
public class CH10_03{
    public static void main(String[] args){
 		
        double d1=12.53,d2=12.5;
        System.out.println("d1="+d1);	
        System.out.println("rint("+d1+") ="+Math.rint(d1));
        System.out.println("round("+d1+") ="+Math.round(d1));
 		
        System.out.println("d2="+d2);	
        System.out.println("rint("+d2+") ="+Math.rint(d2));
        System.out.println("round("+d2+") ="+Math.round(d2));

        double d3=156.347;
        //不同位數的進位法
        System.out.println("取小數後2位 ceil("+d3+") ="+Math.ceil(d3*100)/100);
        System.out.println("取小數前2位 floor("+d3+")="+Math.floor(d3/100)*100);
        float f1=-12.45f;
        System.out.println(f1+"的絕對值="+Math.abs(f1));
 		
        double rad=60;
        //將角度轉換成弧度
        System.out.println("角度("+rad+") = "+"弧度("+Math.toDegrees(60)+")");
    }	
}