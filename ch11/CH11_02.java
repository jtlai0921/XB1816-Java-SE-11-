/*�{���GCH11_02.java
 *�����G����������k���ΡC
 */
 
import java.awt.*;
import javax.swing.*;

public class CH11_02
{
    public static void main(String[] args)
    {
        Frame frmMyFrame=new Frame();
        Image imgIcon;
			
        //�]�w���D�C��r
        frmMyFrame.setTitle("����������k����");
			
        //�]�w�O�_�i�H�������j�p(���]�w�ɬ�true)
        frmMyFrame.setResizable(true);
			
        //�]�w�������A(���]�w�ɬ��@��)
        frmMyFrame.setState(Frame.NORMAL);
		
        //�Q��Image���OŪ���ϧ�	
        imgIcon=(new ImageIcon("s3.gif").getImage());	
			
        //�N�ϧΫ��w������
        frmMyFrame.setIconImage(imgIcon);
			
        frmMyFrame.setSize(300,200);
        frmMyFrame.setVisible(true);
    }	
}