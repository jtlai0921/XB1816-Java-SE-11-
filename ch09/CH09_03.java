/*�ɮ�:CH09_03.java 
 *����:�z�L�����O���ܼơA�Ӧs���l���O������*/

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
        System.out.println("�Q�Ω�H��k�A�p�⥿��Ϊ����n�G"+cA.getArea());
		
        cA=new cube(12.5);
        System.out.println("�Q�Ω�H��k�A�p��ߤ��骺���n�G"+cA.getArea());
    }
}