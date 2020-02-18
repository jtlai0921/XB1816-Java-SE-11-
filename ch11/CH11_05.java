/* 程式：CH11_05.java 
 * 說明：BorderLayout 的版面配置方式
 */ 

import java.awt.*;

class CH11_05 extends Frame
{
    private static final long serialVersionUID = 1L;

    public CH11_05 ()
    {
  	
        //設定視窗大小
        setSize(110,110);           
		
        //設定版面配置方式
        setLayout(new BorderLayout()); 
		
        //加入控制元件		
        add(new Button("東"), BorderLayout.EAST);
        add(new Button("西"), BorderLayout.WEST);
        add(new Button("南"), BorderLayout.SOUTH);
        add(new Button("北"), BorderLayout.NORTH);
        add(new Button("中"), BorderLayout.CENTER);
				
        //顯示視窗
        setVisible(true);
   
    }
	
    public static void main(String[] args)
    { 
        new CH11_05(); 
    }
}