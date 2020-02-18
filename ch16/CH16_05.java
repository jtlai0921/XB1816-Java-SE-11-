import java.util.*;
public class CH16_05 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(); 
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);							
        list.add(500);
        Iterator<Integer> itr1 = list.iterator();
        System.out.println("===================================");
        while (itr1.hasNext())
            System.out.println("鏈結串列內容 : " + itr1.next());
		
        HashSet<Integer> set = new HashSet<Integer>(); 
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);							
        set.add(500);
        Iterator<Integer> itr2 = set.iterator();
        System.out.println("===================================");
        while (itr2.hasNext())
            System.out.println("雜湊表內容 : " + itr2.next());
    }
}