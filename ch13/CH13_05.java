/*�{���GCH13_05 Graphics������k����*/
//��@�e����drawOval */

import java.awt.*;
import java.awt.Graphics;
public class CH13_05 extends Frame{
    private static final long serialVersionUID = 1L;
    static CH13_05 f=new CH13_05();
    public static void main(String args[]){
        f.setTitle("�e���� DrawOval");
        f.setSize(500,300);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        g.fillOval(30,45,60,45);
        g.drawOval(100,45,60,45);
        g.fillOval(30,120,60,60);
        g.drawOval(100,120,60,60);
    }
}