/*檔案:CH09_05.java 
 *說明:利用介面變數，建立使用物件
 */

interface countArea {   //建立介面
    final double length=12.5;    //變數關鍵字為final
    public abstract double getArea();   
}
class square implements countArea {     //實作介面，加上關鍵字implements
    public double getArea(){ 
        System.out.println("呼叫的是square的getArae()");
        return length*length;
    }
}
class cube implements countArea {
    public double getArea(){     
        System.out.println("呼叫的是cube的getArae()");
        return (length*length)*6;   
    }
}
class CH09_05{
    public static void main(String[] args) {
        countArea cA;
        cA=new square();
        System.out.println("利用實作介面，計算正方形的面積："+cA.getArea());
		
        cA=new cube();
        System.out.println("利用實作介面，計算立方體的面積："+cA.getArea());
    }
}