/* 程式：CH11_07.java 
 * 說明：實作WindowEvent事件類別
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
        System.out.println("視窗關閉");
        System.exit(0);	
    }
    public void windowActivated(WindowEvent e) {	
        System.out.println("取得視窗主控權");
    }
    public void windowDeactivated(WindowEvent e) {	
        System.out.println("失去視窗主控權");
    }	
    public void windowDeiconified(WindowEvent e) {	
        System.out.println("視窗還原");
    }
    public void windowIconified(WindowEvent e) {	
        System.out.println("視窗縮小");
    }
    public void windowOpened(WindowEvent e) {	
        System.out.println("視窗開啟");
    }
    public void windowClosed(WindowEvent e) {	
    }
}