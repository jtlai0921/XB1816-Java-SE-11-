/* 程式：CH11_06.java 
 * 說明：GridLayout 的版面配置方式
 */ 

import java.awt.*;

class CH11_06 extends Frame
{
    private static final long serialVersionUID = 1L;

    public CH11_06 ()
    {
  		
        //設定視窗大小
        setSize(110,110);           
		
        //設定版面配置方式
        setLayout(new GridLayout(3,2)); 
		
        //加入控制元件		
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
					
        //顯示視窗
        setVisible(true);
   
    }
	
    public static void main(String[] args)
    { 
        new CH11_06(); 
    }
}