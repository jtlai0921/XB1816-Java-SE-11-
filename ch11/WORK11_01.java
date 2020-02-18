//以滑鼠事件改變視窗背景色
import java.awt.*;
import java.awt.event.*;
public class WORK11_01 extends Frame implements ActionListener
{
    private static final long serialVersionUID = 1L;
private static Button myButton;   
    public WORK11_01()
    {
        setSize(400,200);
        setTitle("以滑鼠事件改變視窗背景色");
        setLayout(new FlowLayout());
        setBackground(Color.RED);
        myButton = new Button("關閉視窗");
        //內定事件監聽員
        myButton.addActionListener(this);
        add(myButton);
        //自訂事件監聽員
        addWindowListener(new MyListener());
        setVisible(true);
    }
    public static void main(String args[])
    {    //實作程式視窗
        final WORK11_01 myFrm = new WORK11_01();      
        //內部匿名類別模式
        myFrm.addMouseListener(
        new MouseAdapter(){
            public void mouseEntered(MouseEvent myevent1){
                myFrm.setBackground(Color.YELLOW);}
            public void mouseExited(MouseEvent myevent2){
                myFrm.setBackground(Color.BLUE);}
        });
    }
    //內定事件處理者
    public void actionPerformed(ActionEvent myevent3){
        System.exit(0);}
    //自訂事件處理者
    private class MyListener extends WindowAdapter {
        public void windowClosing(WindowEvent myevent4){
     	    System.exit(0);}}     	
}