/*�ɮ�:CH03_04.java
 *����:if-else-if���󱱨�(2)
 */

public class CH03_04{
    public static void main(String[] ages){
		
        //�ܼƫŧi
        int score=88;
        System.out.println("Tim�Ǵ����Z�`��="+score);
        //if-else-if���ҧP�_��
        if(score>=90){
            System.out.println("����Ť����šGA"+'\n');
        }else if((score>=70)&&(score<90)){
            System.out.println("����Ť����šGB"+'\n');
        }else{
            System.out.println("����Ť����šGC"+'\n');
        }
		
        score=60;
        System.out.println("Tracy�Ǵ����Z�`��="+score);
        if(score>=90){
            System.out.println("����Ť����šGA"+'\n');
        }else if((score>=70)&&(score<90)){
            System.out.println("����Ť����šGB"+'\n');
        }else{
            System.out.println("����Ť����šGC"+'\n');
        }
    }
}