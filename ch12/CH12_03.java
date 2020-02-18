/* 程式：CH12_03.java
 * 說明：JButton 使用說明
 */
 
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class CH12_03 extends JPanel implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    protected JButton b1, b2, b3;
		
    public CH12_03() {
    	
        //左邊按鈕
        b1 = new JButton("中間按鈕功能取消");
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEADING);
        b1.setMnemonic(KeyEvent.VK_D);
        b1.setActionCommand("dis");

        //中間按鈕
        b2 = new JButton("中間按鈕");
        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
        b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setMnemonic(KeyEvent.VK_M);

        //右邊按鈕
        b3 = new JButton("中間按鈕功能恢復");
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setActionCommand("en");
        b3.setEnabled(false);

        //按鈕加入監聽事件
        b1.addActionListener(this);
        b3.addActionListener(this);

        //將元件加入面板中
        add(b1);
        add(b2);
        add(b3);
    }

    //實作事件方法
    public void actionPerformed(ActionEvent e) {
    	
        if ("dis".equals(e.getActionCommand())) {
            b2.setEnabled(false);
            b1.setEnabled(false);
            b3.setEnabled(true);
        } else {
            b2.setEnabled(true);
            b1.setEnabled(true);
            b3.setEnabled(false);
        }
        
    }

    private static void createAndShowGUI() {
        
        //視窗外觀設定為Swing預設狀態
        JFrame.setDefaultLookAndFeelDecorated(true);

        //建立視窗
        JFrame frame = new JFrame("JButton 使用");
        
        //設定預設視窗關閉模式
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //建立面板
        CH12_03 newContentPane = new CH12_03();
        newContentPane.setOpaque(true); 
        
        //將面板加到視窗中
        frame.setContentPane(newContentPane);

        //將視窗大小調整適當
        frame.pack();
        
        //將視窗設為可視
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CH12_03();
        CH12_03.createAndShowGUI();
    }
}