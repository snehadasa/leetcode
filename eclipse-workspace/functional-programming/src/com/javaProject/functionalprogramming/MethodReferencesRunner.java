package com.javaProject.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferencesRunner {
	
	public static void print(Integer num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
		.map(s -> s.length())
		.forEach(i -> MethodReferencesRunner.print(i));
		
		System.out.println('\n');
		
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
		.map(s -> s.length())
		.forEach(i -> System.out.println(i));
		
		System.out.println('\n');

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
		.map(s -> s.length()).forEach(MethodReferencesRunner::print);
		
		System.out.println('\n');
		
		Predicate<? super Integer> evenPredicate = evenPredicate();
		Predicate<? super Integer> oddPredicate = n -> n%2 == 1;

		
		List.of(23,56,43,75,12).stream()
		.filter(evenPredicate)
		.max((n1, n2) -> Integer.compare(n1, n2))
		.orElse(0);
		
		System.out.println('\n');
		
		Integer max = List.of(23,57,43,75,12).stream()
				.filter(MethodReferencesRunner::isEven)
				.max(Integer::compare)
				.orElse(0);
		System.out.println(max);
	}

	private static Predicate<? super Integer> evenPredicate() {
		return n -> n%2 == 0;
	}
	
	public static boolean isEven(Integer num) {
		return num % 2 == 0;
	}

}