/*程式：CH10_03.java
 *說明：Frame 的super class相關方法應用。
 */
 
import java.awt.*;

public class CH11_03
{
    public static void main(String[] args)
    {
        Frame frmMyFrame=new Frame();
			
        //設定標題列文字
        frmMyFrame.setTitle("Frame 的super class相關方法應用");
			
        //設定是否可以更改視窗大小(未設定時為true)
        frmMyFrame.setResizable(true);
			
        //設定視窗狀態(未設定時為一般)
        frmMyFrame.setState(Frame.NORMAL);
			
        //設定視窗的大小
        frmMyFrame.setSize(300,200);
			
        //設定視窗在螢幕上顯示的位置
        frmMyFrame.setLocation(500,500);
			
        //設定視窗的前景色
        frmMyFrame.setForeground(Color.BLUE);

        //設定視窗的背景色
        frmMyFrame.setBackground(Color.cyan);
			
        frmMyFrame.setVisible(true);
    }	
}