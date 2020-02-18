/*程式：CH17_03.java Runnable介面實作*/
//匯入相關套件

import javax.swing.*;
import java.awt.Graphics;
//主類別
public class CH17_03 extends JFrame implements Runnable{
    private static final long serialVersionUID = 1L;
    Thread myThread;
    int counter = 0;
    //宣告類別建構子
    public CH17_03(){
        //建立執行緒物件
        myThread = new Thread(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Runnable介面範例：簡易動畫");
        setSize(300, 250);
        //啟動執行緒
        myThread.start();
        setVisible(true);
    }
    //主程式
    public static void main(String[] args){
        new CH17_03();
    }
    //override run()方法
    public void run(){
        while(true){
            //設定執行緒終止條件
            if (counter>30)
                break;
            else {
                //重新繪製圖行
                repaint();
                try{
                    //設定執行間隔
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){}
            }
        }
    }
    //override paint()方法
    public void paint(Graphics g){
        //繪製圖形
        g.drawRect(100-counter,100-counter,60-counter,60-counter);
        //遞加counter值
        counter += 3;
    }
}