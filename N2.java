class N2 
{
	static boolean a= true;
	static char ch='T';
	
	public static void main(String[] args) 
	{
        char ch='A';
		System.out.println(ch);
		int a =18;
		System.out.println(a);
		System.out.println(N2.a);
		N2.a=false;
		
		System.out.println(N2.a);
		ch='S';
        System.out.println(N2.ch);
		System.out.println(ch);
	}
}