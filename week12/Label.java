class Label
{
	public static void main(String []args)
	{
loop:
		for(int i=0;i<4;i++)
                {
			if(i==0){
				System.out.println(i+"\n");
			continue loop;
			}
			 if(i==1){
                                System.out.println((i-1)+"\t"+(i)+"\n");

                        continue loop;
			 }
                         if(i==2){
                                System.out.println((i-2)+"\t"+(i)+"\t"+(i*2)+"\n");
                        continue loop;
			 }
                        if(i==3){
                                System.out.println((i-3)+"\t"+(i)+"\t"+(i*2)+"\n");
                        continue loop;
			}
	      }

}}	
