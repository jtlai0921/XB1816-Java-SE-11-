/*�ɮ�:CH08_12.java 
 *����:super����r������*/
//�D�n���O
public class CH08_12 extends SuperClass{
    //�l�����O������showData��k
    public void showData(){
        System.out.println("�ѭl�����O����showData()������k��X���r��!!");
    }
    //�l�����O�ۭq��k
    public void doSuper(){
        //�Q��super�I�s��¦���O��showData()������k
        super.showData();
    }
    //�D�{���϶�
    public static void main(String args[]){
        //�إߥD�{������
        CH08_12 myObject = new CH08_12();
        //�I�s������showData()��k
        myObject.showData();
        //�I�s�ۭq��doSuper()��k
        myObject.doSuper();
    }
}

//�ŧi��¦���O
class SuperClass{
    //�ŧi��¦���O������k
    public void showData(){
        System.out.println("�Ѱ�¦���OshowData()������k��X���r��!!");
    }
}