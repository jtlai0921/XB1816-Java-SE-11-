/*�ɮ�:CH08_09.java 
 *����:�l�����O����P��¦���O�غc�l�~�����Y*/
//�~�ө�SuperClass���{���D�n���O
public class CH08_09 extends SuperClass{
    //�l�����O�غc�l
    public CH08_09(){
        System.out.println("�o�O�ѭl�����O�غc�l�ҿ�X���r��");
    }
    //�D�{���϶�
    public static void main(String args[]){
        new CH08_09();
    }
}

//�ŧi��¦���O
class SuperClass{
    public SuperClass(){
        System.out.println("�o�O�Ѱ�¦���OSuperClass�غc�l" + 
		           "�ҿ�X���r��");
    }
}