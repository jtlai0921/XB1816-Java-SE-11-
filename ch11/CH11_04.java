/* �{���GCH11_04.java 
 * �����GFlowLayout �������t�m�覡
 */ 

import java.awt.*;

class CH11_04 extends Frame
{
    private static final long serialVersionUID = 1L;

    public CH11_04 ()
    {
  	
        //�]�w�����j�p
        setSize(110,110);           
  		
        //�]�w�����t�m�覡
        setLayout(new FlowLayout()); 
   		
        //�[�J�����   		
        add(new Button("���s�@")); 
        add(new Button("���s�G"));
        add(new Button("���s�T"));
        add(new Button("���s�|"));
        add(new Button("���s��"));
   
        //��ܵ���
        setVisible(true);
   
    }
	
    public static void main(String[] args)
    { 
        new CH11_04(); 
    }
}