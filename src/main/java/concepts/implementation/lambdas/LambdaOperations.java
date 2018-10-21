package concepts.implementation.lambdas;

public class LambdaOperations {

	static interface OperationsInterface{
		public int operation(String s1,String s2);
	}
	
	static interface GreetingInterface{
		public void greet(String s1);
	}

	static class MyClass{
		public static int doFind(String s1, String s2){
			return s1.lastIndexOf(s2);
		}
		
		public int joining(String s1,String s2){
			return s1.concat(s2).length();
		}
	}

	public static void main(String...args){
		/*Static Method Reference.Since the parameters of the Finder.find() and MyClass.doFind() methods match, 
		 * it is possible to create a lambda expression that implements Finder.find() and references the MyClass.doFind() 
		 * method.
		 */
		OperationsInterface operationsInterface = MyClass::doFind;
		int index = operationsInterface.operation("abcd", "cd");
		System.out.println("Index: "+index);
		
		//Inline implementation of Lambda with return parameter.
		operationsInterface = (s1,s2) -> {return s1.length() + s2.length();};
		int sum = operationsInterface.operation("abcd", "cd");
		System.out.println("Sum of Length: "+sum);
		
		//Inline implementation of Lambda without return type. If the lambda method body contains only one 
		//statement, then we do not need tp specify return type.
		operationsInterface = (s1,s2) -> s1.length() * s2.length();
		int multipliedValue = operationsInterface.operation("abcd", "cd");
		System.out.println("Multiplication of Length: "+multipliedValue);
		
		//Inline implementation of Lambda without parentheses around input parameter. If the input contains more than 1 parameter, 
		// then it is necessary to put parentheses around the input arguments.
		GreetingInterface greetingInterface = s -> System.out.println(s);
		greetingInterface.greet("Hi There!");
		
		//Lambda with a body
		greetingInterface = s -> {
			s = s.toUpperCase();
			System.out.println(s);		
		};
		greetingInterface.greet("Hi There! Using a body in Lambda.");
		
		//Method Reference for Greeting Interface
		greetingInterface = System.out::println;
		greetingInterface.greet("Hi There! Just using method reference.");
		
		//Instance Method reference
		MyClass myClass = new MyClass();
		operationsInterface = myClass::joining;
		operationsInterface.operation("abc", "xyz");
		
		//Parameter Reference of a Method -> reference a method of one of the parameters to the lambda
		operationsInterface = String::compareTo;
		System.out.println(operationsInterface.operation("999","999"));
		System.out.println(operationsInterface.operation("999","998"));
		System.out.println(operationsInterface.operation("999","9999"));
	}
}
