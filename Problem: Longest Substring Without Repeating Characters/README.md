# 📘 Day 3 – Longest Substring Without Repeating Characters

## 🧠 Problem Statement

Given a string `s`, find the length of the **longest substring without repeating characters**.

---

## 📌 Example

```
Input:  "abcabcbb"
Output: 3
Explanation: "abc" is the longest substring without repeating characters.
```

---

## 📂 Files in this Repository

### 1️⃣ EasyString.java (Brute Force Approach)

* Uses nested loops
* Checks all substrings
* Uses `HashSet` to detect duplicates

### 2️⃣ Optimized.java (Optimized Approach)

* Uses **sliding window technique**
* Uses two pointers (`left`, `right`)
* Efficient and interview-ready solution

---

## 🎯 Approach 1: Brute Force (EasyString.java)

### 💡 Idea

* Start from each index
* Expand substring until duplicate appears
* Track maximum length


### ⏱ Time Complexity

* O(n²)

---

## 🚀 Approach 2: Optimized (SlidingWindow.java)

### 💡 Idea

* Use sliding window with two pointers
* Expand window when characters are unique
* Shrink window when duplicate appears
* Track max length


### ⏱ Time Complexity

* O(n)

---

## 🧠 Key Concepts

* Sliding Window Technique
* Two Pointer Approach
* HashSet for duplicate tracking
* Optimization from O(n²) → O(n)

---

## 🎯 One-Line Summary

👉 Expand window if unique, shrink when duplicate appears

---

## 📌 Test Cases

```
"abcabcbb" → 3
"bbbbb"    → 1
"pwwkew"   → 3
"abcdef"   → 6
```

---

## 🚀 Next Topic

👉 Day 4 – Two Pointers (Container With Most Water)

---

