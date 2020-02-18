import java.util.*;
public class CH16_07 {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<String, String>(); 
        hmap.put("abase", "使謙卑；使降低地位");
        hmap.put("encyclopedia", "百科全書");
        hmap.put("yokel", "鄉巴佬");
        hmap.put("xerox", "複印");
        hmap.put("hybrid", "混血兒；合成物");

        String str1 = "yokel";					
        System.out.println("以HashMap類別的方式建立物件");
        System.out.println();
        System.out.println("英文單字yokel的中文意義為：" + hmap.get(str1));
        System.out.println("字典內容不會和資料加入的順序一致");
        for (Map.Entry m:hmap.entrySet())
            System.out.printf("%15s ==> %s\n", m.getKey(), m.getValue());
        System.out.println("==================================");
        
        TreeMap<String, String> tmap = new TreeMap<String, String>(); 
        tmap.put("abase", "使謙卑；使降低地位");
        tmap.put("encyclopedia", "百科全書");
        tmap.put("yokel", "鄉巴佬");
        tmap.put("xerox", "複印");
        tmap.put("hybrid", "混血兒；合成物");

        String str2 = "abase";					
        System.out.println("以TreeMap類別的方式建立物件");
        System.out.println();
        System.out.println("英文單字abase的中文意義為：" + tmap.get(str2));
        System.out.println("字典內容會依據鍵值由小到大排序");
        for (Map.Entry m:tmap.entrySet())
            System.out.printf("%15s ==> %s\n", m.getKey(), m.getValue());
    }
}