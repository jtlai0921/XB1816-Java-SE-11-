/*�ɮ�:CH09_05.java 
 *����:�Q�Τ����ܼơA�إߨϥΪ���
 */

interface countArea {   //�إߤ���
    final double length=12.5;    //�ܼ�����r��final
    public abstract double getArea();   
}
class square implements countArea {     //��@�����A�[�W����rimplements
    public double getArea(){ 
        System.out.println("�I�s���Osquare��getArae()");
        return length*length;
    }
}
class cube implements countArea {
    public double getArea(){     
        System.out.println("�I�s���Ocube��getArae()");
        return (length*length)*6;   
    }
}
class CH09_05{
    public static void main(String[] args) {
        countArea cA;
        cA=new square();
        System.out.println("�Q�ι�@�����A�p�⥿��Ϊ����n�G"+cA.getArea());
		
        cA=new cube();
        System.out.println("�Q�ι�@�����A�p��ߤ��骺���n�G"+cA.getArea());
    }
}