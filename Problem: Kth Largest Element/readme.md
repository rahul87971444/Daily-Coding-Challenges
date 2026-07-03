# Kth Largest Element using Min Heap (Priority Queue)

## Problem Statement

Given an integer array `nums` and an integer `k`, return the **kth largest element** in the array.

**Note:**
- It is the kth largest element in the sorted order, **not** the kth distinct element.
- Solve it efficiently without sorting the entire array.

---

## Example 1

### Input

```text
nums = [3,2,1,5,6,4]
k = 2
```

### Output

```text
5
```

### Explanation

Sorted array in descending order:

```text
[6,5,4,3,2,1]
```

- 1st largest = 6
- 2nd largest = 5 ✅

Hence, the answer is:

```text
5
```

---

## Optimized Java Solution

```java
import java.util.PriorityQueue;

public class KthLargest {

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {

            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println(pq.peek());
    }
}
```

---

# Main Idea

Instead of sorting the entire array, we only keep track of the **k largest elements** seen so far.

To do this, we use a **Min Heap** of size `k`.

The heap always stores only the largest `k` elements.

The smallest among these `k` elements is the answer.

---

# Why Min Heap?

Suppose:

```text
k = 2
```

We only care about the **2 largest numbers**.

Whenever the heap grows beyond size `2`, we remove the **smallest** element.

Eventually only the two largest numbers remain.

The root of the min heap is the **2nd largest element**.

---

# Dry Run (Step-by-Step)

### Input

```text
nums = [3,2,1,5,6,4]
k = 2
```

Initially

```text
Heap = []
```

---

## Step 1

Current number:

```text
3
```

Add to heap.

```text
Heap = [3]
```

Heap size:

```text
1
```

No removal.

---

## Step 2

Current number:

```text
2
```

Add.

```text
Heap = [2,3]
```

(Min heap automatically keeps the smallest at the top.)

Heap size:

```text
2
```

Still fine.

---

## Step 3

Current number:

```text
1
```

Add.

```text
Heap = [1,3,2]
```

Now:

```text
Heap size = 3
```

But

```text
k = 2
```

So remove the smallest.

```text
poll()
```

Removed:

```text
1
```

Heap becomes

```text
[2,3]
```

Notice:

We don't care about `1` anymore because it can never be the 2nd largest element.

---

## Step 4

Current number

```text
5
```

Add.

```text
Heap = [2,3,5]
```

Size:

```text
3
```

Remove smallest.

Removed:

```text
2
```

Heap becomes

```text
[3,5]
```

Again,

Only the largest two numbers are kept.

---

## Step 5

Current number

```text
6
```

Add.

```text
Heap = [3,5,6]
```

Size:

```text
3
```

Remove smallest.

Removed:

```text
3
```

Heap becomes

```text
[5,6]
```

Now the heap contains the two largest numbers seen so far.

---

## Step 6

Current number

```text
4
```

Add.

```text
Heap = [4,6,5]
```

Size:

```text
3
```

Remove smallest.

Removed:

```text
4
```

Heap becomes

```text
[5,6]
```

Again,

Only the largest two elements remain.

---

# Final Heap

```text
[5,6]
```

The root of the Min Heap is

```text
5
```

Therefore,

```text
Answer = 5
```

---

# Why Does This Work?

Imagine you only have space to remember the **2 biggest numbers**.

Whenever a new number comes:

- Keep it.
- If you now have more than 2 numbers,
- Throw away the smallest one.

Eventually, only the biggest two numbers survive.

The smaller among those two is exactly the **2nd largest element**.

This logic works for any value of `k`.

---

# Understanding the Important Lines

## Creating the Min Heap

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

Java's `PriorityQueue` is a **Min Heap** by default.

The smallest element is always at the top.

---

## Adding an Element

```java
pq.offer(num);
```

Every array element is inserted into the heap.

---

## Maintaining Heap Size

```java
if (pq.size() > k) {
    pq.poll();
}
```

This is the heart of the algorithm.

### Think like this:

> "If I have stored more than `k` numbers, remove the smallest one because I only want the `k` largest numbers."

---

## Getting the Answer

```java
pq.peek();
```

The root of the Min Heap is the smallest among the largest `k` elements.

That is exactly the **kth largest element**.

---

# Visualization

```
Array

3 2 1 5 6 4
│ │ │ │ │ │
▼ ▼ ▼ ▼ ▼ ▼

Min Heap

Keep only k elements

After processing

5
 \
  6

Answer = 5
```

---

# Complexity Analysis

### Time Complexity

Each insertion or removal from the heap takes:

```text
O(log k)
```

For `n` elements:

```text
O(n log k)
```

---

### Space Complexity

The heap stores at most `k` elements.

```text
O(k)
```

---

# Key Concepts

- Heap
- Priority Queue
- Min Heap
- Top K Elements
- Kth Largest Element
- Heap Optimization

---

# Interview Tip

If the interviewer asks:

> **Why use a Min Heap instead of a Max Heap?**

Answer:

> A Max Heap would require removing the largest
> element repeatedly, which is inefficient for finding the kth largest.
> A Min Heap of size `k` keeps only the `k` largest elements throughout the traversal. The smallest among them is the kth largest element.

---

# One-Line Interview Explanation

> **"Maintain a Min Heap of size `k`; whenever the heap exceeds `k`, remove the smallest element. After processing all elements, the heap's top is the kth largest element."**
