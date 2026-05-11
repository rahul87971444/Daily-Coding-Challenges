# Rotate Array

## Problem Statement

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

---

# Example 1

## Input
```text
nums = [1,2,3,4,5,6,7], k = 3
```

## Output
```text
[5,6,7,1,2,3,4]
```

## Explanation

Rotate 1 step:
```text
[7,1,2,3,4,5,6]
```

Rotate 2 steps:
```text
[6,7,1,2,3,4,5]
```

Rotate 3 steps:
```text
[5,6,7,1,2,3,4]
```

---

# Example 2

## Input
```text
nums = [-1,-100,3,99], k = 2
```

## Output
```text
[3,99,-1,-100]
```

## Explanation

Rotate 1 step:
```text
[99,-1,-100,3]
```

Rotate 2 steps:
```text
[3,99,-1,-100]
```

---

# Constraints

```text
1 <= nums.length <= 10^5
-2^31 <= nums[i] <= 2^31 - 1
0 <= k <= 10^5
```

---

# Approach (Reversal Algorithm)

The optimized approach uses array reversal.

## Steps

1. Reverse the entire array
2. Reverse first `k` elements
3. Reverse remaining elements

---

# Key Observation

To rotate right by `k`:

```text
[1,2,3,4,5,6,7]
```

Desired output:

```text
[5,6,7,1,2,3,4]
```

Reversal helps rearrange elements in-place without extra space.

---

# Why `k = k % n`

```java
k = k % n;
```

This handles cases where `k` is greater than array length.

Example:

```text
n = 7
k = 10
```

```text
10 % 7 = 3
```

So rotating 10 times is same as rotating 3 times.

---

# Java Solution

```java
class RotateArray {

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {

        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        rotate(arr, 3);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

# Dry Run

## Original Array

```text
1 2 3 4 5 6 7
```

## Step 1: Reverse Entire Array

```text
7 6 5 4 3 2 1
```

## Step 2: Reverse First k Elements

```text
5 6 7 4 3 2 1
```

## Step 3: Reverse Remaining Elements

```text
5 6 7 1 2 3 4
```

Final Answer:

```text
[5,6,7,1,2,3,4]
```

---

# Time Complexity

```text
O(n)
```

---

# Space Complexity

```text
O(1)
```

---

# Easy Memory Trick

```text
Reverse All
Reverse First k
Reverse Remaining
```
