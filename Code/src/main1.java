public class main1 {
    public static void main(String[] args) {
        System.out.println("A");

        new main1();
        new main1();
    }

    public main1(){
        System.out.println("B");
    }

    {
        System.out.println("C");
    }

    static {
        System.out.println("D");
    }

}
