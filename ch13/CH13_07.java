/*�{���GCH13_07 paint()�Prepaint()��k����*/
//���J�����M��
import java.awt.*;
import java.awt.event.*;
public class CH13_07 extends Frame{
    private static final long serialVersionUID = 1L;
    private static Image myImg;
    //���O�غc�l
    public CH13_07(){
        //�]�wAWT�����ݩ�
        setTitle("paint()�Prepaint()��k����");
        setSize(300, 300);
        setVisible(true);
        //�]�w���������ʧ@
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);}});
            //���J�v���ϧ��ɮ�
            myImg = Toolkit.getDefaultToolkit().getImage("test.jpg");
        }
        //����paint()���O
        public void paint(Graphics g){
            g.drawImage(myImg, 10, 30, 150, 150,this);
        }
        public static void main(String args[]){
            CH13_07 myFrm = new CH13_07();
            myFrm.setVisible(true);
            //�I�srepaint()��k
            myFrm.repaint();
    }
}