public class main1 {
    public static void main(String[] args) {
        double a = (61*2+88+89*2+80*3+90*3+89*3+87*3+80*3+64*2+86*3+75*3+84*2+84+65+90*2)/(2+1+2+3+3+3+3+3+2+3+3+2+1+1+2);
        System.out.println(a);
    }
}

class A02{
    static int a = 0;
    static {
        a = 1;
    }
}

class B02 extends A02{
    static {
        a = 2;
    }
}
