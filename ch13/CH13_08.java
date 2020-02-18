/*�{���GCH13_08 �ʵe����*/
import java.awt.*;
import java.awt.event.*;
public class CH13_08 extends Frame implements Runnable{
    private static final long serialVersionUID = 1L;
    //�ŧi���O�������
    MediaTracker myTracker;
    Image[] myImg = new Image[2];
    int imgInx;
    Thread myTh;
    //���O�غc�l
    public CH13_08() {
        myTracker = new MediaTracker(this);
        for (int i = 0; i < myImg.length; i++) {
            myImg[i] = Toolkit.getDefaultToolkit().getImage("Nuke" + 
                String.valueOf(i+1) +".png");
            myTracker.addImage(myImg[i], 0);
        }
        //�]�w�����ݩ�
        setTitle("����ʵe�ĪG");
        setSize(200,150);
        setVisible(true);
        //��@���������ñҰʰ����
        myTh = new Thread(this);
        myTh.start();
    }
    //����run()��k
    public void run(){
        //���JImage����
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
            //�P�B�B�z
            synchronized(this){
                imgInx++;
                if(imgInx >= myImg.length){
                    imgInx = 0;
                }
            }            	
            repaint();
        }
    }
    //����paint()��k
    public void paint(Graphics g){
        g.drawImage(myImg[imgInx], 60, 50, this);
    }
    public static void main(String args[]){
        CH13_08 myFrm = new CH13_08();
        //�]�w���������ʧ@
        myFrm.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){ System.exit(0);}});
    }
}