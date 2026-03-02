class Solution {
    public static void main(String[] args)
		{
		String[] strs = {"flower","flow","flight"};
        String a = "";
        
        for(int i = 0 ; i < strs.length ; i++)
        { 
            int count = 1;
            for (int j = 1 ; j < strs.length ; j++)
            {
            if(strs[0].charAt(i) == strs[j].charAt(i))
            count++;
			System.out.println(count);
            }
            if(count == strs.length)
            a.concat(strs[0].substring(i,i+1));
            else
            break;
        }
		System.out.println(a);
    }
}