/*程式：CH13_07 paint()與repaint()方法應用*/
//載入相關套件
import java.awt.*;
import java.awt.event.*;
public class CH13_07 extends Frame{
    private static final long serialVersionUID = 1L;
    private static Image myImg;
    //類別建構子
    public CH13_07(){
        //設定AWT視窗屬性
        setTitle("paint()與repaint()方法應用");
        setSize(300, 300);
        setVisible(true);
        //設定關閉視窗動作
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);}});
            //載入影像圖形檔案
            myImg = Toolkit.getDefaultToolkit().getImage("test.jpg");
        }
        //重載paint()類別
        public void paint(Graphics g){
            g.drawImage(myImg, 10, 30, 150, 150,this);
        }
        public static void main(String args[]){
            CH13_07 myFrm = new CH13_07();
            myFrm.setVisible(true);
            //呼叫repaint()方法
            myFrm.repaint();
    }
}