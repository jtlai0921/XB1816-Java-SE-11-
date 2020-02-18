/*  CH08_07：呼叫建構子的順序-單一繼承關係*/

class superclassA {  //宣告父類別
    superclassA() { //建立父類別的建構子
        System.out.println("這是父類別superclassA的建構子，成功呼叫");
    }
}
class subclassB extends superclassA {  //宣告子類別B
    subclassB() { //建立子別的建構子
        System.out.println("這是子類別subclassB的建構子，成功呼叫");
    }
}
class subclassC extends subclassB {  //宣告子類別C
    subclassC() { //建立子別的建構子
        System.out.println("這是子類別subclassC的建構子，成功呼叫");
    }
}
class CH08_07{
    public static void main(String[] args) {
        System.out.println("單一繼承關係的建構子呼叫順序：");
        new subclassB();
        System.out.println(" ");
        System.out.println("多層繼承關係的建構子呼叫順序：");
        new subclassC();
    }
}