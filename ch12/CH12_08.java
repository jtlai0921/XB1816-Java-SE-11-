/* 程式：CH12_08.java
 * 說明：建立頁籤     */
 
import javax.swing.*;
import java.awt.*;
public class CH12_08{
    public static void main(String[] args){
        JFrame JF=new JFrame("建立JTabbedPane");
        Dimension sc=Toolkit.getDefaultToolkit().getScreenSize();
        JF.getContentPane().setLayout(null); 
        int x=(sc.width-300)/2;
        int y=(sc.height)/2;
        JF.setLocation(x,y);
        JF.setSize(300,150);
        JTabbedPane JT=new JTabbedPane();
        JT.setBounds(0,0,300,150);
        JT.addTab("學歷",null,null,"學歷提示");
        JT.addTab("姓名",null,null,"姓名提示");
        JT.addTab("住址",null,null,"住址提示");
        JT.addTab("自我介紹",null,null,"自我介紹提示");
        JF.getContentPane().add(JT);
        JF.setVisible(true);
    }
}