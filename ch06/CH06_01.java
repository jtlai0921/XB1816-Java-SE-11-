/*郎:CH06_01.java
 *弧:贺﹃摸ミよ猭
 */ 
public class CH06_01{
    public static void main(String[] args){
        char ch1[] = {'h','e','l','l','o'};//じ皚
        String s1="How are you";//膀セ篈﹃
        String s2 = new String("I am fine,thanks");	//ミ﹃摸ン﹍て
        String str1=new String(ch1);		
        String str2=new String(ch1,2,3);
        String str3=new String(s1);
        String str4=new String(s2);
        System.out.println("じ皚把计ミ﹃ず甧:"+str1);
        System.out.println("じ皚﹚计ミ﹃ず甧:"+str2);
        System.out.println("﹃把计ミ﹃ず甧:"+str3);
        System.out.println("﹃ン把计ミ﹃ず甧:"+str4);
    }	
}