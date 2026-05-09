#Leetcode Problem: Largest Odd Number in String

## Problem Statement
You are given a string `num`, representing a large integer.

Return the largest-valued odd integer (as a string) that is a non-empty substring of `num`, or an empty string `""` if no odd integer exists.

A substring is a contiguous sequence of characters within a string.

---

## Example 1

### Input
```text
num = "52"
```

### Output
```text
"5"
```

### Explanation
The only non-empty substrings are:
```text
"5", "2", "52"
```

Only `"5"` is odd.

---

## Example 2

### Input
```text
num = "4206"
```

### Output
```text
""
```

### Explanation
There is no odd number in the string.

---

## Example 3

### Input
```text
num = "35427"
```

### Output
```text
"35427"
```

### Explanation
The entire number itself is odd.

---

# Approach

- Traverse the string from right to left.
- Find the first odd digit.
- Return the substring from index `0` to that digit.
- If no odd digit exists, return `""`.

---

# Key Observation

A number is odd if its last digit is:
```text
1, 3, 5, 7, 9
```

The largest odd substring will always end at the rightmost odd digit.

---


---

# Dry Run

## Input
```text
num = "52"
```

### Step 1
- Start from right
- Character = `'2'`
- Even → continue

### Step 2
- Character = `'5'`
- Odd → return substring

```java
num.substring(0,1)
```

Output:
```text
"5"
```

---

# Complexity Analysis

## Time Complexity
```text
O(n)
```

## Space Complexity
```text
O(1)
```
