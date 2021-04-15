class A 
{
	private String name;
	private String idNum;
	private int age;

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	public String getIdnum()
	{
		return idNum;
	}

	public void setAge(int newAge)
	{
		age = newAge;
	}

	public void setName(String newName)
	{
		name =  newName;
	}

	public void setIdnum(String newId)
	{
		idNum = newId;
	}
}
class MyDriver 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("Name: " + a1.getName() + " Age: " + a1.getAge() +
			" Idnum: " + a1.getIdnum());
		a1.setName("vijay");
		a1.setAge(90);
		a1.setIdnum("100");
		System.out.println("Name: " + a1.getName() + " Age: " + a1.getAge() +
			" Idnum: " + a1.getIdnum());
	}
}
