/*�ɮ�:CH09_06.java 
 *����:�����i���ާ@�G��@�h���~��*/

interface countArea {   //�إ߲Ĥ@�Ӥ���
    final double length=12.5;    //�ܼ�����r��final
    public abstract double getArea();   
}
interface countVolume {   //�إ߲ĤG�Ӥ���
    final double hight=5;    //�ܼ�����r��final
    public abstract double getVolume();   
}
class cube implements countArea,countVolume {
    public double getArea(){     
        System.out.println("�I�s���Ocube��getArea()");
        return (length*length)*6;   
    }
    public double getVolume(){     
        System.out.println("�I�s���Ocube��getVolume()");
        return (length*length*hight);   
    }
}
class CH09_06{
    public static void main(String[] args) {
        cube cu=new cube();
        System.out.println("�Q�Φh���~�ӡA�p��ߤ��骺���n�G"+cu.getArea());
        System.out.println("�Q�Φh���~�ӡA�p��ߤ��骺��n�G"+cu.getVolume());
    }
}