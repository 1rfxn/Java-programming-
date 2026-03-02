public class asas {
    int c;
    int sum(int a,int b)
    {
        c =a+b;
        return c;
    }
    public static void main(String[] args)
    {
        asas obj1 = new asas();
        int addd = obj1.sum(55,10);
        System.out.println(addd);
    }
}
