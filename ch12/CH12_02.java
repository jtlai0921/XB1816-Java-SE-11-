/* �{���GCH12_02.java
 * �����G�ʺA�� Swing ����~�[
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CH12_02
{
    JFrame frame;
    JRadioButton b1 = new JRadioButton("�w�]�~�["),
    b2 = new JRadioButton("Unix"),
    b3 = new JRadioButton("Windows");

    public void createFrame() 
    {
        //�إߵ���
        frame=new JFrame("�ʺA�� Swing ����~�[");
        
        //���o�����e��
        Container contentPane = frame.getContentPane();
        
        //�N���O�N�J�����e����
        contentPane.add(new jp(), BorderLayout.CENTER);
        
        //�N�����j�p�վ�A��
        frame.pack();
        
        //�N�����]�w���i��
        frame.setVisible(true);       
    }

    //�ۭq���O���e
    class jp extends JPanel implements ActionListener
    {
        private static final long serialVersionUID = 1L;

        @SuppressWarnings({ "unchecked", "rawtypes" })
		public jp() 
        {
            
            add(new JTextField("��r���"));
            add(new JButton("���s"));
            add(new JRadioButton("�ﶵ"));
            add(new JCheckBox("�֨����"));
            add(new JLabel("����"));
            add(new JList(new String[] {
                "���@", 
                "���G", 
                "���T"}));
                
            add(new JScrollBar(SwingConstants.HORIZONTAL));

            ButtonGroup group = new ButtonGroup();
            group.add(b1);
            group.add(b2);
            group.add(b3);

			//�[�J�����ť�ƥ�
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);

            add(b1);
            add(b2);
            add(b3);
        }

        public void actionPerformed(ActionEvent e) 
        {
            try {
                if((JRadioButton)e.getSource() == b1)
                    UIManager.setLookAndFeel(
                      "javax.swing.plaf.metal.MetalLookAndFeel");
                else if((JRadioButton)e.getSource() == b2)
                    UIManager.setLookAndFeel(
                        "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                else if((JRadioButton)e.getSource() == b3)
                    UIManager.setLookAndFeel(
                        "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            }
            catch(Exception ex) {}

            SwingUtilities.updateComponentTreeUI(frame.getContentPane());
        }
    }
    
    public static void main(String[] args){
    	new CH12_02().createFrame();
    }
}