public class Selecao{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a==b) {
            System.out.println("a == b");
        } else if(a < b){
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }

        int dia = 3;
        String DiaSem;

        switch (dia) {
            case 1:
                diaSem = "Domingo";
                break;
            case 2:
                diaSem = "Segunda";
                break;
            case 3:
                diaSem = "Terca";
            default:
                diaSem = "Invalido";
                break;
        }
    }
}