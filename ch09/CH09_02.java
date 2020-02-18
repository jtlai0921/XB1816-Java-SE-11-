/*檔案:CH09_02.java 
 *說明:抽象類別計算面積實作*/

abstract class countArea {   //抽象父類別
    protected double length;    
    countArea(double x){
        length=x;
    }
    abstract double getArea();   //建立計算面積的抽象方法，不對方法做任何定義
}
class square extends countArea {
    square(double x){
        super(x);
    }
    double getArea(){     //在子類別中定義抽象方法
        return length*length;
    }
}
class cube extends countArea {
    cube(double x){
        super(x);
    }
    double getArea(){     //在子類別中定義抽象方法
        return (length*length)*6;   //立方體有6個面
    }
}
class CH09_02{
    public static void main(String[] args) {
        square squ=new square(12.5);
        cube cu=new cube(12.5);
        System.out.println("利用抽象方法，計算正方形的面積："+squ.getArea());
        System.out.println("利用抽象方法，計算立方體的面積："+cu.getArea());
    }
}