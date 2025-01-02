public class lengthofstring {
    public static int lengthe(String str){
        if(str.length() == 0){
            return 0;
        }
        return lengthe(str.substring(1)) + 1; 
    }
    public static void main(String[] args) {
        String str = "aaryan";
        System.out.println(lengthe(str));
    }
}
