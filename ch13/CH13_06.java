/*�{���GCH13_06 Graphics������k����*/
/*�C��i�� */

import java.awt.*;
import java.awt.Graphics;
public class CH13_06 extends Frame{
    private static final long serialVersionUID = 1L;
    static CH13_06 f=new CH13_06();
    public static void main(String args[]){
        f.setTitle("�C��i��");
        f.setSize(500,300);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.green); //�Q���C��`�Ƴ]�w�C��
        g.drawRect(30,45,60,45);
        g.fillRect(100,45,60,45);
        g.setColor(Color.orange);
        g.drawRect(180,45,60,45);
        g.fillRect(260,45,60,45);
        Color c1=new Color(23,47,199);	//�Q�μƭȱ`�Ƴ]�w�C��
        Color c2=new Color(33,199,210);
        g.setColor(c1);
        g.drawRect(30,145,60,45);
        g.fillRect(100,145,60,45);
        g.setColor(c2);
        g.drawRect(180,145,60,45);
        g.fillRect(260,145,60,45);
    }
}