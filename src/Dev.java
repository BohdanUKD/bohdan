public class Dev {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(devide(a, b));
        System.out.println("fkkfff");
    }

    public static String devide(int a, int b){
        int c = a/b;
        if(c == 0){
            return "error";
        }
        else{
            return String.valueOf(c);
        }
    }
}
