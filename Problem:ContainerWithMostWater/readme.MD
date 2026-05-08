# Container With Most Water

A Java solution for the classic **Container With Most Water** problem using the **Two Pointer Technique**.

---

# Problem Statement

You are given an integer array `height[]`.

Each element represents the height of a vertical line.

Find two lines that together with the x-axis form a container that can store the maximum amount of water.

Return the maximum water stored.

---

# Example

## Input

```java
height = [1,8,6,2,5,4,8,3,7]
```

## Output

```java
49
```

---

# Explanation

The maximum water is formed between:

- Height `8` at index `1`
- Height `7` at index `8`

Width:

```text
8 - 1 = 7
```

Minimum height:

```text
min(8,7) = 7
```

Area Formula:

```text
Area = width × minimum height
```

Calculation:

```text
7 × 7 = 49
```

So the maximum water stored is:

```java
49
```

---

# Approach

## Two Pointer Technique

We use two pointers:

- `left` → starts from beginning
- `right` → starts from end

### Steps

1. Calculate area between `left` and `right`
2. Store maximum area
3. Move the pointer having smaller height
4. Repeat until pointers meet

---

# Why Move Smaller Height?

The water level is always limited by the shorter line.

So moving the taller line will not increase the area.

To get a better result, we move the smaller height pointer hoping to find a taller line.

---


# Dry Run

## Initial Array

```text
[1,8,6,2,5,4,8,3,7]
```

### Step 1

```text
left = 0
right = 8
```

Area:

```text
(8 - 0) × min(1,7)
= 8 × 1
= 8
```

Move left pointer.

---

### Step 2

```text
left = 1
right = 8
```

Area:

```text
(8 - 1) × min(8,7)
= 7 × 7
= 49
```

Maximum becomes `49`.

---

# Time Complexity

```text
O(n)
```

Only one traversal of array is needed.

---

# Space Complexity

```text
O(1)
```

No extra space used.

---

# Concepts Used

- Arrays
- Two Pointer Technique
- Greedy Approach
- Optimization

---
