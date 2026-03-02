public class Mobile {
    void iphone()
    {
        System.out.println("This is iphone");
        samsung();
        vivo();
    }
    void samsung()
    {
        System.out.println("This is Samsung");
    }
    void vivo()
    {
        System.out.println("This is Vivo");
    }
    public static void main(String[] args)
    {
        Mobile ph1 = new Mobile();
        ph1.iphone();
        ph1.samsung();
        ph1.vivo();
    }
}
