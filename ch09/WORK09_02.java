//����:������@
//�ŧi�����@

interface autoMobile_setData
{ 
    //������k
    void setData();
}
//�ŧi�����G
interface autoMobile_showData
{ 
    //������k
    void showData();
}

//������@���O
class WORK09_02 implements autoMobile_setData, autoMobile_showData
{ 
    //�������
    int carLength, engCC, maxSpeed;
    //�غc�l
    public WORK09_02(String modelName)
    {
        System.out.println("BENZ�t�C�G"+ modelName +"�򥻸��");
    }
    //���s�w�q��H��k
    public void setData()
    {
        carLength = 400;
        engCC = 3200;
        maxSpeed = 280;
    }
    public void showData()
    {
        System.out.println("�������סG" + carLength);
        System.out.println("�T��CC�ơG" + engCC);
        System.out.println("�̰����t�G" + maxSpeed);
    }
    //�D�{���϶�
    public static void main(String args[])
    {
        WORK09_02 SLK2000 = new WORK09_02("SLK2000");
        SLK2000.setData();
        SLK2000.showData();
    }
}