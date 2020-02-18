/* 程式：CH12_04.java
 * 說明：JCheckBox 使用說明
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
    	//建立視窗
    	jf=new JFrame("JCheckBox 應用");
    	       
        //建立視窗的內容面板
        Container contentPane = jf.getContentPane();
        
        //設定版面配置方式
        contentPane.setLayout(new FlowLayout());

        //加入Checkbox
        check1 = new JCheckBox("核取框一");
        check2 = new JCheckBox("核取框二");
        check3 = new JCheckBox("核取框三");
        check4 = new JCheckBox("核取框四");

        //加入監聽事件
        check1.addItemListener(this);
        check2.addItemListener(this);
        check3.addItemListener(this);
        check4.addItemListener(this);

        //將元件加入面板
        contentPane.add(check1);
        contentPane.add(check2);
        contentPane.add(check3);
        contentPane.add(check4);

        text = new JTextField(20);
        contentPane.add(text); 
        
        //將視窗大小調整適中
        jf.pack();
        
        //將視窗設定為可視狀態
        jf.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if (e.getItemSelectable() == check1) 
        {
            text.setText("核取框一");
        } 
        else if (e.getItemSelectable() == check2) 
        {
            text.setText("核取框二");
        } else if (e.getItemSelectable() == check3) 
        {
            text.setText("核取框三");
        } 
        else if (e.getItemSelectable() == check4) 
        {
            text.setText("核取框四");
        }
    }
    
    public static void main(String[] args)
    {
    	JFrame.setDefaultLookAndFeelDecorated(true);
    	new CH12_04();	
    }
}