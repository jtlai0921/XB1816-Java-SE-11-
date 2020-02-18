/* �{���GCH12_03.java
 * �����GJButton �ϥλ���
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
    	
        //������s
        b1 = new JButton("�������s�\�����");
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEADING);
        b1.setMnemonic(KeyEvent.VK_D);
        b1.setActionCommand("dis");

        //�������s
        b2 = new JButton("�������s");
        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
        b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setMnemonic(KeyEvent.VK_M);

        //�k����s
        b3 = new JButton("�������s�\���_");
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setActionCommand("en");
        b3.setEnabled(false);

        //���s�[�J��ť�ƥ�
        b1.addActionListener(this);
        b3.addActionListener(this);

        //�N����[�J���O��
        add(b1);
        add(b2);
        add(b3);
    }

    //��@�ƥ��k
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
        
        //�����~�[�]�w��Swing�w�]���A
        JFrame.setDefaultLookAndFeelDecorated(true);

        //�إߵ���
        JFrame frame = new JFrame("JButton �ϥ�");
        
        //�]�w�w�]���������Ҧ�
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //�إ߭��O
        CH12_03 newContentPane = new CH12_03();
        newContentPane.setOpaque(true); 
        
        //�N���O�[�������
        frame.setContentPane(newContentPane);

        //�N�����j�p�վ�A��
        frame.pack();
        
        //�N�����]���i��
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CH12_03();
        CH12_03.createAndShowGUI();
    }
}