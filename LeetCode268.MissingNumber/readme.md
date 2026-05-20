# Missing Number

## Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

---

# Example 1

## Input
```text
nums = [3,0,1]
```

## Output
```text
2
```

## Explanation

- `n = 3`
- Numbers should be in range `[0,3]`

Expected numbers:
```text
0 1 2 3
```

Array contains:
```text
3 0 1
```

Missing number:
```text
2
```

---

# Example 2

## Input
```text
nums = [0,1]
```

## Output
```text
2
```

---

# Example 3

## Input
```text
nums = [9,6,4,2,3,5,7,0,1]
```

## Output
```text
8
```

---

# Optimized Approach (XOR)

We use XOR because:

```text
a ^ a = 0
a ^ 0 = a
```

All duplicate numbers cancel each other.

Only the missing number remains.

---

# Key Observation

Expected numbers are:

```text
0 to n
```

We XOR:
- all indices
- all array values

Matching numbers cancel out.

Missing number survives.

---

# Java Solution

```java
class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for(int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }
        return xor;
    }
}
```

---

# Dry Run

## Input

```text
nums = [3,0,1]
```

## Step 1

```text
n = 3
xor = 3
```

---

## Iteration 1

```text
i = 0
nums[i] = 3
```

```text
xor = 3 ^ 0 ^ 3
```

Result:

```text
xor = 0
```

---

## Iteration 2

```text
i = 1
nums[i] = 0
```

```text
xor = 0 ^ 1 ^ 0
```

Result:

```text
xor = 1
```

---

## Iteration 3

```text
i = 2
nums[i] = 1
```

```text
xor = 1 ^ 2 ^ 1
```

Result:

```text
xor = 2
```

---

# Final Answer

```text
2
```

---

# Why `int xor = nums.length`

Indices go from:

```text
0 to n-1
```

But numbers should be:

```text
0 to n
```

So initially we include:

```java
nums.length
```

to include the last number `n`.

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

# Concepts Used

- XOR Operator
- Bit Manipulation
- Array Traversal
- Missing Number Pattern

---

# XOR Rules

| Operation | Result |
|---|---|
| a ^ a | 0 |
| a ^ 0 | a |

---


```text
Same numbers cancel in XOR.
Missing number survives.
```
