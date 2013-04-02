package com.yf.multithreads;

abstract class Diagram {
	protected char c;

	public Diagram(char c) {
		this.c = c;
	}

	abstract protected void print(int size);

	abstract protected void printContent(String msg);

	public final void display(String msg) {
		int len = msg.getBytes().length;
		print(len);
		printContent(msg);
		print(len);
	}
}

class StarDiagram extends Diagram {
	public StarDiagram(char c) {
		super(c);
	}

	protected void print(int size) {
		for (int i = 0; i < size + 2; i++) {
			System.out.print(c);
		}
		System.out.println();
	}

	protected void printContent(String msg) {
		System.out.print("*");
		System.out.print(msg);
		System.out.print("*");
		System.out.println();
	}
}
public class TemplateTest{
	public static void main(String[] args){
		Diagram d1=new StarDiagram('*');
		d1.display("Hello World!");
	}
}