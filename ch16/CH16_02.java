public class CH16_02 {	
    public static <E> void dump(E[] elements) {
        for(E element:elements)
            System.out.println(element);			
    }
    public static void main(String[] args) {
    Double[] var1 = {5.9, 8.5, 3.8};	
    String[] var2 = {"Happy","Birthday"};		
    System.out.println("�B�I�ư}�C: ");				
    dump(var1);
    System.out.println("�r��}�C");				
    dump(var2);
    }
}