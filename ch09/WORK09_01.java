//��H���O
abstract class autoMobile
{ 
    //��H��k
    abstract public void setData();
    abstract public void showData();
}
//�l�����O
class BENZ_Serial extends autoMobile
{ 
    //�������
    private int carLength, engCC, maxSpeed;
    //�غc�l
    public BENZ_Serial(String modelName)
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
}
//�D�n���O
public class WORK09_01
{
    public static void main(String args[])
    { 
        //��@��H���O����
        autoMobile myCar = null;
        //��@�l�����O����
        BENZ_Serial SLK2000 = new BENZ_Serial("SLK2000");
        //��@�h��
        myCar = SLK2000;
        myCar.setData();
        myCar.showData();
    }
}