/*  CH08_14�G�ʺA�h�ΰ򥻹�@*/

class superclassA {  //�ŧi�����O
    protected double A_a;
    protected int A_b;
    superclassA(double i,int j) {
        A_a=i;
        A_b=j;
    }
    protected void test_show(){
        System.out.println("�o�O�����O����k");
        System.out.println("A_a="+A_a);
        System.out.println("A_b="+A_b);
        System.out.println("A_a*A_b �p�⵲�G�G"+(A_a*A_b));
    }
}
class subclassB extends superclassA {  //�ŧi�l���O
    protected int B_a;
    subclassB(double i,int j,int h) {
        super(i,j);
        B_a=h;
    }
    protected void test_show(){  //��g�����O����k
        System.out.println("�o�O�l���O����k");
        System.out.println("B_a="+B_a);
        System.out.println("A_a*A_b*B_a �p�⵲�G�G"+(A_a*A_b*B_a));
    }
}
class CH08_14{
    public static void main(String[] args) {
        superclassA A=new superclassA(2,3);
        A.test_show();
        System.out.println();
        A=new subclassB(1.6,5,2); //�V�W�૬
        A.test_show(); //�ʺA�h�η|�I�s�Q�ѦҪ����󪺤�k
    }
}