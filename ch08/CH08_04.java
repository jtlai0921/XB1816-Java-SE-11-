/*�ɮ�:�I�s�~�����Opublic�����d��*/
//�ŧi�{���D�n���O
public class CH08_04{
    //�ŧi�D���O��������k
    public void showData(){
        //�I�s�~�����Opublic������k
        String myStr = setData.setStr();
        System.out.println(myStr);
        //�s���~�����Opublic�������
        setData.myStr = "��D���O�����s�w�q��public�������!!";
        myStr = setData.setStr();
        System.out.println("�I�s�Q�D���O���s�w�q���~�����Opublic�������\n" + 
		            myStr);
    }
    //�D�{��
    public static void main(String[] args){
        //�إߥD���O����
        CH08_04 myObject = new CH08_04();
        myObject.showData();
    }
}

//�ŧi�~�����O
class setData{
    //�ŧipublic�������
    public static String myStr = "�o�O�ѥ~�����Opublic������k�ҶǦ^���r����\n";
    //�ŧipublic������k
    public static String setStr(){
        return myStr;
    }
}