import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//while defining annotation for this annotation we are providing
  //description to another annotation
  //this type of annotations are called as meta annotations
//through this Target annotation we are specifying L annotation
  //only used for method
@Target(ElementType.METHOD)
@interface L
{
	String message();
}
//@Target is one of the built-in annotation
