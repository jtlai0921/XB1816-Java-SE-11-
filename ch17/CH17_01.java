/*檔案:CH17_01.java 定時排程機制示範*/
//匯入相關套件
import java.util.Timer;
import java.util.TimerTask;
//主類別
public class CH17_01{
    //宣告相關變數
    Timer myTimer;
    //宣告類別建構子
    public CH17_01(){
        //建立Timer物件
        myTimer = new Timer();
        //建立Task物件
        Task1 myTask1 = new Task1();
        Task2 myTask2 = new Task2();
        //排定第一項工作
        myTimer.schedule(myTask1, 1000, 1000);
        //安排第二項工作
        myTimer.schedule(myTask2, 2000, 2000);
    }
    //主程式
    public static void main(String[] args){
        System.out.println("開始執行Timer排程工作");
        new CH17_01();
    }
    //實作TimerTask的衍生類別,Task1負責第一項工作
    class Task1 extends TimerTask{
        //建立相關變數
        int ascending = 1;
        //overloading run()方法
        public void run(){
            if(ascending <= 3){
                System.out.println("第一項工作");
                System.out.println("ascending變數遞加運算："+ascending);
                ascending ++;
            }
            else{
                System.out.println("當ascending變數值為3時,停止第一項工作");
                //呼叫cancel()方法終止工作
                cancel();
            }
        }
    }
    //實作TimerTask的衍生類別,Task2負責第二項工作
    class Task2 extends TimerTask{
        //建立相關變數
        int descending = 10;
        //overloading run()方法
        public void run(){
            if(descending >= 6){    			
                System.out.println("第二項工作");
                System.out.println("descending變數遞減運算"+descending);
                descending --;
            }
            else{
                System.out.println("當descending變等於6時,停止第二項工作");
                //利用Timer物件呼叫cancel()方法終止排程
                myTimer.cancel();
            }
        }
    }
}