# Majority Element (Boyer-Moore Voting Algorithm)

## Problem Statement

Given an integer array `nums`, return the **majority element**.

The **majority element** is the element that appears **more than ⌊n / 2⌋ times**.

You may assume that the majority element always exists in the array.

---

## Example 1

### Input

```text
nums = [2,2,1,1,1,2,2]
```

### Output

```text
2
```

### Explanation

Occurrences:

```text
2 → 4 times
1 → 3 times
```

Array size:

```text
7
```

Majority condition:

```text
More than floor(7 / 2)

More than 3
```

Since `2` appears **4 times**, it is the majority element.

---

## Optimized Java Solution

```java
public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0)
                candidate = num;

            count += (num == candidate) ? 1 : -1;
        }

        System.out.println(candidate);
    }
}
```

---

# Main Idea

This algorithm is called the **Boyer-Moore Voting Algorithm**.

Imagine every occurrence of the majority element gets paired with a different element.

Each pair cancels each other.

Since the majority element appears **more than half** of the time, it can never be completely canceled.

Eventually, it is the only element left.

---

# Why Does Pairwise Cancellation Work?

Suppose the array is:

```text
2 2 1 1 1 2 2
```

Pair different elements:

```text
2 × 1
2 × 1
2 × 1
```

These pairs cancel each other.

Remaining:

```text
2
```

Since the majority element occurs more than half the time, it always survives after all possible cancellations.

---

# Dry Run (Step-by-Step)

### Input

```text
nums = [2,2,1,1,1,2,2]
```

Initially

```text
candidate = 0
count = 0
```

---

## Step 1

Current number:

```text
2
```

Count is zero.

Choose a new candidate.

```text
candidate = 2
```

Increase count.

```text
count = 1
```

---

## Step 2

Current number:

```text
2
```

Same as candidate.

Increase count.

```text
count = 2
```

---

## Step 3

Current number:

```text
1
```

Different from candidate.

Decrease count.

```text
count = 1
```

---

## Step 4

Current number:

```text
1
```

Different again.

Decrease count.

```text
count = 0
```

The previous candidate has been completely canceled.

---

## Step 5

Current number:

```text
1
```

Since

```text
count == 0
```

Choose a new candidate.

```text
candidate = 1
```

Increase count.

```text
count = 1
```

---

## Step 6

Current number:

```text
2
```

Different from candidate.

Decrease count.

```text
count = 0
```

Again, all votes are canceled.

---

## Step 7

Current number:

```text
2
```

Count is zero.

Choose a new candidate.

```text
candidate = 2
```

Increase count.

```text
count = 1
```

Traversal ends.

Final candidate:

```text
2
```

Answer:

```text
2
```

---

# Complete Execution Table

| Current Number | Candidate | Count | Explanation |
|---------------|-----------|-------|-------------|
| 2 | 2 | 1 | New candidate selected |
| 2 | 2 | 2 | Same as candidate, increment |
| 1 | 2 | 1 | Different, decrement |
| 1 | 2 | 0 | Candidate canceled |
| 1 | 1 | 1 | New candidate selected |
| 2 | 1 | 0 | Candidate canceled |
| 2 | 2 | 1 | New candidate selected |

Final Answer:

```text
2
```

---

# Understanding the Important Lines

## Selecting a New Candidate

```java
if (count == 0)
    candidate = num;
```

### Think like this:

> "The previous candidate has lost all its votes. Let the current element become the new leader."

---

## Updating the Vote Count

```java
count += (num == candidate) ? 1 : -1;
```

If the current number matches the candidate:

```text
Vote For Candidate
count++
```

Otherwise:

```text
Vote Against Candidate
count--
```

---

# Visualization

```
Array

2 2 1 1 1 2 2

Votes

2 : +1
2 : +1
1 : -1
1 : -1
1 : +1
2 : -1
2 : +1

Final Candidate

2
```

---

# Why Is There No Second Pass?

The problem guarantees:

> **A majority element always exists.**

Because of this guarantee, the final candidate is always the correct answer.

If the problem did **not** guarantee a majority element, we would need a second pass to verify that the candidate appears more than `n / 2` times.

---

# Complexity Analysis

### Time Complexity

```text
O(n)
```

Only one traversal of the array.

---

### Space Complexity

```text
O(1)
```

Only two variables are used.

---

# Key Concepts

- Boyer-Moore Voting Algorithm
- Majority Element
- Greedy Algorithm
- Pairwise Cancellation
- Constant Space
- Linear Time

---

# Interview Tip

If the interviewer asks:

> **Why does this algorithm always work?**

Answer:

> Every occurrence of a non-majority element can cancel out one occurrence
> of the majority element. Since the majority element appears more than half of the time,
> it always has unmatched occurrences left and becomes the final candidate.

---

# One-Line Interview Explanation

> **"The Boyer-Moore Voting Algorithm repeatedly cancels different elements. Since the majority element appears more than half the time, it survives all pairwise cancellations and remains as the final candidate."**
