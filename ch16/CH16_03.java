import java.util.*;
public class CH16_03 {	
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>(); 
        list1.add(98);
        list1.add(100);
        list1.add(87);
        System.out.println("==================================");
        System.out.println("目前的鏈結串列內容: " + list1);
        list1.addFirst(65);
        System.out.println("將新元素加入到串列首 : " + list1);
        list1.addLast(76);
        System.out.println("將新元素加入到串列尾 : " + list1);
        System.out.println("串列首的元素: " + list1.getFirst());
        System.out.println("串列尾的元素: " + list1.getLast());
        LinkedList<String> list2 = new LinkedList<String>(); 
        list2.add("行政");
        list2.add("立法");
        list2.add("司法");
        System.out.println("==================================");
        System.out.println("目前的鏈結串列內容: " + list2);
        list2.addFirst("考試");
        System.out.println("將新元素加入到串列首 : " + list2);
        list2.addLast("監察");
        System.out.println("將新元素加入到串列尾 : " + list2);
        System.out.println("串列首的元素: " + list2.getFirst());
        System.out.println("串列尾的元素: " + list2.getLast());
        System.out.println("==================================");
    }
}