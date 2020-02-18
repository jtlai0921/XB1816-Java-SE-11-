/*程式：CH13_08 動畫播放*/
import java.awt.*;
import java.awt.event.*;
public class CH13_08 extends Frame implements Runnable{
    private static final long serialVersionUID = 1L;
    //宣告類別成員資料
    MediaTracker myTracker;
    Image[] myImg = new Image[2];
    int imgInx;
    Thread myTh;
    //類別建構子
    public CH13_08() {
        myTracker = new MediaTracker(this);
        for (int i = 0; i < myImg.length; i++) {
            myImg[i] = Toolkit.getDefaultToolkit().getImage("Nuke" + 
                String.valueOf(i+1) +".png");
            myTracker.addImage(myImg[i], 0);
        }
        //設定視窗屬性
        setTitle("播放動畫效果");
        setSize(200,150);
        setVisible(true);
        //實作執行緒物件並啟動執行緒
        myTh = new Thread(this);
        myTh.start();
    }
    //重載run()方法
    public void run(){
        //載入Image物件
        try{
            myTracker.waitForID(0);
        }catch(InterruptedException e){
            return;
        }
        Thread me = Thread.currentThread();
        while(myTh == me){
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
            break;
            }
            //同步處理
            synchronized(this){
                imgInx++;
                if(imgInx >= myImg.length){
                    imgInx = 0;
                }
            }            	
            repaint();
        }
    }
    //重載paint()方法
    public void paint(Graphics g){
        g.drawImage(myImg[imgInx], 60, 50, this);
    }
    public static void main(String args[]){
        CH13_08 myFrm = new CH13_08();
        //設定視窗關閉動作
        myFrm.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){ System.exit(0);}});
    }
}