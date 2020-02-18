/*�{���GCH17_03.java Runnable������@*/
//�פJ�����M��

import javax.swing.*;
import java.awt.Graphics;
//�D���O
public class CH17_03 extends JFrame implements Runnable{
    private static final long serialVersionUID = 1L;
    Thread myThread;
    int counter = 0;
    //�ŧi���O�غc�l
    public CH17_03(){
        //�إ߰��������
        myThread = new Thread(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Runnable�����d�ҡG²���ʵe");
        setSize(300, 250);
        //�Ұʰ����
        myThread.start();
        setVisible(true);
    }
    //�D�{��
    public static void main(String[] args){
        new CH17_03();
    }
    //override run()��k
    public void run(){
        while(true){
            //�]�w������פ����
            if (counter>30)
                break;
            else {
                //���sø�s�Ϧ�
                repaint();
                try{
                    //�]�w���涡�j
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){}
            }
        }
    }
    //override paint()��k
    public void paint(Graphics g){
        //ø�s�ϧ�
        g.drawRect(100-counter,100-counter,60-counter,60-counter);
        //���[counter��
        counter += 3;
    }
}