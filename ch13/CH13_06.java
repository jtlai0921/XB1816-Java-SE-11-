/*程式：CH13_06 Graphics相關方法應用*/
/*顏色展示 */

import java.awt.*;
import java.awt.Graphics;
public class CH13_06 extends Frame{
    private static final long serialVersionUID = 1L;
    static CH13_06 f=new CH13_06();
    public static void main(String args[]){
        f.setTitle("顏色展示");
        f.setSize(500,300);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.green); //利用顏色常數設定顏色
        g.drawRect(30,45,60,45);
        g.fillRect(100,45,60,45);
        g.setColor(Color.orange);
        g.drawRect(180,45,60,45);
        g.fillRect(260,45,60,45);
        Color c1=new Color(23,47,199);	//利用數值常數設定顏色
        Color c2=new Color(33,199,210);
        g.setColor(c1);
        g.drawRect(30,145,60,45);
        g.fillRect(100,145,60,45);
        g.setColor(c2);
        g.drawRect(180,145,60,45);
        g.fillRect(260,145,60,45);
    }
}