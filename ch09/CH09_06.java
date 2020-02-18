/*檔案:CH09_06.java 
 *說明:介面進階操作：實作多重繼承*/

interface countArea {   //建立第一個介面
    final double length=12.5;    //變數關鍵字為final
    public abstract double getArea();   
}
interface countVolume {   //建立第二個介面
    final double hight=5;    //變數關鍵字為final
    public abstract double getVolume();   
}
class cube implements countArea,countVolume {
    public double getArea(){     
        System.out.println("呼叫的是cube的getArea()");
        return (length*length)*6;   
    }
    public double getVolume(){     
        System.out.println("呼叫的是cube的getVolume()");
        return (length*length*hight);   
    }
}
class CH09_06{
    public static void main(String[] args) {
        cube cu=new cube();
        System.out.println("利用多重繼承，計算立方體的面積："+cu.getArea());
        System.out.println("利用多重繼承，計算立方體的體積："+cu.getVolume());
    }
}