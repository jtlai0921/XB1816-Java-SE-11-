//�~�Ӫ�����
class Ball   // Ball���O�ŧi
{  
    // �������
    private int number; //�y�����X
    private String color; // �C��
    // �]�w�y�����X
    public void setNumber(int num) { number=num; }
    // �]�w��m
    public void setColor(String color) { this.color=color; }
    // ������k: ��ܲy�����
    public void showBall()
    {  // �L�X���
        System.out.println("�y���s��: " + number);
        System.out.println("�y����m: " + color);
    }
}
class Baseball extends Ball  // Baseball���O�ŧi
{  
    // �������
    private int price;  // ����
    // �غc�l
    public Baseball(int num, String color, int price)
    {  // �I�s�����O��������k
        setNumber(num);
        setColor(color);
        this.price = price;
    }
    // ��ܲy�����
    public void showBaseball()
    {  // ��ܴβy���
        System.out.println("====�βy���򥻸��====");
        showBall();      // �I�s�����O��������k
        System.out.println("�y������: " + price);
    }
}
// �D�{�����O
public class WORK08_02
{   
    // �D�{��
    public static void main(String[] args)
    {   
        // �ŧiBaseball���O���A���ܼƤΫإߪ���
        Baseball playboy = new Baseball(1002, "�Ŧ�", 500);
        Baseball nike= new Baseball(2003, "����", 650);
        playboy.setColor("�¦�"); 
        playboy.showBaseball();    
        nike.showBaseball();
    }
}