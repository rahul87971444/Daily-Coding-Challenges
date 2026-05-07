📘 Maximum Subarray Sum — Kadane’s Algorithm
🔹 Problem Statement

Given an integer array nums, find the contiguous subarray with the largest sum and return its sum.

📥 Example
Input
nums = [-2,1,-3,4,-1,2,1,-5,4]
Output
6
Explanation

The subarray:

[4,-1,2,1]

has the largest sum:

4 + (-1) + 2 + 1 = 6
🧠 Approach — Kadane’s Algorithm

We maintain:

currSum → current running sum
maxSum → maximum sum found so far
Key Observation

If the running sum becomes negative:

currSum < 0

then it will only reduce future sums.

So we reset:

currSum = 0
🔥 Algorithm Steps
1.Traverse the array
2.Add current element to running sum
3.Update maximum sum
4.If running sum becomes negative → reset it

Dry Run
Element	Current Sum	Max Sum
-2	-2	-2
reset	0	-2
1	1	1
-3	-2	1
reset	0	1
4	4	4
-1	3	4
2	5	5
1	6	6

Final Answer:

6
⏱ Complexity Analysis
Complexity	Value
Time	O(n)
Space	O(1)
🎯 Key Interview Insight

Kadane’s Algorithm works because:

A negative running sum can never help
in maximizing future subarray sums.

So we discard it immediately.

🔥 Pattern Recognition
Keywords
Maximum sum
Contiguous subarray
Largest subarray sum
Pattern

✅ Greedy
✅ Dynamic Running Sum
