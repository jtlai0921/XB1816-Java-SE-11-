/*�ɮ�:SetStr.java 
 *����:�s�������O��private����,
*/
public class SetStr{
    //�إ�private�������	
    private static String privateString = "";
    //�إ�private������k
    private static void privateData( ){
        System.out.println("�~�����Oprivate������k�A�ΥH��ܥ~�����O��" + 
		           "private�r���ܼƬ�\n" + privateString);
    }
    //�إ�public������k�ΥH�I�s�P�s��private����
    public static void setPrivateData(String myStr){
        privateString = myStr;
    }
    public static void showPrivateData( ){
        privateData();
    }
}