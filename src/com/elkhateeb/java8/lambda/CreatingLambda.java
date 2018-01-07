package com.elkhateeb.java8.lambda;

public class CreatingLambda {
	
	@FunctionalInterface
	interface Greeting{
		public String sayHello(String name);
	}
	
	public static void main(String[] args) {		
		new CreatingLambda().testGreeting("Ahmed",(name) -> "hello "+ name);
		
		Runnable runnable = () -> System.out.println("hello runnable");
		new CreatingLambda().testRunnable(runnable);
		
	}
	
	public void testGreeting(String name, Greeting greeting){
		
		String res = greeting.sayHello(name);
		System.out.println(res);
		
	}
	
	public void testRunnable(Runnable runnable){
		runnable.run();
	}

}
