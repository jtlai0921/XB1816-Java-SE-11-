/*�ɮ�:CH08_02.java ������O�~�ӽd��*/
//�ŧi��¦���O
class Accounting{
    //�ŧi������k
    public void plus(int x, int y){
    	int total = x + y;
    	System.out.println(x + " + " + y + " = " + total);
    }
    public void times(int x, int y){
    	int total = x * y;
    	System.out.println(x + " * " + y + " = " + total);
    }
    public void divided(int x, int y){
    	int total = x / y;
    	System.out.println(x + " / " + y + " = " + total);
    }
}

//�ŧi�{���D�n���O���~�ө�Accounting
public class CH08_02 extends Accounting{
    //�[�J�ۭq���O��k
    public void minus(int x, int y){
        int total = x - y;
        System.out.println(x + " - " + y + " = " + total);
    }
    //�D�{��
    public static void main(String[] args){
        //��@�D�{�����O����
        CH08_02 myObject = new CH08_02();
        //�I�s�~��Accounting���O��������k
        myObject.plus(100, 30);
        myObject.times(100, 30);
        myObject.divided(100, 30);
        //�I�s�ۭq��������k
        myObject.minus(100, 30);
    }
}