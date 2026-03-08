import java.util.Arrays;

class evenreverse
{
    public static void main(String... args)
    {
        int[] a = {25,10,35,45,20,55,30,65,75};
        int i = 0,j = a.length - 1;
        while(i < j)
        {
            if(a[i] % 2 == 0)
            {
                if(a[j] % 2 == 0)
                {
                    a[i] = a[i] ^ a[j];
                    a[j] = a[i] ^ a[j];
                    a[i] = a[i] ^ a[j];
                    i++;
                    j--;
                }
                else
                    j--;
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(a));
}
}