/*�{���GCH13_02 Graphics������k����*/
//��@�e�uDrawLine */

import java.awt.*;
import java.awt.Graphics;
public class CH13_02 extends Frame{
    private static final long serialVersionUID = 1L;
    static CH13_02 f=new CH13_02();
    public static void main(String args[]){
        f.setTitle("�e�uDrawLine");
        f.setSize(500,300);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        g.drawLine(30,20,300,250);
        g.drawLine(90,8,150,100);
    }
}