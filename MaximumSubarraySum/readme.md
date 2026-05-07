# 🚀 Maximum Subarray Sum — Kadane’s Algorithm

## 📌 Problem Statement
Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

---

# 📥 Example

## Input
```txt
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

## Output
```txt
6
```

## Explanation
The subarray:

```txt
[4,-1,2,1]
```

has the maximum sum:

```txt
4 + (-1) + 2 + 1 = 6
```

---

# 🧠 Approach — Kadane’s Algorithm

Kadane’s Algorithm is an optimized greedy approach used to solve maximum subarray problems in linear time.

We maintain:

- `currentSum` → Running sum of current subarray
- `maxSum` → Maximum sum found so far

---

# 🔥 Key Insight

If the running sum becomes negative, it will only reduce the total sum of future subarrays.

So:
- discard the negative running sum
- start a new subarray from the next element

---

# ⚙️ Algorithm Steps

1. Traverse the array
2. Add current element to running sum
3. Update maximum sum if needed
4. If running sum becomes negative, reset it to `0`

---

# 🔍 Dry Run

| Element | Current Sum | Maximum Sum |
|----------|-------------|--------------|
| -2 |           -2 |           -2 |
| reset |         0 |           -2 |
| 1 |             1 |            1 |
| -3 |           -2 |            1 |
| reset |         0 |            1 |
| 4 |             4 |            4 |
| -1 |            3 |            4 |
| 2 |             5 |            5 |
| 1 |             6 |            6 |

## ✅ Final Answer

```txt
6
```

---

# ⏱ Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time Complexity | O(n) |
| Space Complexity | O(1) |

---

# 🎯 Pattern Recognition

## Keywords
- Maximum sum
- Contiguous subarray
- Largest subarray sum

## Pattern Used
- Greedy
- Dynamic Running Sum

---

# 💡 Interview Insight

Kadane’s Algorithm works because a negative running sum can never help in maximizing future subarray sums.

So we immediately discard it and start fresh.

Kadane’s Algorithm - Maximum Subarray Sum
Kadane’s Algorithm is a very famous algorithm used to find:

#The maximum sum of a contiguous subarray in O(n) time.
---
