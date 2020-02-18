/*檔案:CH17_05.java 定時排程機制示範*/
//join( ) 使用方法說明
class newThread implements Runnable {     //實作介面
    private int a;
    public newThread(int x){
        a=x;
    }
    public void run(){  //定義Runnable介面中的方法
        System.out.println("第"+a+"新執行緒。");
    }
}
class CH17_05{
    public static void main(String[] args) {
        newThread t1=new newThread(1);   
        newThread t2=new newThread(2);
		
        Thread tt1=new Thread(t1);    
        Thread tt2=new Thread(t2);
		
        tt1.start(); //啟動執行緒
        try{
            tt1.join();
            System.out.println("執行join()，開始執行第2執行緒。");
            tt2.start();
        }catch(InterruptedException e) {}
    }
}