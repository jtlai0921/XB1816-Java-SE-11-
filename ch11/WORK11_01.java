//�H�ƹ��ƥ���ܵ����I����
import java.awt.*;
import java.awt.event.*;
public class WORK11_01 extends Frame implements ActionListener
{
    private static final long serialVersionUID = 1L;
private static Button myButton;   
    public WORK11_01()
    {
        setSize(400,200);
        setTitle("�H�ƹ��ƥ���ܵ����I����");
        setLayout(new FlowLayout());
        setBackground(Color.RED);
        myButton = new Button("��������");
        //���w�ƥ��ť��
        myButton.addActionListener(this);
        add(myButton);
        //�ۭq�ƥ��ť��
        addWindowListener(new MyListener());
        setVisible(true);
    }
    public static void main(String args[])
    {    //��@�{������
        final WORK11_01 myFrm = new WORK11_01();      
        //�����ΦW���O�Ҧ�
        myFrm.addMouseListener(
        new MouseAdapter(){
            public void mouseEntered(MouseEvent myevent1){
                myFrm.setBackground(Color.YELLOW);}
            public void mouseExited(MouseEvent myevent2){
                myFrm.setBackground(Color.BLUE);}
        });
    }
    //���w�ƥ�B�z��
    public void actionPerformed(ActionEvent myevent3){
        System.exit(0);}
    //�ۭq�ƥ�B�z��
    private class MyListener extends WindowAdapter {
        public void windowClosing(WindowEvent myevent4){
     	    System.exit(0);}}     	
}