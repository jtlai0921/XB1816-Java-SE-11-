//�ϥΦU�ذj��p��1-50�֭p�`�M
class WORK03_03 {
    public static void main(String args[]) {
        int totalSum = 0;
        int var1 = 1;
        int var2 = 1;
        int var4 = 50;
        //while�j��
        while(var1 <= var4) {
     	    totalSum += var1;
     	    var1 += 1;
        }
        System.out.println("while�j��@1��50�֥[�`�M��" + totalSum);
        totalSum = 0;
        //do..while�j��
        do {
     	    totalSum += var2;
     	    var2 += 1;
        }while(var2 <= var4);
        System.out.println("do..while�j��@1��50�֥[�`�M��" + totalSum);
        totalSum = 0;
        //for�j��
        for (int var3 = 1; var3 <= var4; var3++)
     	    totalSum += var3;
        System.out.println("for�j��1��50�֥[�`�M��" + totalSum);
    }
} 