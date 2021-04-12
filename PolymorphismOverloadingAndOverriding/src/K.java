class J
{
	//void test1(int i)
	static void test1(int i)
	{
		System.out.println("from test1.J");
	}
}

class K extends J
{
	//void test1()
	static void test1()
	{
		System.out.println("from test1.K");
	}
	public static void main(String[] args) 
	{
		//J j1 = new J();
		//j1.test1(10);
		//K k1 = new K();
		//k1.test1(10);
		//k1.test1();
		//J j2 = new K();
		//j2.test1();
		//j2.test1(10);
		J j1 = new K();
		j1.test1(10);
	}
}
/*
case - 1
in case of overloading in the same class
- same method name, different signature
- we can access by using class name or object reference
- compile time poymorphism

case - 2
in case overloading in the different class
- if methods static - reference matters(that class method you should invoke)
- if methods are non static - reference matters(that class method you should invoke)

- reference and object are sub class type - super class method as well sub class method both
  you can access because of inheritance (both static and non-static method)

- methods are static reference supertype object subtype then compulasary reference type class
  method only you can invoke.

- methods are non-static reference super-type object sub-type then compulasary reference type class
  method only you can invoke.

case - 3
overriding
- withing the same class not possible
- in case of non-static methods - for which class your are creating the object that matters
- in case of static methods - for which class your are creating the referece that matters
- run - time poymorphism


*/