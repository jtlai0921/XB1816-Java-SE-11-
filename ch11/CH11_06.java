/* �{���GCH11_06.java 
 * �����GGridLayout �������t�m�覡
 */ 

import java.awt.*;

class CH11_06 extends Frame
{
    private static final long serialVersionUID = 1L;

    public CH11_06 ()
    {
  		
        //�]�w�����j�p
        setSize(110,110);           
		
        //�]�w�����t�m�覡
        setLayout(new GridLayout(3,2)); 
		
        //�[�J�����		
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
					
        //��ܵ���
        setVisible(true);
   
    }
	
    public static void main(String[] args)
    { 
        new CH11_06(); 
    }
}