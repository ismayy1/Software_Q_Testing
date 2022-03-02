package eu.ase.ro;

public class Utils {
	static int function(int vector[], int k) {
		
		int i=vector[0];
		int j=0;
		
		for(k=0; k<vector.length; k++) {
			if(i==vector[k]) {
				j=j+1;
			} else {
				if(i>vector[k]) {
					i=vector[k];
					j=1;
				}
			}
		}
		return i;
		
//		int total = 0;
//		int min[] = 
//		for(int i = 1; i < vector.length; i ++) { 
//			if(vector[i] < min) {
//				min = vector[i];
//				total ++;
//			}
//		}
	}
}
