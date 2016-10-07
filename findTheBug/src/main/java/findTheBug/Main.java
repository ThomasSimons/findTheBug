package findTheBug;

public class Main {

	public static void main(String[] args) {
		
		final int [] INDEX_ARRAY = {0,1,2,3,4};
		int [] values = {0,1,2,3,4};
		
		for(int i = 0; i < INDEX_ARRAY.length; i++){
			values[INDEX_ARRAY[i]] = i;
		}

	}

}
