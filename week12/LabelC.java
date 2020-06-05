class LabelC
{
	public static void main(String[] args)
	{
         label:
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j>i)
				{
					System.out.println();
					continue label;
				}
				System.out.print(" "+(i*j));
			}
			System.out.println();
		}
	}
}

