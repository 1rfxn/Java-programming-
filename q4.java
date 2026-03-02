import java.util.Random;

class q4 {
    public static void main(String args[])
    {
Random rand = new Random();
   int count = 0;
        int num = 0;
        while(num!=5)
        {
          num = rand.nextInt(11);
          System.out.println(num);
        count++;
        }
        System.out.println("Total loop count"+count);
    }
}
