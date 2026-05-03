# Even Digits Counter (Java)

This is a simple Java program that counts how many numbers in an array contain an **even number of digits**.

## 🚀 Overview

The program:

* Takes an array of integers
* Counts the number of digits in each integer
* Checks whether the number of digits is even
* Returns the total count of such numbers

## 📌 Example

Input:

```java
int nums[] = {22, 44, 346, 4532};
```

Output:

```
3
```

Explanation:

* 22 → 2 digits ✅ (even)
* 44 → 2 digits ✅ (even)
* 346 → 3 digits ❌ (odd)
* 4532 → 4 digits ✅ (even)

So, the result is **3**.

## 🧠 How It Works

### 1. `findnums(int nums[])`

* Iterates through the array
* Calls the `even()` function for each number
* Increments count if true

### 2. `even(int num)`

* Determines if a number has an even number of digits
* Uses the `digits()` function

### 3. `digits(int num)`

* Counts digits by repeatedly dividing the number by 10
* Stops when the number becomes 0

## 🛠️ Code Structure

* `main()` → Entry point
* `findnums()` → Counts valid numbers
* `even()` → Checks digit parity
* `digits()` → Counts digits


