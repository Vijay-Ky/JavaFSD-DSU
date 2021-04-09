import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)//another meta annotation
@interface M 
{
	String message();
}
/*
1. through retention annotation retention can be move to the class
2. 3 different types of retention policy SOURCE, CLASS, RUNTIME
3. If it is CLASS retention policy will move to the class file as well
*/