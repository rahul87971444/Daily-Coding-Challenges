# 📈 Best Time to Buy and Sell Stock

---

## 🧩 Problem Statement

You are given an array `prices[]` where `prices[i]` represents the price of a stock on day `i`.

You need to maximize profit by:
- Buying on one day  
- Selling on a later day  

Return the **maximum profit**.

---

## 💡 Example

Input:
prices = [7, 1, 5, 3, 6, 4]

Output:
5

---

## 📝 Explanation

Buy at price = 1 (day 1)  
Sell at price = 6 (day 4)  

Profit = 6 - 1 = 5  

---

## 🚫 Constraints

- Buy before you sell  
- Only one transaction allowed  
- If no profit is possible, return `0`  

---

## 🧠 Approach

- Track the minimum price so far  
- Calculate profit at each step  
- Update maximum profit when higher value is found  

---

## ⏱️ Complexity
 
- Time: O(n)
- Space: O(1)

