public class ComparacaoString {
    
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String(original, "Hello");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}