/*�ɮ�:CH09_09.java 
 *����:�������O��@����*/

//�D�{�����O
public class CH09_09{
    //�D���O�غc�l
    public CH09_09(){
        System.out.println("�D���O�غc�l�ԭz");
    }
    //�ŧi�������O
    class InnerClass{
        public InnerClass(){
        System.out.println("�������O�غc�l�ԭz");
    }
}
    //�D���O������k
    public InnerClass ImplementInnerClass(){
        return new InnerClass();
    }
    //�D�{���϶�
    public static void main(String args[]){
        //��@�D���O����
        CH09_09 myObject = new CH09_09();
        myObject.ImplementInnerClass();
    }
}