# Second Largest Digit in a String

Given an alphanumeric string `s`, return the second largest numerical digit that appears in `s`, or `-1` if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.

---

## Example 1

### Input

```text
s = "dfa12321afd"
```

### Output

```text
2
```

### Explanation

The digits that appear in `s` are:

```text
[1, 2, 3]
```

- Largest digit = `3`
- Second largest digit = `2`

Therefore, the answer is:

```text
2
```

---

## Example 2

### Input

```text
s = "abc1111"
```

### Output

```text
-1
```

### Explanation

The digits that appear in `s` are:

```text
[1]
```

There is only one distinct digit, so a second largest digit does not exist.

Therefore, the answer is:

```text
-1
```
