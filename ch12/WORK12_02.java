//OverlayLayout�����t�m
import javax.swing.*;
import java.awt.*;
public class WORK12_02 extends JFrame
{	
    private static final long serialVersionUID = 1L;
    //�ŧi��
    Container c=getContentPane();
    JButton jb1;
    JLabel jlab;
    ImageIcon icon=new ImageIcon("p1.gif");
    JTextArea jta;
    public WORK12_02()
    {
        jb1=new JButton("�ڬO�оǤp�y�L�A�Ы���");
        jb1.setBorder(BorderFactory.createRaisedBevelBorder());
        //�Nicon�[�JjLab��
        jlab=new JLabel(icon);
        jlab.setBorder(BorderFactory.createTitledBorder("JLabel��"));
        jta=new JTextArea(1,5);
        jta.setBorder(BorderFactory.createTitledBorder("JTextArea��"));
        jta.setBackground(Color.yellow);
        c.add(jb1);
        c.add(jlab);
        c.add(jta);
        c.setLayout(new OverlayLayout(c));
    }
    public static void main(String args[])
    {
        WORK12_02 frm =new WORK12_02();
        frm.setTitle("OverlayLayout�����t�m");
        frm.setSize(500,500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);	
    }	
}