import java.util.*;
public class CH16_03 {	
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>(); 
        list1.add(98);
        list1.add(100);
        list1.add(87);
        System.out.println("==================================");
        System.out.println("�ثe���쵲��C���e: " + list1);
        list1.addFirst(65);
        System.out.println("�N�s�����[�J���C�� : " + list1);
        list1.addLast(76);
        System.out.println("�N�s�����[�J���C�� : " + list1);
        System.out.println("��C��������: " + list1.getFirst());
        System.out.println("��C��������: " + list1.getLast());
        LinkedList<String> list2 = new LinkedList<String>(); 
        list2.add("��F");
        list2.add("�ߪk");
        list2.add("�q�k");
        System.out.println("==================================");
        System.out.println("�ثe���쵲��C���e: " + list2);
        list2.addFirst("�Ҹ�");
        System.out.println("�N�s�����[�J���C�� : " + list2);
        list2.addLast("�ʹ�");
        System.out.println("�N�s�����[�J���C�� : " + list2);
        System.out.println("��C��������: " + list2.getFirst());
        System.out.println("��C��������: " + list2.getLast());
        System.out.println("==================================");
    }
}