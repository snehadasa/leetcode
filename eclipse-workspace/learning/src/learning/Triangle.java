package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
	List<Integer> getLocalMaxima(List<Integer> list) {
		List<Integer> localMaxima = new ArrayList<Integer>();
		if (list == null || list.size() == 0 ) {
			return localMaxima;
		}
		if (list.size() == 1) {
			localMaxima.add(list.get(0));
			return localMaxima;
		}
		if (list.get(0) > list.get(1)) {
			localMaxima.add(list.get(0));
		}
		
		int size = list.size();
		for (int i = 1; i < size - 1; i++) {
			if (list.get(i) >= list.get(i-1) && list.get(i) >= list.get(i+1)) {
				localMaxima.add(list.get(i));
			}
		}
		if (list.get(size - 1) > list.get(size-2)) {
			localMaxima.add(list.get(size - 1));
		}
		return localMaxima;
	}
	
	List<Integer> getLocalMinima(List<Integer> list) {
		List<Integer> localMinima = new ArrayList<Integer>();
		if (list == null || list.size() == 0 ) {
			return localMinima;
		}
		if (list.size() == 1) {
			localMinima.add(list.get(0));
			return localMinima;
		}
		if (list.get(1) > list.get(0)) {
			localMinima.add(list.get(0));
		}
		
		int size = list.size();
		for (int i = 1; i < size - 1; i++) {
			if (list.get(i) <= list.get(i-1) && list.get(i) <= list.get(i+1)) {
				localMinima.add(list.get(i));
			}
		}
		if (list.get(size - 1) > list.get(size-2)) {
			localMinima.add(list.get(size - 2));
		}
		return localMinima;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(20,5,3,22,1,7,9));
		List<Integer> localMinima = new Triangle().getLocalMinima(list);
		List<Integer> localMaxima = new Triangle().getLocalMaxima(list);
		System.out.println(Arrays.toString(localMinima.toArray()));
		System.out.println(Arrays.toString(localMaxima.toArray()));

	}

}
