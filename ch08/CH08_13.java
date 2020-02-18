class Add {    
    int sum(int a) {							
        return a;
    }
    int sum(int a, int b) {					
        return a + b;
    }
    int sum(int a, int b, int c) {			
        return a + b + c;
    }
    double sum(double a) {							
        return a;
    }
    double sum(double a, double b) {					
        return a + b;
    }
    double sum(double a, double b, double c) {			
        return a + b + c;
    }
}

public class CH08_13 {
    public static void main(String[] args) {
        Add obj = new Add();
	System.out.println(obj.sum(10));
        System.out.println(obj.sum(10));
        System.out.println(obj.sum(10, 10));
        System.out.println(obj.sum(10, 10, 10));
        System.out.println(obj.sum(3.7));
        System.out.println(obj.sum(4.5, 6.3));
        System.out.println(obj.sum(4.5, 6.3, 5.2));	
    }
}