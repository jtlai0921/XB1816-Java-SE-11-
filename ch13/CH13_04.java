/*程式：CH13_04 Graphics相關方法應用*/
//實作畫矩形drawRoundRect   */

import java.awt.*;
import java.awt.Graphics;
public class CH13_04 extends Frame{
    private static final long serialVersionUID = 1L;
    static CH13_04 f=new CH13_04();
    public static void main(String args[]){
        f.setTitle("畫矩形 DrawRoundRect");
        f.setSize(500,300);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        g.fillRoundRect(30,45,60,45,10,10);
        g.drawRoundRect(100,45,60,45,20,20);
        g.fillRoundRect(30,120,60,60,20,20);
        g.drawRoundRect(100,120,60,60,20,20);
    }
}