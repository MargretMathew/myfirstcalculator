package com.hcl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%d, %s, %d]", id, name, price);
	}
}

public class LambdaExpressionExample11 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Read");
			System.out.println("2.Insert");
			System.out.println("3.Display");
			System.out.println("3.Delete");
			System.out.println("4.Update");
			System.out.println("Enter your choice: ");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				List<Product> list = new ArrayList<Product>();
				list.add(new Product(1, "Samsung A5", 17000f));
				list.add(new Product(3, "Iphone 6S", 65000f));
				list.add(new Product(2, "Sony Xperia", 25000f));
				list.add(new Product(4, "Nokia Lumia", 15000f));
				list.add(new Product(5, "Redmi4 ", 26000f));
				list.add(new Product(6, "Lenevo Vibe", 19000f));
				for(Product act:list) {
					System.out.println(act.toString());
				}
				break;
			case 2:
//				System.out.print("Original contents of list: ");
//				Iterator<Product> itr = list.iterator();
//
//				while (itr.hasNext()) {
//					Object element = itr.next();
//					System.out.print(element + " ");
//				}
//				System.out.println();
//				break;
			}
		} while (ch != 0);
	}
}