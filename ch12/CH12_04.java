/* �{���GCH12_04.java
 * �����GJCheckBox �ϥλ���
 */

import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;

public class CH12_04 implements ItemListener
{
    JCheckBox check1;
    JCheckBox check2;
    JCheckBox check3;
    JCheckBox check4;
    
    JTextField text;
    JFrame jf;
	
    public CH12_04() 
    {
    	//�إߵ���
    	jf=new JFrame("JCheckBox ����");
    	       
        //�إߵ��������e���O
        Container contentPane = jf.getContentPane();
        
        //�]�w�����t�m�覡
        contentPane.setLayout(new FlowLayout());

        //�[�JCheckbox
        check1 = new JCheckBox("�֨��ؤ@");
        check2 = new JCheckBox("�֨��ؤG");
        check3 = new JCheckBox("�֨��ؤT");
        check4 = new JCheckBox("�֨��إ|");

        //�[�J��ť�ƥ�
        check1.addItemListener(this);
        check2.addItemListener(this);
        check3.addItemListener(this);
        check4.addItemListener(this);

        //�N����[�J���O
        contentPane.add(check1);
        contentPane.add(check2);
        contentPane.add(check3);
        contentPane.add(check4);

        text = new JTextField(20);
        contentPane.add(text); 
        
        //�N�����j�p�վ�A��
        jf.pack();
        
        //�N�����]�w���i�����A
        jf.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if (e.getItemSelectable() == check1) 
        {
            text.setText("�֨��ؤ@");
        } 
        else if (e.getItemSelectable() == check2) 
        {
            text.setText("�֨��ؤG");
        } else if (e.getItemSelectable() == check3) 
        {
            text.setText("�֨��ؤT");
        } 
        else if (e.getItemSelectable() == check4) 
        {
            text.setText("�֨��إ|");
        }
    }
    
    public static void main(String[] args)
    {
    	JFrame.setDefaultLookAndFeelDecorated(true);
    	new CH12_04();	
    }
}