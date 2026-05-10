# Leetcode 7 : Reverse Integer

## Problem Statement

Given a signed 32-bit integer `x`, return `x` with its digits reversed.

If reversing `x` causes the value to go outside the signed 32-bit integer range:

```text
[-2^31, 2^31 - 1]
```

then return `0`.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

---

# Example 1

## Input
```text
x = 123
```

## Output
```text
321
```

---

# Example 2

## Input
```text
x = -123
```

## Output
```text
-321
```

---

# Example 3

## Input
```text
x = 120
```

## Output
```text
21
```

---

# Approach

- Extract the last digit using `% 10`
- Add the digit to the reversed number
- Remove the last digit using `/ 10`
- Before multiplying by `10`, check for integer overflow

---

# Key Observation

To reverse a number:

```text
newNumber = oldNumber * 10 + lastDigit
```

Example:

```text
32 * 10 + 1 = 321
```

---

# Overflow Check

Java `int` range:

```text
-2147483648 to 2147483647
```

Before multiplying by `10`, check:

```java
if(n > Integer.MAX_VALUE/10 || n < Integer.MIN_VALUE/10)
```

This prevents overflow.



---

# Dry Run

## Input
```text
x = 123
```

### Iteration 1
```text
temp = 3
n = 0 * 10 + 3 = 3
x = 12
```

### Iteration 2
```text
temp = 2
n = 3 * 10 + 2 = 32
x = 1
```

### Iteration 3
```text
temp = 1
n = 32 * 10 + 1 = 321
x = 0
```

## Output
```text
321
```

---

# Time Complexity

```text
O(log10 n)
```

---

# Space Complexity

```text
O(1)
```

---

# Concepts Used

- Modulo Operator `%`
- Integer Division `/`
- Overflow Handling
- Math / Number Manipulation

### Overflow Check Explanation

Before doing:

```java
n = n * 10 + temp;
```

we check:

```java
if(n > Integer.MAX_VALUE / 10 || n < Integer.MIN_VALUE / 10)
```

because multiplying by `10` can cause integer overflow.

`/10` is used since the next operation is `*10`.

If `n` is already greater than `MAX_VALUE / 10`, then `n * 10` will exceed the integer range.

---

### Easy Memory Trick

```text
Before multiplying by 10,
check whether number is safe for *10 or not.
```
