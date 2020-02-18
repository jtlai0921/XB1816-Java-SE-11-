/*程式:CH17_02.Java Thread類別的使用*/
public class CH17_02
{
    //設定相關變數
    static boolean isRunning1 = true;  
    static boolean isRunning2 = true;
    //主程式區塊
    public static void main(String args[]){
        //建立Thread物件
        myThread1 myThread1 = new myThread1();
        myThread2 myThread2 = new myThread2();
        //設定執行緒識別名稱
        myThread1.setName("第一項工作");
        myThread2.setName("第二項工作");
        //啟動執行緒
        myThread1.start();
        myThread2.start();
        //設定無限迴圈
        while(true){
            //設定迴圈終止條件
            if(!isRunning1 && !isRunning2)
                break;
        }
    }
}

class myThread1 extends Thread{
    //建立相關變數
    int ascending = 1;
    //override run()方法
    public void run(){
        while(CH17_02.isRunning1){
            //當ascending值不超過範圍時,執行運算並輸出結果
            if(ascending <= 3){
                System.out.println("第一項工作");
                System.out.println("ascending變數遞加運算"+ascending);
                ascending ++;
                try{
                    Thread.currentThread();
                    //設定時間間隔為1000毫秒(1秒鐘)
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){}
            }
            //當ascending超出範圍時,中斷此執行緒
            else {
                //利用isRunning1變數終止此執行程序
                CH17_02.isRunning1 = false;
                System.out.println("\n當ascending值為3時");
                System.out.println(Thread.currentThread() + "中斷執行\n");				
            }
        }
    }
}

class myThread2 extends Thread{
    //建立相關變數
    int descending = 10;
    //override run()方法
    public void run(){
        while(CH17_02.isRunning2){
            //當descending值大於指定數值時,執行運算並輸出結果
            if(descending >= 6){
                System.out.println("第二項工作");
                System.out.println("descending變數遞減運算"+descending);
                descending --;
                try{
                    Thread.currentThread();
                    //設定時間間隔為2000毫秒(2秒鐘)
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){}
            }
            //當descending小於指定數值時,中斷此執行緒
            else{
                //利用isRunning2變數終止此執行程序
                CH17_02.isRunning2 = false;
                System.out.println("\n當descending值為6時");
                System.out.println(Thread.currentThread() + "中斷執行\n");
            }
        }
    }
}