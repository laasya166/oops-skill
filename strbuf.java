package skill2;
public class strbuf {
	public static void main(String[] arg)
	{
		StringBuffer s1=new StringBuffer("Hello");
		StringBuffer s2=new StringBuffer("World");
		s1.append(s2);
		System.out.println("Using srting append "+s1);
		int a=s1.capacity();
		System.out.println("The capacity of string s1 is "+a);
		s1.replace(1,5,"java");
		System.out.println("After using replace function "+s1);
		s1.insert(1,"laasya");
		System.out.println("After using insert function the string is "+s1);
		s1.delete(1,7);
		System.out.println("After deleting the string is "+s1);
		s1.reverse();
		System.out.println("After reversing the string is "+s1);
	}
}
