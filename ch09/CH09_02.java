/*�ɮ�:CH09_02.java 
 *����:��H���O�p�⭱�n��@*/

abstract class countArea {   //��H�����O
    protected double length;    
    countArea(double x){
        length=x;
    }
    abstract double getArea();   //�إ߭p�⭱�n����H��k�A�����k������w�q
}
class square extends countArea {
    square(double x){
        super(x);
    }
    double getArea(){     //�b�l���O���w�q��H��k
        return length*length;
    }
}
class cube extends countArea {
    cube(double x){
        super(x);
    }
    double getArea(){     //�b�l���O���w�q��H��k
        return (length*length)*6;   //�ߤ��馳6�ӭ�
    }
}
class CH09_02{
    public static void main(String[] args) {
        square squ=new square(12.5);
        cube cu=new cube(12.5);
        System.out.println("�Q�Ω�H��k�A�p�⥿��Ϊ����n�G"+squ.getArea());
        System.out.println("�Q�Ω�H��k�A�p��ߤ��骺���n�G"+cu.getArea());
    }
}