class First<T>{   // �x�����
    private T num1;
    private T num2;
		
    void set(T data1, T data2) { // �]�w�x��
        this.num1 = data1; 
        this.num2 = data2; 
    }
    public T get() {
        return this.num1; // �^�ǲĤ@�ӰѼƭ�
    }
}
public class CH16_01 {	
    public static void main(String[] args) {
        First<Integer> m = new First<Integer>();// �إ߾�ƪ���
        m.set(101,7); 
        System.out.println(m.get());	 
        First<Double> d = new First<Double>(); // �إ������g�ׯB�I�ƪ���
        d.set(8.93,9.67);	 
        System.out.println(d.get());	
    }
}