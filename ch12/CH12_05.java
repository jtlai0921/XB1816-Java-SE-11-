/* �{���GCH12_05.java
 * �����GJRadioButton �ϥλ���
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CH12_05 extends JPanel
             implements ActionListener {

    private static final long serialVersionUID = 1L;
    static String str1 = "�ϥܤ@";
    static String str2 = "�ϥܤG";
    static String str3 = "�ϥܤT";
    static String str4 = "�ϥܥ|";
    static String str5 = "�ϥܤ�";

    JLabel picture;

    public CH12_05() 
    {	
        //�]�w�����t�m
        super(new BorderLayout());

        //�إ�JRadioButton1
        JRadioButton btn1 = new JRadioButton(str1);
        btn1.setActionCommand("p1");
        btn1.setSelected(true);

        //�إ�JRadioButton2
        JRadioButton btn2 = new JRadioButton(str2);
        btn2.setActionCommand("p2");

        //�إ�JRadioButton3
        JRadioButton btn3 = new JRadioButton(str3);
        btn3.setActionCommand("p3");

        //�إ�JRadioButton4
        JRadioButton btn4 = new JRadioButton(str4);
        btn4.setActionCommand("p4");

        //�إ�JRadioButton5
        JRadioButton btn5 = new JRadioButton(str5);
        btn5.setActionCommand("p5");

        //�NJRadioButton�]���s��
        ButtonGroup group = new ButtonGroup();
        group.add(btn1);
        group.add(btn2);
        group.add(btn3);
        group.add(btn4);
        group.add(btn5);

        //�NJRadioButton�[�J�ƥ��ť
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);

        //�]�w�Ϥ�
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

    //�ƥ��ť
    public void actionPerformed(ActionEvent e) 
    {
        picture.setIcon(createImageIcon("pic/"+e.getActionCommand()+ ".gif"));
    }

	//�إ߹ϥ�
    protected static ImageIcon createImageIcon(String path) 
    {
        java.net.URL imgURL = CH12_05.class.getResource(path);
        return new ImageIcon(imgURL);
    }

    private static void createAndShowGUI() 
    {
        //�]�w�����~�[���w�]���A
        JFrame.setDefaultLookAndFeelDecorated(true);

        //�إߵ���
        JFrame frame = new JFrame("JRadioButton ����");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent newContentPane = new CH12_05();
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);

        //�N�����վ��A��
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CH12_05();
        CH12_05.createAndShowGUI();
    }
}