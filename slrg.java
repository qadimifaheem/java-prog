//Find the second largest number in an array without any change in array
class slrg
{
	public static void main(String[] args)
	{
		int[] a={1,3,4,10,12,11};
		int lar;
		int y=0,z=0;
		lar=a[0];
		for(int i=0;i<a.length;i++)
		{	
			if(lar<a[i])
			{
				lar=a[i];
				y=i;
			}
		}
		lar=a[0];
		for(int i=0;i<a.length;i++)
		{	
			if(i==y)
			continue;
			else if(lar<a[i])
			{
				lar=a[i];
				z=i;
			}
		}
		System.out.println("The 2nd largest number is "+lar+"\nAt index "+z);
	}
}

		