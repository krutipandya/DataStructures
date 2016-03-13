/**
 * 
 */
package ctci;

import java.util.Deque;

/**
 * @author G500s
 * The double-ended queue is the perfect data structure for this problem. It supports insertion/deletion from the front and back. 
 * The trick is to find a way such that the largest element in the window would always appear in the front of the queue.
 * Removing redundant elements and storing only elements that need to be considered in the queue is the key to achieve the efficient O(n) solution
 */
public class SlidingWindow {

	@SuppressWarnings("null")
	public static void maxSlidingWindow(int A[], int n, int w, int B[]) {
		  Deque<Integer> Q = null;
		  for (int i = 0; i < w; i++) {
		    while (!Q.isEmpty() && A[i] >= A[Q.getLast()])
		      Q.pollLast();
		    Q.offerLast(i);
		  }
		  for (int i = w; i < n; i++) {
		    B[i-w] = A[Q.peekFirst()];
		    while (!Q.isEmpty() && A[i] >= A[Q.getLast()])
		      Q.pollLast();
		    while (!Q.isEmpty() && Q.peekFirst() <= i-w)
		      Q.pollFirst();
		    Q.offerLast(i);
		  }
		  B[n-w] = A[Q.peekFirst()];
		}
	
	public static void main(String[] args)
	{
		
	}
	
}
