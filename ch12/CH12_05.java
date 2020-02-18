/* 程式：CH12_05.java
 * 說明：JRadioButton 使用說明
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CH12_05 extends JPanel
             implements ActionListener {

    private static final long serialVersionUID = 1L;
    static String str1 = "圖示一";
    static String str2 = "圖示二";
    static String str3 = "圖示三";
    static String str4 = "圖示四";
    static String str5 = "圖示五";

    JLabel picture;

    public CH12_05() 
    {	
        //設定版面配置
        super(new BorderLayout());

        //建立JRadioButton1
        JRadioButton btn1 = new JRadioButton(str1);
        btn1.setActionCommand("p1");
        btn1.setSelected(true);

        //建立JRadioButton2
        JRadioButton btn2 = new JRadioButton(str2);
        btn2.setActionCommand("p2");

        //建立JRadioButton3
        JRadioButton btn3 = new JRadioButton(str3);
        btn3.setActionCommand("p3");

        //建立JRadioButton4
        JRadioButton btn4 = new JRadioButton(str4);
        btn4.setActionCommand("p4");

        //建立JRadioButton5
        JRadioButton btn5 = new JRadioButton(str5);
        btn5.setActionCommand("p5");

        //將JRadioButton設為群組
        ButtonGroup group = new ButtonGroup();
        group.add(btn1);
        group.add(btn2);
        group.add(btn3);
        group.add(btn4);
        group.add(btn5);

        //將JRadioButton加入事件監聽
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);

        //設定圖片
        picture = new JLabel(createImageIcon("pic/"+btn1.getActionCommand()+".gif"));
        picture.setPreferredSize(new Dimension(177, 122));


        JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.add(btn1);
        radioPanel.add(btn2);
        radioPanel.add(btn3);
        radioPanel.add(btn4);
        radioPanel.add(btn5);

        add(radioPanel, BorderLayout.LINE_START);
        add(picture, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }

    //事件監聽
    public void actionPerformed(ActionEvent e) 
    {
        picture.setIcon(createImageIcon("pic/"+e.getActionCommand()+ ".gif"));
    }

	//建立圖示
    protected static ImageIcon createImageIcon(String path) 
    {
        java.net.URL imgURL = CH12_05.class.getResource(path);
        return new ImageIcon(imgURL);
    }

    private static void createAndShowGUI() 
    {
        //設定視窗外觀為預設狀態
        JFrame.setDefaultLookAndFeelDecorated(true);

        //建立視窗
        JFrame frame = new JFrame("JRadioButton 應用");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent newContentPane = new CH12_05();
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);

        //將視窗調整到適當
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CH12_05();
        CH12_05.createAndShowGUI();
    }
}