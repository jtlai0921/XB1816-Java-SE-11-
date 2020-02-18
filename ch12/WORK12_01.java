//BoxLayout版面配置
import java.awt.*;
import javax.swing.*;
public class WORK12_01 extends JFrame
{	
    private static final long serialVersionUID = 1L;
    Container c=getContentPane();
    JPanel jp1, jp2;
    JButton jb1,jb2,jb3,jb4;
    JTextField jtf1,jtf2,jtf3,jtf4;
    public WORK12_01()
    {	
        //JPanel jp1區
        jp1 = new JPanel();
        jp1.setBorder(BorderFactory.createTitledBorder("版面配置區塊1"));
        jb1 = new JButton("英檢初級");
        jb2 = new JButton("英檢中級");
        jb3 = new JButton("商用多益");
        jb4 = new JButton("留學托福");
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        jp1.add(jb4);
        jp1.setLayout(new BoxLayout(jp1, BoxLayout.X_AXIS));
        //JPanel jp2區
        jp2 = new JPanel();
        jp2.setBorder(BorderFactory.createTitledBorder("版面配置區塊2"));
        jtf1 = new JTextField(5);
        jtf2 = new JTextField(5);
        jtf3 = new JTextField(5);
        jtf4 = new JTextField(5);
        jp2.add(jtf1);
        jp2.add(jtf2);
        jp2.add(jtf3);
        jp2.add(jtf4);
        jp2.setLayout(new BoxLayout(jp2, BoxLayout.Y_AXIS));

        c.add(jp1);
        c.add(jp2);		
        c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
    }
    public static void main(String args[])
    {
        WORK12_01 frm =new WORK12_01();
        frm.setTitle("BoxLayout版面配置");
        frm.setSize(400,400);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);	
    }	
}