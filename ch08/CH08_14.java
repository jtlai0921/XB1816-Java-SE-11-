/*  CH08_14：動態多形基本實作*/

class superclassA {  //宣告父類別
    protected double A_a;
    protected int A_b;
    superclassA(double i,int j) {
        A_a=i;
        A_b=j;
    }
    protected void test_show(){
        System.out.println("這是父類別的方法");
        System.out.println("A_a="+A_a);
        System.out.println("A_b="+A_b);
        System.out.println("A_a*A_b 計算結果："+(A_a*A_b));
    }
}
class subclassB extends superclassA {  //宣告子類別
    protected int B_a;
    subclassB(double i,int j,int h) {
        super(i,j);
        B_a=h;
    }
    protected void test_show(){  //改寫父類別的方法
        System.out.println("這是子類別的方法");
        System.out.println("B_a="+B_a);
        System.out.println("A_a*A_b*B_a 計算結果："+(A_a*A_b*B_a));
    }
}
class CH08_14{
    public static void main(String[] args) {
        superclassA A=new superclassA(2,3);
        A.test_show();
        System.out.println();
        A=new subclassB(1.6,5,2); //向上轉型
        A.test_show(); //動態多形會呼叫被參考的物件的方法
    }
}