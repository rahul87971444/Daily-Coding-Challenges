# Find the Least Common Multiple (LCM) of Two Numbers

## Problem Statement

Given two positive integers `a` and `b`, find their **Least Common Multiple (LCM)**.

The **LCM** is the smallest positive integer that is divisible by both numbers.

Use the relationship between **GCD** and **LCM** to solve the problem efficiently.

---

## Example 1

### Input

```text
a = 12
b = 18
```

### Output

```text
36
```

### Explanation

Multiples of **12**:

```text
12, 24, 36, 48, ...
```

Multiples of **18**:

```text
18, 36, 54, ...
```

The smallest common multiple is:

```text
36
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
60
```

### Explanation

Multiples of **20**:

```text
20, 40, 60, 80, ...
```

Multiples of **15**:

```text
15, 30, 45, 60, ...
```

The first common multiple is:

```text
60
```

---

## Approach

Instead of checking multiples one by one, first find the **Greatest Common Divisor (GCD)** using the **Euclidean Algorithm**.

Then use the formula:

```text
LCM = (a × b) / GCD
```

This approach is much faster and works efficiently even for large numbers.

---

## Dry Run

### Input

```text
a = 12
b = 18
```

Initially:

```text
x = 12
y = 18
```

---

### Step 1

```text
12 % 18 = 12
```

Update:

```text
x = 18
y = 12
```

---

### Step 2

```text
18 % 12 = 6
```

Update:

```text
x = 12
y = 6
```

---

### Step 3

```text
12 % 6 = 0
```

Update:

```text
x = 6
y = 0
```

GCD:

```text
6
```

Now calculate:

```text
LCM = (12 × 18) / 6
     = 216 / 6
     = 36
```

Final Answer:

```text
36
```

---

## Another Dry Run

### Input

```text
a = 20
b = 15
```

Find GCD:

```text
20 % 15 = 5
15 % 5 = 0
```

GCD:

```text
5
```

LCM:

```text
(20 × 15) / 5

= 300 / 5

= 60
```

Answer:

```text
60
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
        int x = a, y = b;
        while(y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        int lcm = (a * b) / x;
        System.out.println(lcm);
    }
}
```

---

## Understanding the Important Lines

### Copy the Original Numbers

```java
int x = a, y = b;
```

The original values of `a` and `b` are preserved because they are needed later to calculate the LCM.

---

### Find the GCD

```java
while(y != 0)
```

Use the Euclidean Algorithm until the remainder becomes zero.

---

### Update the Values

```java
int t = y;
y = x % y;
x = t;
```

These three lines repeatedly calculate the GCD.

When the loop ends:

```text
x = GCD
```

---

### Calculate the LCM

```java
int lcm = (a * b) / x;
```

Since `x` stores the GCD, apply the formula:

```text
LCM = (a × b) / GCD
```

---

## Complexity Analysis

### Time Complexity

```text
O(log(min(a, b)))
```

Finding the GCD using the Euclidean Algorithm is very efficient.

---

### Space Complexity

```text
O(1)
```

Only a few extra variables are used.

---

## Key Concepts

- Least Common Multiple (LCM)
- Greatest Common Divisor (GCD)
- Euclidean Algorithm
- Modulo Operator (`%`)
- Mathematical Formula
- Iterative Algorithm
