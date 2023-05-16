package homework2;

class MyUtility<T extends Comparable<T>> {
	
	public MyUtility() {
		
	}
    
    public int compare( T o1, T o2 ) {    	
    		return o1.compareTo( o2 ) ;
    }
    
    public void swap( T arr[], int n, int m ) {
    	T temp = arr[n] ;
    	arr[n] = arr[m] ;
    	arr[m] = temp ;
    }
    
    public void mysort( T arr[] ) {
    	for ( int i = 0 ; i < arr.length ; i++ ) {
    		for ( int j = 0 ; j < arr.length-1 ; j++ ) {
    			if ( compare( arr[j], arr[j+1] ) == 1 ) {
    				swap( arr, j, j+1 ) ;
    			}
    		}
    	}
    }
    
}