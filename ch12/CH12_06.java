/* 程式：CH12_06.java
 * 說明：JTextField 使用說明
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CH12_06 extends JPanel implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    protected JTextField tf;
    protected JTextArea ta;

    public CH12_06() {
    	
        //設定版面配置
        super(new GridBagLayout());

        tf = new JTextField(30);
        tf.addActionListener(this);

        ta = new JTextArea(10, 30);
        ta.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(ta,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        //建立新的版面配置
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 2.0;
        c.weighty = 2.0;
        add(scrollPane, c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        add(tf, c);        
    }

    //事件方法
    public void actionPerformed(ActionEvent evt) {
        String txt = tf.getText();
        ta.append(txt + "\n");
        tf.selectAll();

        ta.setCaretPosition(ta.getDocument().getLength());
    }


    private static void createAndShowGUI() {
        
        //預設視窗樣式
        JFrame.setDefaultLookAndFeelDecorated(true);

        //建立視窗
        JFrame f = new JFrame("JTextField 應用");
        
        //設定視窗關閉模式
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //建立面板
        JComponent newContentPane = new CH12_06();
        newContentPane.setOpaque(true); //content panes must be opaque
        f.setContentPane(newContentPane);

        //將視窗調整適當大小
        f.pack();
        
        //視窗為可視
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CH12_06();
        CH12_06.createAndShowGUI();
    }
}