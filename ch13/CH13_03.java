/*�{���GCH13_03 Graphics������k����*/
//��@�e�x��drawRect  */

import java.awt.*;
import java.awt.Graphics;
public class CH13_03 extends Frame{
    private static final long serialVersionUID = 1L;
    static CH13_03 f=new CH13_03();
    public static void main(String args[]){
        f.setTitle("�e�x�� DrawRect");
        f.setSize(500,300);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        g.fillRect(30,45,60,45);
        g.drawRect(100,45,60,45);
        g.fillRect(30,120,60,60);
        g.drawRect(100,120,60,60);
    }
}
