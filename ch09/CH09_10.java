/*�ɮ�:CH09_10.java 
 *����:�R�A�_�����O��@����*/

//�D�{�����O
public class CH09_10{
    //�D���O�غc�l
    public CH09_10(){
        System.out.println("�D���O�غc�l�ԭz");
    }
    //�ŧi�R�A�_�����O
    static class InnerClass{
        public InnerClass(){
        System.out.println("�R�A�_�����O�غc�l�ԭz");
    }
}
    //�D�{���϶�
    public static void main(String args[]){
        new CH09_10();
        new InnerClass();
    }
}