/*程式：CH13_02 Graphics相關方法應用*/
//實作畫線DrawLine */

import java.awt.*;
import java.awt.Graphics;
public class CH13_02 extends Frame{
    private static final long serialVersionUID = 1L;
    static CH13_02 f=new CH13_02();
    public static void main(String args[]){
        f.setTitle("畫線DrawLine");
        f.setSize(500,300);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        g.drawLine(30,20,300,250);
        g.drawLine(90,8,150,100);
    }
}