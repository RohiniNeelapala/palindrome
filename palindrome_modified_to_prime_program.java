class Prime
{
       public static void main(String args[])
       {
           int num=121,count=0;

	   for(int x=1 ; x<=num; x++){
		
		if(num%x == 0){
			count++;
		}	
	    }


	    if(count==2){

                System.out.println(num +" Is Prime");
            }
	     
            else{
                 System.out.println(num + " Not prime");
	    }

        }
}