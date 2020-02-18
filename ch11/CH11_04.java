/* 程式：CH11_04.java 
 * 說明：FlowLayout 的版面配置方式
 */ 

import java.awt.*;

class CH11_04 extends Frame
{
    private static final long serialVersionUID = 1L;

    public CH11_04 ()
    {
  	
        //設定視窗大小
        setSize(110,110);           
  		
        //設定版面配置方式
        setLayout(new FlowLayout()); 
   		
        //加入控制元件   		
        add(new Button("按鈕一")); 
        add(new Button("按鈕二"));
        add(new Button("按鈕三"));
        add(new Button("按鈕四"));
        add(new Button("按鈕五"));
   
        //顯示視窗
        setVisible(true);
   
    }
	
    public static void main(String[] args)
    { 
        new CH11_04(); 
    }
}