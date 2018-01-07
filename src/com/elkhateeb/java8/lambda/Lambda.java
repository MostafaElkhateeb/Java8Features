package com.elkhateeb.java8.lambda;

public class Lambda {

	public static void main(String[] args) {
		//using anonymous classes
		printOut(new Runnable(){
			@Override
			public void run(){
				System.out.println("anonymous class");
			}
		});
		
		//using lambda 
		printOut( () -> System.out.println("anonymous class"));

	}
	
	private static void printOut(Runnable runnable){
		new Thread(runnable).start();
	}

}
