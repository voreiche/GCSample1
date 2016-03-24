package de.vritb.gc.garbage.generator;

import java.util.ArrayList;
import java.util.List;

public class GCSample1 {

	int numObjectsToAllocate;
	List<Double> data = new ArrayList<Double>();

	public GCSample1(String[] args) {
		numObjectsToAllocate = 150000000;
	}

	public void generateGarbage() {
//		List<Double> data = new ArrayList<Double>();

		for (int i = 0; i < numObjectsToAllocate; i++) {
			data.add(Math.random());
		}

		System.out.println(data.get(numObjectsToAllocate >> 1));
		
	
	}
}
