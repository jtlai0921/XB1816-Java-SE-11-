/*�ɮ�:CH08_03.java �~�ӥ~�����O�d��*/
//�ŧi�{���D�n���O���~�ө�~���{����TotalSum���O
public class CH08_03 extends TotalSum{
    //�[�J�ۭq���O��k
    //�D�{��
    public void average(int x, int y){
        int total = (x + y) / 2;
        System.out.println(x + " �P " + y + " �������Ȭ��G " + total);
    }
    public static void main(String[] args){
        //��@�D�{�����O����
        CH08_03 myObject = new CH08_03();
        //�I�s�~��TotalSum���O��������k
  	TotalSum.totalSum(100, 30);
  	//�I�s�ۭq��������k
  	myObject.average(100, 30);
    }
}