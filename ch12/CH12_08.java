/* �{���GCH12_08.java
 * �����G�إ߭���     */
 
import javax.swing.*;
import java.awt.*;
public class CH12_08{
    public static void main(String[] args){
        JFrame JF=new JFrame("�إ�JTabbedPane");
        Dimension sc=Toolkit.getDefaultToolkit().getScreenSize();
        JF.getContentPane().setLayout(null); 
        int x=(sc.width-300)/2;
        int y=(sc.height)/2;
        JF.setLocation(x,y);
        JF.setSize(300,150);
        JTabbedPane JT=new JTabbedPane();
        JT.setBounds(0,0,300,150);
        JT.addTab("�Ǿ�",null,null,"�Ǿ�����");
        JT.addTab("�m�W",null,null,"�m�W����");
        JT.addTab("��}",null,null,"��}����");
        JT.addTab("�ۧڤ���",null,null,"�ۧڤ��д���");
        JF.getContentPane().add(JT);
        JF.setVisible(true);
    }
}