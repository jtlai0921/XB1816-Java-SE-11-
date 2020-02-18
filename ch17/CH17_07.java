/*檔案:CH17_07.java 定時排程機制示範*/
//sleep( ) 使用方法說明(二)
class newThread implements Runnable {     //實作介面
    private int a;
    public newThread(int x){
        a=x;
    }
    public void run(){  
        for (int i=0;i<3;i++){
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
            }System.out.println("第"+a+"新執行緒。");
        }
    }
}
class CH17_07{
    public static void main(String[] args) {
        newThread t1=new newThread(1);   
		
        Thread tt1=new Thread(t1);    
		
        tt1.start();    //啟動執行緒
        System.out.println("main()執行緒");
    }
}