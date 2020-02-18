/*程式:CH11_01.java
 *說明:建立簡單的視窗程式
 */
import java.awt.Frame;

public class CH11_01
{
    public static void main(String[] args)	
    {
        //建立視窗實體物件
        Frame frmMyFrame=new Frame();
		
        //設定視窗大小
        frmMyFrame.setSize(300,200);
		
        //設定視窗為可視狀態
        frmMyFrame.setVisible(true);		
    }
}