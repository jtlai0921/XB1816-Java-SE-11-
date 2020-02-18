/*檔案:CH07_01.java
 *說明:參數與引數的使用
 */ 
 
class Triangle{
    int base;
    int height;
    double ans;
	
    void Area(){
        ans=(base*height)/2;
        System.out.println("底="+base+",高="+height+"：三角形面積="+ans+'\n');
    }
    double Area_2(int i){
        return ans=(i*height)/2;
    }
    double Area_3(int i,int j){
        return ans=(i*j)/2;
    }
}

class CH07_01{
    public static void main(String[] args){
        // 實作類別物件
        Triangle triangle=new Triangle();
		
        triangle.base=2;
        triangle.height=8;
		
        System.out.println("不具回傳值的方法，沒有引數：");
        triangle.Area();
        System.out.println("具有回傳值，單一引數：");
        System.out.println("三角形面積="+triangle.Area_2(4)+'\n');
        System.out.println("具有回傳值，2個引數：");
        System.out.println("三角形面積="+triangle.Area_3(4,10));	
    }
}