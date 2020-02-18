//OverlayLayout版面配置
import javax.swing.*;
import java.awt.*;
public class WORK12_02 extends JFrame
{	
    private static final long serialVersionUID = 1L;
    //宣告區
    Container c=getContentPane();
    JButton jb1;
    JLabel jlab;
    ImageIcon icon=new ImageIcon("p1.gif");
    JTextArea jta;
    public WORK12_02()
    {
        jb1=new JButton("我是教學小尖兵，請按我");
        jb1.setBorder(BorderFactory.createRaisedBevelBorder());
        //將icon加入jLab中
        jlab=new JLabel(icon);
        jlab.setBorder(BorderFactory.createTitledBorder("JLabel區"));
        jta=new JTextArea(1,5);
        jta.setBorder(BorderFactory.createTitledBorder("JTextArea區"));
        jta.setBackground(Color.yellow);
        c.add(jb1);
        c.add(jlab);
        c.add(jta);
        c.setLayout(new OverlayLayout(c));
    }
    public static void main(String args[])
    {
        WORK12_02 frm =new WORK12_02();
        frm.setTitle("OverlayLayout版面配置");
        frm.setSize(500,500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);	
    }	
}