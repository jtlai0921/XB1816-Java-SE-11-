/*�ɮ�:CH08_06.java 
 *����:�s���~�����Oprivate�����d��*/
//�ŧi�D�{�����O�æV�W�~�ө�~�����OSetStr
public class CH08_06 extends SetStr{
    //�D�{��
    public static void main(String[] args){
        String myStr = "�D�{�����O�ҩw�q���r��!!";
        new CH08_06();
        //�I�s�~�Ӫ�public������k�H�����s��private����
        SetStr.setPrivateData(myStr);
        SetStr.showPrivateData();
    }
}