/* �{���GCH12_01.java
 * �����G�إߤ@�� Swing ����
 */
import java.awt.*;
import javax.swing.*;

public class CH12_01 {

    private static void createfFrame() {
		
        //�]�q�����~�[���w�]�Ҧ�
        JFrame.setDefaultLookAndFeelDecorated(true);

        //�إߵ�������
        JFrame frame = new JFrame("Swing ����");
        
        //�]�w�w�]�����������Ҧ�
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //�[�J����
        JLabel emptyLabel = new JLabel("�إ� Swing ����");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //�۰ʽվ�����~�[
        frame.pack();
        
        //��ܵ���
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        
        new CH12_01();
		//�إߪ���
        CH12_01.createfFrame();
    }
}