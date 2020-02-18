/* �{���GCH12_07.java
 * �����GJList �ϥλ���
 */

import java.awt.BorderLayout;
import javax.swing.*;

public class CH12_07 extends JPanel{

    private static final long serialVersionUID = 1L;
    private JList<String> list;
    private DefaultListModel<String> dlm;

    public CH12_07() {
        super(new BorderLayout());

        //�إ�DefaultlistModel ����
        dlm = new DefaultListModel<String>();
        
        //�[�J����
        dlm.addElement("C/C++�J���P���");
        dlm.addElement("Java�J���P�i��");
        dlm.addElement("Visual C++�C���]�k");
        dlm.addElement("Visual Basic�P�C���]�p");
        dlm.addElement("Visual C#�C���]�p�]�k��");
        dlm.addElement("Python �оǽd��");

        //�إ�JList����
        list = new JList<String>(dlm);
        
        //�]�wJList��ܼҦ�
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //�]�wJList������d��m
        list.setSelectedIndex(0);

        //�]�w�C��
        list.setVisibleRowCount(5);
        
        //�إ߱��b���O
        JScrollPane listScrollPane = new JScrollPane(list);

        //�N���b���O�[��D���O��
        add(listScrollPane, BorderLayout.CENTER);

    }

    private static void createAndShowGUI() {

        //�]�q�����~�[
        JFrame.setDefaultLookAndFeelDecorated(true);

        //�إߵ�������
        JFrame frame = new JFrame("JList ����");
        
        //�]�w���������覡
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent newContentPane = new CH12_07();
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);

        //�N�����j�p�վ�A��
        frame.pack();
        
        //�N�����]���i��
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CH12_07();
        CH12_07.createAndShowGUI();
    }
}