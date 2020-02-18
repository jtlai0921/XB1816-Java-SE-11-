//使用各種迴圈計算1-50累計總和
class WORK03_03 {
    public static void main(String args[]) {
        int totalSum = 0;
        int var1 = 1;
        int var2 = 1;
        int var4 = 50;
        //while迴圈
        while(var1 <= var4) {
     	    totalSum += var1;
     	    var1 += 1;
        }
        System.out.println("while迴圈作1至50累加總和為" + totalSum);
        totalSum = 0;
        //do..while迴圈
        do {
     	    totalSum += var2;
     	    var2 += 1;
        }while(var2 <= var4);
        System.out.println("do..while迴圈作1至50累加總和為" + totalSum);
        totalSum = 0;
        //for迴圈
        for (int var3 = 1; var3 <= var4; var3++)
     	    totalSum += var3;
        System.out.println("for迴圈1至50累加總和為" + totalSum);
    }
} 