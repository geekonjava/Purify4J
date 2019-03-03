package com.github.geekonjava.sawan;

import static com.github.geekonjava.Refination.*;

import java.util.ArrayList;
import java.util.List;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Lion",23));
		animals.add(new Animal("Elephant",24));
		animals.add(new Animal("Cat",23));
		animals.add(new Animal("Tiger",25));
		animals.add(new Animal("Dog",23));
		animals.add(new Animal("Donkey",21));
		animals.add(new Animal("Human",23));
		
		//animals = from(animals).where("age", eq(23)).all();
//		animals = from(animals)
//				.where("age", eq(23))
//				.orderBy("name", Order.ASC)
//				.all();
		animals = from(animals)
				.where("name", contains("a"))
				.all();
		for(Animal a: animals)
			System.out.println(a.getName());
    }
}
