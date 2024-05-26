class palindrome
{
       public static void main(String args[])
       {
           int num=121,temp=num,reverse=0;
           while(num>0)
           {
              int rem=num%10;
              reverse=reverse*10+rem;
              num=num/10;
           }
           if(reverse==temp)
           {
               System.out.println("palindrome");
           }
           else
           {
                System.out.println("not a palindrome");
           }
       }
}