/*�ɮ�:CH09_07.java 
 *����:�إߤl����*/

interface countArea {   //�إߤ�����
    final double length=12.5;    //�ܼ�����r��final
    public abstract double getArea();   
}
interface countVolume extends countArea {   //�إߤl����
    public abstract double getVolume();   
}

class cube implements countVolume {
    public double getArea(){     
        System.out.println("�I�s���Ocube��getArea()");
        return (length*length)*6;   
    }
    public double getVolume(){     
        System.out.println("�I�s���Ocube��getVolume()");
        return (length*length*length);   
    }
}
public class CH09_07{
    public static void main(String[] args) {
        cube cu=new cube();
        System.out.println("�Q�Ϋإߤl�����A�p��ߤ��骺���n�G"+cu.getArea());
        System.out.println("�Q�Ϋإߤl�����A�p��ߤ��骺��n�G"+cu.getVolume());
    }
}