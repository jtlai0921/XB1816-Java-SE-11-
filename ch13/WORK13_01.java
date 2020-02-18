//繪圖功能應用與範例實作
import java.awt.*;
import java.awt.event.*;
public class WORK13_01 extends Frame implements ActionListener
{  
    private static final long serialVersionUID = 1L;
    int kind;
    Button b1,b2,b3,b4,b5;
    public WORK13_01()
    {   
        setTitle("繪畫功能範例");
        //設定大小視窗
        setSize(450,220);
        setVisible(true);
        //設定設窗關閉按鈕功能
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e){
                System.exit(0); 
            }
        }
        );
        //新增五個按鈕
        b1=new Button("fillPolygon(多邊形)");
        b2=new Button("fillOval(圓形)");
        b3=new Button("fillOval(橢圓形)");
        b4=new Button("fillRect(矩形)");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        //版面配置
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        //加入監聽員
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    //接收和處理監聽事件
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1) 	//當滑鼠按下b1按鈕時
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
    {	//根據滑鼠按下的按鈕來判斷要畫的圖形
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
    //主程式部分
    public static void main(String args[])
    {
        WORK13_01 myfrm = new WORK13_01();
        myfrm.setVisible(true);
    }
}