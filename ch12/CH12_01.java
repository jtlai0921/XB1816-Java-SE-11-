/* 程式：CH12_01.java
 * 說明：建立一個 Swing 視窗
 */
import java.awt.*;
import javax.swing.*;

public class CH12_01 {

    private static void createfFrame() {
		
        //設訂視窗外觀為預設模式
        JFrame.setDefaultLookAndFeelDecorated(true);

        //建立視窗元件
        JFrame frame = new JFrame("Swing 視窗");
        
        //設定預設的視窗關閉模式
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //加入元件
        JLabel emptyLabel = new JLabel("建立 Swing 視窗");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //自動調整視窗外觀
        frame.pack();
        
        //顯示視窗
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        
        new CH12_01();
		//建立物件
        CH12_01.createfFrame();
    }
}