/*�ɮ�:CH17_07.java �w�ɱƵ{����ܽd*/
//sleep( ) �ϥΤ�k����(�G)
class newThread implements Runnable {     //��@����
    private int a;
    public newThread(int x){
        a=x;
    }
    public void run(){  
        for (int i=0;i<3;i++){
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
            }System.out.println("��"+a+"�s������C");
        }
    }
}
class CH17_07{
    public static void main(String[] args) {
        newThread t1=new newThread(1);   
		
        Thread tt1=new Thread(t1);    
		
        tt1.start();    //�Ұʰ����
        System.out.println("main()�����");
    }
}