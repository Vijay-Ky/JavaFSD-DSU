import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;



@Retention(RetentionPolicy.RUNTIME)
@Inherited //meta annotation
@interface Q
{
	String message();
}


@Retention(RetentionPolicy.RUNTIME)
@interface R
{
	String message();
}

@Q(message = "abc")
@R(message = "xyz")
class S
{
}

class M16 extends S //only Q is inherited not R
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("M16");//loading explicitely
		Annotation[] annotations = c1.getAnnotations();
		for(Annotation annotation : annotations)
		{
			System.out.println(annotation);
		}
	}
}
