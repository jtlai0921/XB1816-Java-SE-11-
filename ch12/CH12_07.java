/* 程式：CH12_07.java
 * 說明：JList 使用說明
 */

import java.awt.BorderLayout;
import javax.swing.*;

public class CH12_07 extends JPanel{

    private static final long serialVersionUID = 1L;
    private JList<String> list;
    private DefaultListModel<String> dlm;

    public CH12_07() {
        super(new BorderLayout());

        //建立DefaultlistModel 物件
        dlm = new DefaultListModel<String>();
        
        //加入元素
        dlm.addElement("C/C++入門與實務");
        dlm.addElement("Java入門與進階");
        dlm.addElement("Visual C++遊戲魔法");
        dlm.addElement("Visual Basic與遊戲設計");
        dlm.addElement("Visual C#遊戲設計魔法書");
        dlm.addElement("Python 教學範本");

        //建立JList物件
        list = new JList<String>(dlm);
        
        //設定JList選擇模式
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //設定JList選取停留位置
        list.setSelectedIndex(0);

        //設定列數
        list.setVisibleRowCount(5);
        
        //建立捲軸面板
        JScrollPane listScrollPane = new JScrollPane(list);

        //將捲軸面板加到主面板中
        add(listScrollPane, BorderLayout.CENTER);

    }

    private static void createAndShowGUI() {

        //設訂視窗外觀
        JFrame.setDefaultLookAndFeelDecorated(true);

        //建立視窗物件
        JFrame frame = new JFrame("JList 應用");
        
        //設定視窗關閉方式
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent newContentPane = new CH12_07();
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);

        //將視窗大小調整適中
        frame.pack();
        
        //將視窗設為可視
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CH12_07();
        CH12_07.createAndShowGUI();
    }
}