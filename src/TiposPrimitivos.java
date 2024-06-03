public class TiposPrimitivos {
    
    public static void mina(String[] args) {
        byte b = 10; //tem 1 byte, maior seria 2^7
        short s = 100; //2 bytes, maior seria 2^15
        int i = 40; //4 bytes
        long l = 100; //8 bytes

        float f = 10.0f; //4 bytes
        double d = 20.0; //8 bytes

        //float g = d; nao vai compilar pois ele nao muda o tipo, para converter a mao:
        float g = (float)d;

        boolean bb = true; //or false
        char c = 'a';
        String ss = "hello world";
    }
}