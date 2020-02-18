/*檔案:CH17_04.java 定時排程機制示範*/
//islAive( ) 使用方法說明

class newThread implements Runnable {     //實作介面
    private int a;
    public newThread(int x){
        a=x;
    }
    public void run(){     //定義Runnable介面中的方法
        for(int i=0;i<2;i++){
            System.out.println("第"+a+"新執行緒。");
        }
    }
}
class CH17_04{
    public static void main(String[] args) {
        newThread t1=new newThread(1);   //將所衍生的子類別予以實體化
        newThread t2=new newThread(2);
		
        Thread tt1=new Thread(t1);    //產生Thread類別
        Thread tt2=new Thread(t2);
		
        tt1.start();    //啟動執行緒
        tt2.start();
		
        for (int i=0;i<3;i++){
            System.out.println("main()執行緒");
            System.out.println("第1新執行緒是否還在執行："+tt1.isAlive());
            System.out.println("第2新執行緒是否還在執行："+tt2.isAlive());
        }
    }
}