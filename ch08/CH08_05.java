/*�ɮ�:CH08_05.java 
 *����:�I�s�~�����Oprotected�����d��*/
//�ŧi�D�{�����O�æV�W�~�ө�~�����OSetString
public class CH08_05 extends SetString{
    //�ŧi�D���O��������k
    public void resetData(){
    /*�Q�Ρu���O�W��.������ơv�榡�A
     *���s�w�q�~�����O��protected�������*/
    SetString.protectedString = "�ѥD�{��CH08_05�����s�w�q��" + 
		                "protected�������";
    }
    //�D�{��
    public static void main(String[] args){
        //�إߥD���O����
        CH08_05 myObject = new CH08_05();
        //�I�s�ۭq��������k
        myObject.resetData();
        //�I�s�~�Ӫ�protected������k
        SetString.protectedData();
    }
}