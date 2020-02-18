/*程式：CH13_01 Draw相關方法應用*/
//載入相關套件
import java.awt.*;
import java.awt.event.*;
public class CH13_01 extends Frame{
    private static final long serialVersionUID = 1L;
    //宣告成員函數
    private static Graphics g;
    private static String myStr = "Hello Java!!";
    private static int[] xPoints = {215, 227, 269, 233, 243, 215, 187, 197, 161, 203};
    private static int[] yPoints = {80, 116, 116, 134, 176, 152, 176, 134, 116, 116};
    //類別建構子
    public CH13_01(){
        //設定AWT視窗屬性
        setTitle("Draw相關方法應用");
        setSize(300,220);
        setVisible(true);
        setBackground(Color.pink);
        //設定關閉視窗動作
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);}});
            //取得繪圖物件
            g = getGraphics();
            //設定繪圖物件屬性內容
            g.setColor(Color.blue);
            g.setFont(new Font("SimHei", Font.BOLD, 32));
        }
        public static void main(String args[]){
            CH13_01 myFrm = new CH13_01();
            myFrm.setVisible(true);
            //呼叫繪圖方法
            g.drawString(myStr ,10,70);
            g.drawOval(30, 80, 50, 50);
            g.drawRect(100, 80, 50, 70);
            g.drawPolygon(xPoints, yPoints, 10);
    }
}