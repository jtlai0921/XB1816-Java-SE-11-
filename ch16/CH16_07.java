import java.util.*;
public class CH16_07 {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<String, String>(); 
        hmap.put("abase", "�������F�ϭ��C�a��");
        hmap.put("encyclopedia", "�ʬ����");
        hmap.put("yokel", "�m�ڨ�");
        hmap.put("xerox", "�ƦL");
        hmap.put("hybrid", "�V���F�X����");

        String str1 = "yokel";					
        System.out.println("�HHashMap���O���覡�إߪ���");
        System.out.println();
        System.out.println("�^���ryokel������N�q���G" + hmap.get(str1));
        System.out.println("�r�夺�e���|�M��ƥ[�J�����Ǥ@�P");
        for (Map.Entry m:hmap.entrySet())
            System.out.printf("%15s ==> %s\n", m.getKey(), m.getValue());
        System.out.println("==================================");
        
        TreeMap<String, String> tmap = new TreeMap<String, String>(); 
        tmap.put("abase", "�������F�ϭ��C�a��");
        tmap.put("encyclopedia", "�ʬ����");
        tmap.put("yokel", "�m�ڨ�");
        tmap.put("xerox", "�ƦL");
        tmap.put("hybrid", "�V���F�X����");

        String str2 = "abase";					
        System.out.println("�HTreeMap���O���覡�إߪ���");
        System.out.println();
        System.out.println("�^���rabase������N�q���G" + tmap.get(str2));
        System.out.println("�r�夺�e�|�̾���ȥѤp��j�Ƨ�");
        for (Map.Entry m:tmap.entrySet())
            System.out.printf("%15s ==> %s\n", m.getKey(), m.getValue());
    }
}