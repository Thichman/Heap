// heap class that creates heaps and swaps the items in the heap in order to 
//create a valid heap 
public class MaxHeap {

	private int array[];
	private int heapsize;
	
	public MaxHeap(int arrayq[]) {
		this.array = arrayq;
		this.heapsize = arrayq.length;
		buildMaxHeap();
	}
	
	
	private int leftChildOF(int index) {
		
		
		return (index+1)*2 -1;
	}
	private int rightChildOF(int index) {
		
		
		return (1+index)*2;
	}
	//swaps my values in the heap
	private void maxHeapify(int index) {
		int largest;
		int left = leftChildOF(index);
		int right = rightChildOF(index);
		
		if(left < heapsize && array[left] > array[index]) {
			largest = left;
		} else {
			largest = index;
		}
		
		if(right < heapsize && array[right] > array[largest]) {
			largest = right;
		}
		
		if(largest != index) {
			int temp = array[index];
			array[index] = array[largest];
			array[largest] = temp;
			
			maxHeapify(largest);
		}
		
	}
	//Swaps creates the heap for the correct sizing algorithm 
	private void buildMaxHeap() {
		for(int i = (heapsize/2)-1; i >= 0; i-- ) {
			maxHeapify(i);
		}
	}
	//sorts the heap to fix any values that are out of place
	public void heapsort() {
		int backup = heapsize-1;
		buildMaxHeap();
		for(int i = heapsize-1; i >= 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			heapsize--;
			maxHeapify(array[0]);
		}
		heapsize = backup;
	}
	
	//prints the heap values
	public void printmaxheap(){
		for(int i = 0; i < heapsize; i++ ) {
			System.out.print(array[i]+ ", ");
		}
		System.out.println();
	}
}
