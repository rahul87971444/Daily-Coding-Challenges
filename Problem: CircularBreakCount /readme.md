# 📘 Circular Break Count Problem

## 🧠 Problem Statement

Given:

* `N` → size of array
* `A[]` → integer array
* `T` → threshold value

The array is considered **circular**, meaning:

* after the last element, comparison continues with the first element.

Count the number of segments where:

```text
A[i] - A[i+1] > T
```

If the condition is true:

* increase segment count.

By default:

* count starts from `1`.

---

## 📌 Example

### Input

```text
A = [1, 3, 8, 2]
T = 3
```

### Circular Comparisons

```text
1 - 3 = -2   → No
3 - 8 = -5   → No
8 - 2 = 6    → Yes
2 - 1 = 1    → No
```

### Output

```text
2
```

---

# 🚀 Approach

## 💡 Idea

* Traverse the array
* Compare current element with next element
* Use modulo `%` for circular traversal
* Increase count whenever:

  ```text
  A[i] - A[next] > T
  ```


# 🧠 Dry Run

## Initial

```text
count = 1
```

---

## Iteration 1

```text
1 - 3 = -2
```

Condition:

```text
-2 > 3 → False
```

Count remains:

```text
1
```

---

## Iteration 2

```text
3 - 8 = -5
```

Condition:

```text
-5 > 3 → False
```

Count remains:

```text
1
```

---

## Iteration 3

```text
8 - 2 = 6
```

Condition:

```text
6 > 3 → True
```

Count becomes:

```text
2
```

---

## Iteration 4 (Circular Check)

```text
2 - 1 = 1
```

Condition:

```text
1 > 3 → False
```

Final Count:

```text
2
```

---

# ⏱ Time Complexity

```text
O(N)
```

Only one traversal of array is used.

---

# 🔥 Important Concept

## Circular Traversal

```java
next = (i + 1) % N
```

Used to connect:

```text
last element → first element
```

Example:

```java
(3 + 1) % 4 = 0
```

---

# 🎯 Key Concepts Learned

* Circular Arrays
* Modulo Operator `%`
* Segment Counting
* Array Traversal
* Edge Case Handling

---

