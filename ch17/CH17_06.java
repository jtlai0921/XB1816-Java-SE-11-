/*檔案:CH17_06.java 定時排程機制示範*/
//sleep( ) 使用方法說明(一) */
class newThread implements Runnable {     //實作介面
    private int a;
    public newThread(int x){
        a=x;
    }
    public void run(){     //定義Runnable介面中的方法
        System.out.println("第"+a+"新執行緒。");
    }
}
class CH17_06{
    public static void main(String[] args) {
        newThread t1=new newThread(1);
        newThread t2=new newThread(2);

        Thread tt1=new Thread(t1);
        Thread tt2=new Thread(t2);

        tt1.start();    //啟動執行緒
        try{
            Thread.sleep(3000);
            System.out.println("暫停結束");
            tt2.start();
        }catch(InterruptedException e){

        }
    }
}