import java.util.*;
public class CH16_06{
    public static void main(String[] args) {
        TreeSet<String> word = new TreeSet<String>(); 
        word.add("zoo");
        word.add("tiger");
        word.add("animal");
        word.add("plant");							
        word.add("sugar");
        word.add("desk");
        word.add("funny");
        word.add("joke");
        word.add("yellow");							
        word.add("baseball");
        Iterator<String> itr = word.iterator();
        while (itr.hasNext())
            System.out.println("TreeSet¤º®e : " + itr.next());
    }
}