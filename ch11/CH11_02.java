/*程式：CH11_02.java
 *說明：視窗相關方法應用。
 */
 
import java.awt.*;
import javax.swing.*;

public class CH11_02
{
    public static void main(String[] args)
    {
        Frame frmMyFrame=new Frame();
        Image imgIcon;
			
        //設定標題列文字
        frmMyFrame.setTitle("視窗相關方法應用");
			
        //設定是否可以更改視窗大小(未設定時為true)
        frmMyFrame.setResizable(true);
			
        //設定視窗狀態(未設定時為一般)
        frmMyFrame.setState(Frame.NORMAL);
		
        //利用Image類別讀取圖形	
        imgIcon=(new ImageIcon("s3.gif").getImage());	
			
        //將圖形指定給視窗
        frmMyFrame.setIconImage(imgIcon);
			
        frmMyFrame.setSize(300,200);
        frmMyFrame.setVisible(true);
    }	
}