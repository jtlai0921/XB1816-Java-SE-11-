/*�ɮ�:CH08_11.java 
 *����:�l�����O����������*/
//�D�n���O
public class CH08_11 extends SuperClass{
    //�h����¦���OAccounting��k
    public void Accounting(int x, int y, int z){
        int total = x + y + z;
        System.out.println("�o�O�ѭl�����O�h����Accounting()��k");
        System.out.println(x + " + " + y + " + " + z + " = " + total + "\n");
    }
    //������¦���OAccounting��k
    public void Accounting(int x, int y){
        int total = x * y;
        System.out.println("�o�O�ѭl�����O������Accounting()��k");
        System.out.println(x + " * " + y + " = " + total + "\n");
    }
    //�D�{���϶�
    public static void main(String args[]){
        //�إߥD�{������
        CH08_11 myObject = new CH08_11();
        //�I�s�l�����O�h����Accounting()��k
        myObject.Accounting(12, 36, 60);
        //�I�s�l�����O������Accounting()��k
        myObject.Accounting(7, 5);
    }
}

//�ŧi��¦���O
class SuperClass{
    //�ŧi������kAccounting
    public void Accounting(int x, int y){
        int total = x + y;
    }
}