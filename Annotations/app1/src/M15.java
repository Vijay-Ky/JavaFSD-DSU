import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;


@Retention(RetentionPolicy.CLASS)
//@Retention(RetentionPolicy.RUNTIME)
@interface O
{
	String message();
}

@Retention(RetentionPolicy.CLASS)
//@Retention(RetentionPolicy.RUNTIME)
@interface P
{
	String message();
}

//loading while M15 is loading to memory
@O(message = "abc")
@P(message = "xyz")
class M15
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("M15");//loading explicitely
		Annotation[] annotations = c1.getAnnotations();
		for(Annotation annotation : annotations)
		{
			System.out.println(annotation);
		}
	}
}
//Mainly annotations used in spring and hibernate
