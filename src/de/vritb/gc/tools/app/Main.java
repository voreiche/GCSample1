package de.vritb.gc.tools.app;

import de.vritb.gc.garbage.generator.GCSample1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("started....");
		// TODO Auto-generated method stub
		GCSample1  sample1= new GCSample1(args);
		
		sample1.generateGarbage();
		
		System.out.println("finished");

	}

}
