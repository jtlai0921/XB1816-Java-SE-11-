/*�ɮ�:CH08_08.java 
 *����:��¦���O�غc�l�~�����Y*/
//�~�ө�SuperClass���{���D�n���O
public class CH08_08 extends SuperClass{
    //�D�{���϶�
    public static void main(String args[]){
        //�إߥD�{������
        CH08_08 myObject = new CH08_08();
        //�I�s��¦���O�غc�l
        myObject.SuperClass();
    }
}

//�ŧi��¦���O
class SuperClass{
     public SuperClass(){
    System.out.println("�o�O�Ѱ�¦���OSuperClass�غc�l" + 
		       "�ҿ�X���r��");
    }
}