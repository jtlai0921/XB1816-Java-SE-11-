/*�ɮ�:CH09_01.java 
 *����:��H���O��@*/
//��H��¦���ORemoteControl
abstract class RemoteControl{
    //���O�غc�l
    RemoteControl(){
        System.out.print("�ϥθU�໻�����G");
    }
    //��H������kpowerOn()
    abstract public void powerOn();
}

//�l�����OMyTV
class MyTV extends RemoteControl{
    //������H������k
    public void powerOn(){
        System.out.println("�}�ҹq����...");
        System.out.println("�q�����}�Ҧ��\!!\n");
    }
}

//�l�����OMyAirCon
class MyAirCon extends RemoteControl{
    //������H������k
    public void powerOn(){
        System.out.println("�}�ҧN���...");
        System.out.println("�N����}�Ҧ��\!!\n");
    }
}

//�D�n���O
public class CH09_01{
    //�D�{���϶�
    public static void main(String args[]){
        //�إ߰�¦���O����
        RemoteControl myControl;
        //�૬��MyTV����
        myControl = new MyTV();
        //�I�s���s�w�q��powerOn()��k
        myControl.powerOn();
        //�૬��MyAirCon����
        myControl = new MyAirCon();
        //�I�s���s�w�q��powerOn()��k
        myControl.powerOn();
    }
}