//Tyson Hichman, Heap, 9/10, CSCI 333
//main class just to create my heaps and test the algorithm
//creates an accurate heap from a given array of values

public class main {

	public static void main(String[] args) {
		
		int[] a = {4,1,3,2,8,9,7};
		
		MaxHeap heap = new MaxHeap(a);
		heap.heapsort();
		heap.printmaxheap();
		
		
		
		int[] b = {50,90,150,2,5,6666,3214,9965};
		MaxHeap heap2 = new MaxHeap(b);
		heap2.heapsort();
		heap2.printmaxheap();
		
		int[] c = {1,2,3,4,5,6,7,8,9,10,11,12};
		MaxHeap heap3 = new MaxHeap(c);
		heap3.heapsort();
		heap3.printmaxheap();
		
		int[] d = {5,6,9,90,9000000,51,23,44};
		MaxHeap heap4 = new MaxHeap(d);
		heap4.heapsort();
		heap4.printmaxheap();
		
		
		int[] f = {10,9,8,7,6,20,5,4,3,2,1};
		MaxHeap heap5 = new MaxHeap(f);
		heap5.heapsort();
		heap5.printmaxheap();
	}

}
