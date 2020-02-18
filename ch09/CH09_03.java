/*檔案:CH09_03.java 
 *說明:透過父類別的變數，來存取子類別的物件*/

abstract class countArea {   
    protected double length;    
    countArea(double x){
        length=x;
    }
    abstract double getArea();   
}
class square extends countArea {
    square(double x){
        super(x);
    }
    double getArea(){    
        return length*length;
    }
}
class cube extends countArea {
    cube(double x){
        super(x);
    }
    double getArea(){     
        return (length*length)*6;  
    }
}
class CH09_03{
    public static void main(String[] args) {
        countArea cA;
        cA=new square(12.5);
        System.out.println("利用抽象方法，計算正方形的面積："+cA.getArea());
		
        cA=new cube(12.5);
        System.out.println("利用抽象方法，計算立方體的面積："+cA.getArea());
    }
}