public class Substring {
    public static String substringg(String str , int si , int ei){
        String s = "";
        for(int i = si ; i < ei ; i++){
            s += str.charAt(i);
        }
        return s;
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(substringg(str, 0, 5));
        System.out.println(str.substring(0, 5));

    }
}
