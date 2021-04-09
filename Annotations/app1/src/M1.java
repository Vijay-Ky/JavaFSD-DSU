@interface C
{	
	//method declaration and method return type is String
	String someDesc();
}

//through return type we can provide a description
@C(someDesc="some desc about C")
class M1
{
	@C(someDesc="some desc about main")
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
/* 
1. Annotations are used for providing some kind of description.
   to class, to a method, to a local variable, to a field likewise
   we can give description to several places.
2. through annotation we cannot achieve execution of logic.
   annotations are only used for providing a description.
3. first compiler will check whether this particular annotation 
   is available or not inside that the method declaration is 
   available or not then checks for that declaration what is the
   return type. this description verified by the compiler.
*/