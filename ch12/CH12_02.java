/* 程式：CH12_02.java
 * 說明：動態更換 Swing 元件外觀
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CH12_02
{
    JFrame frame;
    JRadioButton b1 = new JRadioButton("預設外觀"),
    b2 = new JRadioButton("Unix"),
    b3 = new JRadioButton("Windows");

    public void createFrame() 
    {
        //建立視窗
        frame=new JFrame("動態更換 Swing 元件外觀");
        
        //取得視窗容器
        Container contentPane = frame.getContentPane();
        
        //將面板將入視窗容器中
        contentPane.add(new jp(), BorderLayout.CENTER);
        
        //將視窗大小調整適中
        frame.pack();
        
        //將視窗設定為可視
        frame.setVisible(true);       
    }

    //自訂面板內容
    class jp extends JPanel implements ActionListener
    {
        private static final long serialVersionUID = 1L;

        @SuppressWarnings({ "unchecked", "rawtypes" })
		public jp() 
        {
            
            add(new JTextField("文字方塊"));
            add(new JButton("按鈕"));
            add(new JRadioButton("選項"));
            add(new JCheckBox("核取方塊"));
            add(new JLabel("標籤"));
            add(new JList(new String[] {
                "選單一", 
                "選單二", 
                "選單三"}));
                
            add(new JScrollBar(SwingConstants.HORIZONTAL));

            ButtonGroup group = new ButtonGroup();
            group.add(b1);
            group.add(b2);
            group.add(b3);

			//加入元件監聽事件
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);

            add(b1);
            add(b2);
            add(b3);
        }

        public void actionPerformed(ActionEvent e) 
        {
            try {
                if((JRadioButton)e.getSource() == b1)
                    UIManager.setLookAndFeel(
                      "javax.swing.plaf.metal.MetalLookAndFeel");
                else if((JRadioButton)e.getSource() == b2)
                    UIManager.setLookAndFeel(
                        "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                else if((JRadioButton)e.getSource() == b3)
                    UIManager.setLookAndFeel(
                        "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            }
            catch(Exception ex) {}

            SwingUtilities.updateComponentTreeUI(frame.getContentPane());
        }
    }
    
    public static void main(String[] args){
    	new CH12_02().createFrame();
    }
}