/*  CH08_07�G�I�s�غc�l������-��@�~�����Y*/

class superclassA {  //�ŧi�����O
    superclassA() { //�إߤ����O���غc�l
        System.out.println("�o�O�����OsuperclassA���غc�l�A���\�I�s");
    }
}
class subclassB extends superclassA {  //�ŧi�l���OB
    subclassB() { //�إߤl�O���غc�l
        System.out.println("�o�O�l���OsubclassB���غc�l�A���\�I�s");
    }
}
class subclassC extends subclassB {  //�ŧi�l���OC
    subclassC() { //�إߤl�O���غc�l
        System.out.println("�o�O�l���OsubclassC���غc�l�A���\�I�s");
    }
}
class CH08_07{
    public static void main(String[] args) {
        System.out.println("��@�~�����Y���غc�l�I�s���ǡG");
        new subclassB();
        System.out.println(" ");
        System.out.println("�h�h�~�����Y���غc�l�I�s���ǡG");
        new subclassC();
    }
}