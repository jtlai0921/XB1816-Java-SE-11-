/*�ɮ�:CH17_04.java �w�ɱƵ{����ܽd*/
//islAive( ) �ϥΤ�k����

class newThread implements Runnable {     //��@����
    private int a;
    public newThread(int x){
        a=x;
    }
    public void run(){     //�w�qRunnable����������k
        for(int i=0;i<2;i++){
            System.out.println("��"+a+"�s������C");
        }
    }
}
class CH17_04{
    public static void main(String[] args) {
        newThread t1=new newThread(1);   //�N�ҭl�ͪ��l���O���H�����
        newThread t2=new newThread(2);
		
        Thread tt1=new Thread(t1);    //����Thread���O
        Thread tt2=new Thread(t2);
		
        tt1.start();    //�Ұʰ����
        tt2.start();
		
        for (int i=0;i<3;i++){
            System.out.println("main()�����");
            System.out.println("��1�s������O�_�٦b����G"+tt1.isAlive());
            System.out.println("��2�s������O�_�٦b����G"+tt2.isAlive());
        }
    }
}