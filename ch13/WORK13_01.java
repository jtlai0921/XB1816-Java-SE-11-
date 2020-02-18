//ø�ϥ\�����λP�d�ҹ�@
import java.awt.*;
import java.awt.event.*;
public class WORK13_01 extends Frame implements ActionListener
{  
    private static final long serialVersionUID = 1L;
    int kind;
    Button b1,b2,b3,b4,b5;
    public WORK13_01()
    {   
        setTitle("ø�e�\��d��");
        //�]�w�j�p����
        setSize(450,220);
        setVisible(true);
        //�]�w�]���������s�\��
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e){
                System.exit(0); 
            }
        }
        );
        //�s�W���ӫ��s
        b1=new Button("fillPolygon(�h���)");
        b2=new Button("fillOval(���)");
        b3=new Button("fillOval(����)");
        b4=new Button("fillRect(�x��)");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        //�����t�m
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        //�[�J��ť��
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    //�����M�B�z��ť�ƥ�
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1) 	//��ƹ����Ub1���s��
            kind=1;				
        else if(e.getSource()==b2)
            kind=2;
        else if(e.getSource()==b3)
            kind=3;
        else if(e.getSource()==b4)
            kind=4;
            repaint();
    }
    public void paint (Graphics g)
    {	//�ھڷƹ����U�����s�ӧP�_�n�e���ϧ�
        int xs[]={60,120,160,120,60,20};
        int ys[]={80,80,140,200,200,140};
        switch(kind){
            case 1:{g.setColor(Color.BLUE);
   	        g.fillPolygon(xs,ys,6);
   	        break;}
   	    case 2:{g.setColor(Color.YELLOW);
   	        g.fillOval(60,80,120,120);
                break;}
            case 3:{g.setColor(Color.RED);
                g.fillOval(60,80,120,100);
                break;}  			
            case 4:{g.setColor(Color.CYAN);
                g.fillRect(60,80,140,120);
                break;}
        }
    }
    //�D�{������
    public static void main(String args[])
    {
        WORK13_01 myfrm = new WORK13_01();
        myfrm.setVisible(true);
    }
}