/* �{���GCH11_07.java 
 * �����G��@WindowEvent�ƥ����O
 */ 

import java.awt.*;
import java.awt.event.*;

public class CH11_07 extends Frame implements WindowListener{
    private static final long serialVersionUID = 1L;
    public static void main(String args[]) {
        CH11_07 WL = new CH11_07();	
        WL.addWindowListener(new CH11_07());	
        WL.setBounds(120, 120, 240, 240);	
        WL.setVisible(true);	
    }
    public void windowClosing(WindowEvent e) {	
        System.out.println("��������");
        System.exit(0);	
    }
    public void windowActivated(WindowEvent e) {	
        System.out.println("���o�����D���v");
    }
    public void windowDeactivated(WindowEvent e) {	
        System.out.println("���h�����D���v");
    }	
    public void windowDeiconified(WindowEvent e) {	
        System.out.println("�����٭�");
    }
    public void windowIconified(WindowEvent e) {	
        System.out.println("�����Y�p");
    }
    public void windowOpened(WindowEvent e) {	
        System.out.println("�����}��");
    }
    public void windowClosed(WindowEvent e) {	
    }
}