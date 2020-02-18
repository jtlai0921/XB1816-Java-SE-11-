/*檔案:CH09_07.java 
 *說明:建立子介面*/

interface countArea {   //建立父介面
    final double length=12.5;    //變數關鍵字為final
    public abstract double getArea();   
}
interface countVolume extends countArea {   //建立子介面
    public abstract double getVolume();   
}

class cube implements countVolume {
    public double getArea(){     
        System.out.println("呼叫的是cube的getArea()");
        return (length*length)*6;   
    }
    public double getVolume(){     
        System.out.println("呼叫的是cube的getVolume()");
        return (length*length*length);   
    }
}
public class CH09_07{
    public static void main(String[] args) {
        cube cu=new cube();
        System.out.println("利用建立子介面，計算立方體的面積："+cu.getArea());
        System.out.println("利用建立子介面，計算立方體的體積："+cu.getVolume());
    }
}