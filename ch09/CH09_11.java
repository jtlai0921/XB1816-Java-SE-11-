/*�ɮ�:CH09_11.java 
 *����:�����ΦW���O��@����*/

//�D�{�����O
public class CH09_11{
    //�~�����O�غc�l
    public CH09_11(){
        System.out.println("��@�~�����O�غc�l�ԭz���\!!");
    }
    //�ŧi�������O
    class MyInnerClass{
    //�������O�غc�l
        public MyInnerClass(){
            System.out.println("  ��@�������O�غc�l�ԭz���\!!");
        }
        public void show(){
            System.out.println("    �I�s�������Oshow()��k���\!!");
        }
    }
	//�w�q�����ΦW���O
    public MyInnerClass MyInnerClass(){
        //�Ǧ^�����ΦW���O�غc��k
        return new MyInnerClass(){
            //�����������O������k
            public void show(){
                System.out.println("    �I�s�����ΦW���Oshow()��k���\!!");
            }
        };
    }
    //�D�{���϶�
    public static void main(String args[]){
        //��@�D���O����
        CH09_11 myObject = new CH09_11();
        //��@�����ΦW���O����
        MyInnerClass myAnonymous = myObject.MyInnerClass();
        //�I�s�����ΦW���O������k
        myAnonymous.show();
    }
}