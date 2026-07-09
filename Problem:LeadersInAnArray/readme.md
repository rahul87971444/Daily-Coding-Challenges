# Leaders in an Array

## Problem Statement

Given an integer array of size `N`, find all the **leaders** in the array.

A **leader** is an element that is **greater than or equal to all the elements to its right**.

The **rightmost element** is always considered a leader because there are no elements to its right.

Return the leaders in the same order as they appear in the array.

---

## Example 1

### Input

```text
N = 6

arr = [16, 17, 4, 3, 5, 2]
```

### Output

```text
17 5 2
```

### Explanation

- 16 → Not a leader because 17 is greater.
- 17 → Greater than all elements to its right.
- 4 → Not a leader because 5 is greater.
- 3 → Not a leader because 5 is greater.
- 5 → Greater than the element to its right.
- 2 → Rightmost element, so it is always a leader.

Leaders:

```text
17 5 2
```

---

## Example 2

### Input

```text
N = 5

arr = [7, 10, 4, 10, 6]
```

### Output

```text
10 10 6
```

### Explanation

- 7 → Not a leader because 10 is greater.
- First 10 → Greater than or equal to every element on its right.
- 4 → Not a leader because another 10 exists on the right.
- Second 10 → Greater than 6.
- 6 → Rightmost element.

Leaders:

```text
10 10 6
```

---

## Approach

Instead of checking every element with all elements on its right (which takes **O(n²)**), traverse the array **from right to left**.

1. Initialize `maxRight` as the smallest possible integer.
2. Traverse from the last element to the first.
3. If the current element is greater than or equal to `maxRight`:
   - It is a leader.
   - Add it to the answer.
   - Update `maxRight`.
4. Since leaders are collected from right to left, reverse the result before printing.

---

## Dry Run

### Input

```text
arr = [16,17,4,3,5,2]
```

### Initial

```text
maxRight = -∞
Leaders = []
```

---

### Step 1

Current element:

```text
2
```

```text
2 >= -∞
```

Leader found.

```text
Leaders = [2]
maxRight = 2
```

---

### Step 2

Current element:

```text
5
```

```text
5 >= 2
```

Leader found.

```text
Leaders = [2,5]
maxRight = 5
```

---

### Step 3

Current element:

```text
3
```

```text
3 < 5
```

Not a leader.

---

### Step 4

Current element:

```text
4
```

```text
4 < 5
```

Not a leader.

---

### Step 5

Current element:

```text
17
```

```text
17 >= 5
```

Leader found.

```text
Leaders = [2,5,17]
maxRight = 17
```

---

### Step 6

Current element:

```text
16
```

```text
16 < 17
```

Not a leader.

---

Collected leaders:

```text
[2,5,17]
```

Reverse the list:

```text
[17,5,2]
```

Final Output:

```text
17 5 2
```

---

## Java Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int maxRight = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] >= maxRight) {
                ans.add(arr[i]);
                maxRight = arr[i];
            }
        }
        Collections.reverse(ans);
        for(int x : ans)
            System.out.print(x + " ");
    }
}
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

- One traversal from right to left.
- One reverse operation.

---

### Space Complexity

```text
O(n)
```

Extra space is used to store the leaders.

---

## Key Concepts

- Arrays
- Reverse Traversal
- Maximum from Right
- Greedy Approach
- ArrayList
- Collections.reverse()
