# Find the Greatest Common Divisor (GCD) of Two Numbers

## Problem Statement

Given two positive integers `a` and `b`, find their **Greatest Common Divisor (GCD)**.

The **GCD** (also called the **Highest Common Factor (HCF)**) is the largest positive integer that divides both numbers without leaving a remainder.

Solve the problem using the **Euclidean Algorithm**.

---

## Example 1

### Input

```text
a = 12
b = 18
```

### Output

```text
6
```

### Explanation

Factors of **12**:

```text
1, 2, 3, 4, 6, 12
```

Factors of **18**:

```text
1, 2, 3, 6, 9, 18
```

The greatest common factor is:

```text
6
```

---

## Example 2

### Input

```text
a = 20
b = 15
```

### Output

```text
5
```

### Explanation

The largest number that divides both 20 and 15 is:

```text
5
```

---

## Approach

Use the **Euclidean Algorithm**.

The idea is:

```text
GCD(a, b) = GCD(b, a % b)
```

Repeat this process until the remainder becomes `0`.

When the remainder becomes `0`, the current value of `a` is the GCD.

---

## Dry Run

### Input

```text
a = 12
b = 18
```

### Step 1

```text
a = 12
b = 18
```

Compute:

```text
12 % 18 = 12
```

Update:

```text
a = 18
b = 12
```

---

### Step 2

```text
18 % 12 = 6
```

Update:

```text
a = 12
b = 6
```

---

### Step 3

```text
12 % 6 = 0
```

Update:

```text
a = 6
b = 0
```

Since:

```text
b == 0
```

Stop.

Answer:

```text
6
```

---

## Another Dry Run

### Input

```text
a = 20
b = 15
```

Step 1

```text
20 % 15 = 5
```

Update:

```text
a = 15
b = 5
```

Step 2

```text
15 % 5 = 0
```

Update:

```text
a = 5
b = 0
```

Answer:

```text
5
```

---

## Java Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}
```

---

## Understanding the Important Lines

### Store Current Value

```java
int temp = b;
```

Temporarily store `b` before updating it.

---

### Find the Remainder

```java
b = a % b;
```

This computes the remainder of `a` divided by `b`.

---

### Update the First Number

```java
a = temp;
```

Move the previous value of `b` into `a`.

---

### Repeat Until

```java
while(b != 0)
```

Continue until the remainder becomes zero.

At that point:

```text
a
```

contains the GCD.

---

## Complexity Analysis

### Time Complexity

```text
O(log(min(a, b)))
```

The Euclidean Algorithm is highly efficient because the numbers decrease rapidly with each iteration.

---

### Space Complexity

```text
O(1)
```

Only a few variables are used.

---

## Key Concepts

- Euclidean Algorithm
- Greatest Common Divisor (GCD)
- Highest Common Factor (HCF)
- Modulo Operator (`%`)
- Iterative Algorithm
- Mathematics
