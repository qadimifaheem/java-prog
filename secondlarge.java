//second largest element in array with order n


class secondlarge
{
	public static void main(String[] args)
	{
		odr o =new odr();
		int[] a={90,0,1};
		System.out.println(o.fun(a));
	}
}
class odr
{
	int fun(int[] a)
	{
		int sl,l;
		sl=0;
		l=a[0];
		for(int n : a)
		{
			if(n>l)
			{
				sl=l;
				l=n;
			}
			else if(n>sl && n!= l)
			{
				sl=n;
			}
		}
		return sl;
	}
}