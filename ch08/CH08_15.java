/*�ɮ�:CH08_15.java 
 *����:���󪺦h��*/
//��¦���ORemoteControl
class RemoteControl{
    //���O�غc�l
    RemoteControl(){
        System.out.print("�ϥθU�໻�����G");
    }
    //������kpowerOn()
    public void powerOn(){};
}

//�l�����OMyTV
class MyTV extends RemoteControl{
    //���s�w�q��¦���O��powerOn()��k
    public void powerOn(){
        System.out.println("�}�ҹq����...");
        System.out.println("�q�����}�Ҧ��\!!\n");
    }
}

//�l�����OMyAirCon
class MyAirCon extends RemoteControl{
    //���s�w�q��¦���O��powerOn()��k
    public void powerOn(){
        System.out.println("�}�ҧN���...");
        System.out.println("�N����}�Ҧ��\!!\n");
    }
}

//�D�n���O
public class CH08_15{
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