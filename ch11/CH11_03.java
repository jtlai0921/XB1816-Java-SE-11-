/*�{���GCH10_03.java
 *�����GFrame ��super class������k���ΡC
 */
 
import java.awt.*;

public class CH11_03
{
    public static void main(String[] args)
    {
        Frame frmMyFrame=new Frame();
			
        //�]�w���D�C��r
        frmMyFrame.setTitle("Frame ��super class������k����");
			
        //�]�w�O�_�i�H�������j�p(���]�w�ɬ�true)
        frmMyFrame.setResizable(true);
			
        //�]�w�������A(���]�w�ɬ��@��)
        frmMyFrame.setState(Frame.NORMAL);
			
        //�]�w�������j�p
        frmMyFrame.setSize(300,200);
			
        //�]�w�����b�ù��W��ܪ���m
        frmMyFrame.setLocation(500,500);
			
        //�]�w�������e����
        frmMyFrame.setForeground(Color.BLUE);

        //�]�w�������I����
        frmMyFrame.setBackground(Color.cyan);
			
        frmMyFrame.setVisible(true);
    }	
}