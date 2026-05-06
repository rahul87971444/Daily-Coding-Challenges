class CircularBreak { 
// Function to count breaks 
  public static int countBreaks(int N, int A[], int T) { 
    int count = 1; 
    for (int i = 0; i < N; i++) { 
      int next = (i + 1) % N; 
      if (A[i] - A[next] > T) { 
        count++; 
      } 
    } 
    return count; 
  } 
  public static void main(String args[]) { 
    int A[] = {1, 3, 8, 2}; 
    int N = A.length; 
    int T = 3; 
    System.out.println(countBreaks(N, A, T)); } }
