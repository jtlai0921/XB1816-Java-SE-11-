/*�ɮ�:CH08_10.java 
 *����:�l�����O�������h��*/
//�D�n���O
public class CH08_10 extends SuperClass{
    //�h����¦���OtotalAverage��k
    public void totalAverage(int x, int y, int z){
        int total = (x + y + z) / 3;
        System.out.println("�o�O�ѭl�����O�h����totalAverage()��k");
        System.out.println(x + " + " + y + " + " + z + " / 3 = " + total + "\n");
    }
	//�D�{���϶�
    public static void main(String args[]){
        //�إߥD�{������
        CH08_10 myObject = new CH08_10();
        //�I�s�~�ө��¦���O��totalAverage��k
        myObject.totalAverage(64, 48);
        //�I�s�l�����O�h����totalAverage��k
        myObject.totalAverage(32, 24, 58);
    }
}

//�ŧi��¦���O
class SuperClass{
    //�ŧi������ktotalAverage
    public void totalAverage(int x, int y){
        int total = (x + y) / 2;
        System.out.println("�o�O�~�ө��¦���O��totalAverage()��k");
        System.out.println(x + " + " + y + " / 2 = " + total + "\n");
    }
}