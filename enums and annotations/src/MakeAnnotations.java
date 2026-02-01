import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface Ankit{
	
	int age() default 22;
	String name() default "Ankit";
	
}


@Ankit(name="Deepak",age=23)
class Player{
	String name;
	int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getDetails() {
		System.out.println("Name :"+name);
		System.out.println("age :"+age);
	}
}

@Ankit
public class MakeAnnotations {
	
	//@Ankit
	int marks;

	@Ankit
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Player obj1 = new Player();
		
		Class<? extends Player> c = obj1.getClass();
		 Annotation an = c.getAnnotation(Ankit.class);
		 
		 Ankit cp = (Ankit) an;
		 
		 
		 int age = cp.age();
		 String name = cp.name();
		 
		 System.out.println("name :"+name+" age :"+age);
		 
		

	}

}
