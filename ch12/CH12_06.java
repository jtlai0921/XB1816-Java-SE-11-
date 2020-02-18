/* �{���GCH12_06.java
 * �����GJTextField �ϥλ���
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CH12_06 extends JPanel implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    protected JTextField tf;
    protected JTextArea ta;

    public CH12_06() {
    	
        //�]�w�����t�m
        super(new GridBagLayout());

        tf = new JTextField(30);
        tf.addActionListener(this);

        ta = new JTextArea(10, 30);
        ta.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(ta,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        //�إ߷s�������t�m
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 2.0;
        c.weighty = 2.0;
        add(scrollPane, c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        add(tf, c);        
    }

    //�ƥ��k
    public void actionPerformed(ActionEvent evt) {
        String txt = tf.getText();
        ta.append(txt + "\n");
        tf.selectAll();

        ta.setCaretPosition(ta.getDocument().getLength());
    }


    private static void createAndShowGUI() {
        
        //�w�]�����˦�
        JFrame.setDefaultLookAndFeelDecorated(true);

        //�إߵ���
        JFrame f = new JFrame("JTextField ����");
        
        //�]�w���������Ҧ�
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //�إ߭��O
        JComponent newContentPane = new CH12_06();
        newContentPane.setOpaque(true); //content panes must be opaque
        f.setContentPane(newContentPane);

        //�N�����վ�A��j�p
        f.pack();
        
        //�������i��
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CH12_06();
        CH12_06.createAndShowGUI();
    }
}