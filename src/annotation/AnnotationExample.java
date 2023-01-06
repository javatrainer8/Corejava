package annotation;

public class AnnotationExample extends A {

	// this is override annotation
	@Override
	public void methodtoDemoAnnotation() {
		System.out.println(" Check it....  i am overrider parent method ............... ");
	}

	public static void main(String[] args) {

		AnnotationExample obj = new AnnotationExample(); // object
		obj.methodtoDemoAnnotation();

	}

}