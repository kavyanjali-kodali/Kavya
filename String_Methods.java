class String_Methods
{
	public static void main(String[] args)
	{
		//concat() method is used to concatenate two strings
        String s1="Hello ";
		String s2="World!";
		String s=s1.concat(s2);
		System.out.println("Your string is : "+s);
		//charAt() method is used to get the character at that index
		System.out.println("The character at index 0 is : "+s.charAt(0));
		//contains() method is used to know whether a sequence of characters is present 
		System.out.println(s.contains("Hello"));
		//length() is used to get the length of the string
		System.out.println("Length of the string : "+s.length());
		//replace(old char,new char) is used to replace  a character 
		System.out.println("NEW STRING : "+s.replace('l', 'p'));
		//substring() is used to get a sub string from a string of a given index range
		System.out.println("SUBSTRING : "+s.substring(0,5));

	}
}