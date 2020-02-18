/*檔案:CH17_08.java 群組化執行緒範例*/
//主類別
public class CH17_08{
    //主程式
    public static void main(String[] args){
        //宣告執行緒群組物件myTG1與myTG2
        ThreadGroup myTG1 = new ThreadGroup("myThreadGroup1");
        ThreadGroup myTG2 = new ThreadGroup("myThreadGroup2");
        //建立四個執行緒物件,並加入至相對群組中
        myThread myThread1 = new myThread(myTG1, "myThread1", 5);
        myThread myThread2 = new myThread(myTG2, "myThread2", 9);
        myThread myThread3 = new myThread(myTG1, "myThread3", 8);
        myThread myThread4 = new myThread(myTG2, "myThread4", 2);
        //設定群組的最大執行權限
        myTG1.setMaxPriority(3);
        myTG2.setMaxPriority(7);
        //啟動執行緒
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
    }
}

//宣告執行緒產生類別
class myThread extends Thread{
    //類別建構子
    public myThread(ThreadGroup TG, String name, int priority){
        //向上實怍Thread類別建構子
        super(TG, name);
        //設定執行緒執行順序
        this.setPriority(priority);
    }
    //重新定義run()方法
    public void run(){
        for(int i = 1; i < 3; i++){
            if(i == 1){
                System.out.println("開始執行"+getName()+"執行緒");
                System.out.println(getName()+"第"+i+"次執行\n");
            }
            if(i == 2){
                System.out.println(getName()+"第"+i+"次執行");
                System.out.println("執行緒"+getName()+"執行完畢\n");
            }
            //設定時間間格
            try{
                sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}