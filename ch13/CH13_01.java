/*�{���GCH13_01 Draw������k����*/
//���J�����M��
import java.awt.*;
import java.awt.event.*;
public class CH13_01 extends Frame{
    private static final long serialVersionUID = 1L;
    //�ŧi�������
    private static Graphics g;
    private static String myStr = "Hello Java!!";
    private static int[] xPoints = {215, 227, 269, 233, 243, 215, 187, 197, 161, 203};
    private static int[] yPoints = {80, 116, 116, 134, 176, 152, 176, 134, 116, 116};
    //���O�غc�l
    public CH13_01(){
        //�]�wAWT�����ݩ�
        setTitle("Draw������k����");
        setSize(300,220);
        setVisible(true);
        setBackground(Color.pink);
        //�]�w���������ʧ@
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);}});
            //���oø�Ϫ���
            g = getGraphics();
            //�]�wø�Ϫ����ݩʤ��e
            g.setColor(Color.blue);
            g.setFont(new Font("SimHei", Font.BOLD, 32));
        }
        public static void main(String args[]){
            CH13_01 myFrm = new CH13_01();
            myFrm.setVisible(true);
            //�I�sø�Ϥ�k
            g.drawString(myStr ,10,70);
            g.drawOval(30, 80, 50, 50);
            g.drawRect(100, 80, 50, 70);
            g.drawPolygon(xPoints, yPoints, 10);
    }
}