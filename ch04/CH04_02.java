/* ボ絛肚ぃじ籔计穦Τぃ块芠 */
public class CH04_02 {
    // 摸よ猭: 2把计,﹚璶块じ才腹の计
    static void myprint(char ch, int num) {
        int i;
        for (i=1; i<=num; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
    // 祘Α
    public static void main(String[] args) {
        myprint('*',10);
        myprint('$',20);
        myprint('%',30);
    }
}