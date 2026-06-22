# 283. Move Zeroes

## Problem Statement

Given an integer array `nums`, move all `0`s to the end of it while maintaining the relative order of the non-zero elements.

You must do this **in-place** without making a copy of the array.

---

## Example 1

### Input

```text
nums = [0,1,0,3,12]
```
### Output

```text
[1,3,12,0,0]
```

---

## Example 2

### Input

```text
nums = [0]
```

### Output

```text
[0]
```

---

## Approach: Two Pointers + Swap

We use a pointer `index` to track the position where the next non-zero element should be placed.

### Steps

1. Initialize `index = 0`.
2. Traverse the array.
3. Whenever a non-zero element is found:
   - Swap it with the element at `index`.
   - Increment `index`.
4. By the end of traversal, all non-zero elements are moved to the front while preserving their order.
5. All zeros automatically move to the end.

---

## Dry Run

### Input

```text
[0,1,0,3,12]
```

### Initial State

```text
index = 0
```

### Iteration 1

```text
nums[0] = 0
```

Skip.

```text
[0,1,0,3,12]
```

### Iteration 2

```text
nums[1] = 1
```

Swap with `nums[index]`.

```text
[1,0,0,3,12]
index = 1
```

### Iteration 3

```text
nums[2] = 0
```

Skip.

### Iteration 4

```text
nums[3] = 3
```

Swap with `nums[index]`.

```text
[1,3,0,0,12]
index = 2
```

### Iteration 5

```text
nums[4] = 12
```

Swap with `nums[index]`.

```text
[1,3,12,0,0]
index = 3
```

### Final Output

```text
[1,3,12,0,0]
```
## Complexity Analysis

### Time Complexity

```text
O(n)
```

Single traversal of the array.

### Space Complexity

```text
O(1)
```
## Key Concepts

- Two Pointers
- Array Manipulation
- In-Place Swapping
- Maintaining Relative Order



