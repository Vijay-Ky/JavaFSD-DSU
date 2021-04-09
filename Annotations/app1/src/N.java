import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//moving to the class file also
@Retention(RetentionPolicy.RUNTIME)//another meta annotation
@interface N
{
	String message();
}