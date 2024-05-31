package com.example.demo;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer {

	@Value("${my.count}")
	private int count;
	@PostConstruct
	public void init(){
	}
	
	@Override
	public void print(String message)
	{	count--;
		System.out.println("HPprinter ===> " + message);
		System.out.println("count is " + count);
	}
}
