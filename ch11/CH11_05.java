/* �{���GCH11_05.java 
 * �����GBorderLayout �������t�m�覡
 */ 

import java.awt.*;

class CH11_05 extends Frame
{
    private static final long serialVersionUID = 1L;

    public CH11_05 ()
    {
  	
        //�]�w�����j�p
        setSize(110,110);           
		
        //�]�w�����t�m�覡
        setLayout(new BorderLayout()); 
		
        //�[�J�����		
        add(new Button("�F"), BorderLayout.EAST);
        add(new Button("��"), BorderLayout.WEST);
        add(new Button("�n"), BorderLayout.SOUTH);
        add(new Button("�_"), BorderLayout.NORTH);
        add(new Button("��"), BorderLayout.CENTER);
				
        //��ܵ���
        setVisible(true);
   
    }
	
    public static void main(String[] args)
    { 
        new CH11_05(); 
    }
}