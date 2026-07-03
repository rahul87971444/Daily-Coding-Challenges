# 🚀Top 15 Coding Questions (Java)

The questions are arranged in priority order so you can revise them quickly before an exam.

---

# ⭐ 1. Two Sum (HashMap)

### Why Learn?

* ✅ HashMap
* ✅ Complement Logic
* ✅ O(n) Solution
* ✅ Most Asked Pattern

## Java Code

```java
import java.util.*;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(map.containsKey(complement))
                return new int[]{map.get(complement), i};

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
```

### 🔥 Memory Line

```java
int complement = target - nums[i];
```

Think:

> **Need = Target − Current**

---

# ⭐ 2. Move Zeroes

### Why Learn?

* ✅ Two Pointer Pattern

## Java Code

```java
class Solution {

    public void moveZeroes(int[] nums) {

        int index = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != 0)
                nums[index++] = nums[i];
        }

        while(index < nums.length)
            nums[index++] = 0;
    }
}
```

### 🔥 Memory Line

```java
nums[index++] = nums[i];
```

Think:

> **Collect all non-zero elements.**

---

# ⭐ 3. Second Largest Element

### Why Learn?

* ✅ Array Traversal

## Java Code

```java
class Solution {

    public int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr) {

            if(num > largest) {

                secondLargest = largest;
                largest = num;
            }

            else if(num > secondLargest && num != largest) {

                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
```

### 🔥 Memory Line

```java
secondLargest = largest;
largest = num;
```

Think:

> **Old Largest → Second Largest**

---

# ⭐ 4. Valid Palindrome

### Why Learn?

* ✅ String
* ✅ Two Pointers

## Java Code

```java
class Solution {

    public boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {

            if(str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
```

### 🔥 Memory Line

```java
left++;
right--;
```

Think:

> **Move Towards Centre**

---

# ⭐ 5. Best Time to Buy and Sell Stock

### Why Learn?

* ✅ Greedy
* ✅ One Pass

## Java Code

```java
class Solution {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {

            minPrice = Math.min(minPrice, price);

            int profit = price - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
```

### 🔥 Memory Line

```java
profit = price - minPrice;
```

Think:

> **Sell Today, Bought Earlier**

---

# ⭐ 6. Missing Number

```java
class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for(int num : nums)
            actualSum += num;

        return expectedSum - actualSum;
    }
}
```

### 🟢 Remember

```java
int expectedSum = n * (n + 1) / 2;
```

Formula for sum of first n numbers.

---

# ⭐ 7. Maximum Consecutive Ones

```java
class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;

        for(int num : nums) {

            if(num == 1) {

                count++;
                maxCount = Math.max(maxCount, count);

            } else {

                count = 0;
            }
        }

        return maxCount;
    }
}
```

### 🟢 Remember

```java
count = 0;
```

Zero breaks the streak.

---

# ⭐ 8. Reverse String

```java
class Solution {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while(left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
```

### 🟢 Remember

```java
left++;
right--;
```

Move towards the center.

---

# ⭐ 9. Merge Sorted Arrays

```java
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0) {

            if(nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }

        while(j >= 0)
            nums1[k--] = nums2[j--];
    }
}
```

### 🟢 Remember

```java
int k = m + n - 1;
```

Fill from the end.

---

# ⭐ 10. Contains Duplicate

```java
import java.util.*;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {

            if(set.contains(num))
                return true;

            set.add(num);
        }

        return false;
    }
}
```

### 🟢 Remember

```java
if(set.contains(num))
```

Already present → Duplicate found.

---

# ⭐ 11. Intersection of Two Arrays

```java
import java.util.*;

class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : nums1)
            set.add(num);

        for(int num : nums2)
            if(set.contains(num))
                result.add(num);

        int[] ans = new int[result.size()];
        int index = 0;

        for(int num : result)
            ans[index++] = num;

        return ans;
    }
}
```

### 🟢 Remember

```java
set.contains(num)
```

Common element.

---

# ⭐ 12. Remove Duplicates from Sorted Array

```java
class Solution {

    public int removeDuplicates(int[] nums) {

        if(nums.length == 0)
            return 0;

        int index = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] != nums[i - 1])
                nums[index++] = nums[i];
        }

        return index;
    }
}
```

### 🟢 Remember

```java
nums[index++] = nums[i];
```

Store only unique values.

---

# ⭐ 13. Search Insert Position

```java
class Solution {

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target)
                return mid;

            if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return left;
    }
}
```

### 🟢 Remember

```java
return left;
```

Left is the insertion position.

---

# ⭐ 14. Plus One

```java
class Solution {

    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {

            if(digits[i] < 9) {

                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
```

### 🟢 Remember

```java
digits[i] = 0;
```

Carry generated.

---

# ⭐ 15. Sqrt(x)

```java
class Solution {

    public int mySqrt(int x) {

        if(x < 2)
            return x;

        int left = 1;
        int right = x;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if((long)mid * mid == x)
                return mid;

            if((long)mid * mid < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return right;
    }
}
```

### 🟢 Remember

```java
(long) mid * mid
```

Avoid integer overflow.

---

# ⭐⭐⭐ Super Important Java Tricks

| Trick                    | Code                                  | Remember          |
| ------------------------ | ------------------------------------- | ----------------- |
| Extract Last Digit       | `num % 10`                            | Get Last Digit    |
| Remove Last Digit        | `num /= 10`                           | Remove Last Digit |
| Character → Integer      | `ch - '0'`                            | `'7' → 7`         |
| String → Character Array | `str.toCharArray()`                   | Split String      |
| Check Exists             | `set.contains(x)`                     | Already Seen?     |
| HashMap Frequency        | `map.put(x, map.getOrDefault(x,0)+1)` | Increase Count    |

---

# 🚀 30-Minute Revision Checklist

* ✅ Two Sum
* ✅ Move Zeroes
* ✅ Second Largest Element
* ✅ Valid Palindrome
* ✅ Best Time to Buy & Sell Stock
* ✅ Missing Number
* ✅ Maximum Consecutive Ones
* ✅ Reverse String
* ✅ Merge Sorted Arrays
* ✅ Contains Duplicate
* ✅ Intersection of Two Arrays
* ✅ Remove Duplicates from Sorted Array
* ✅ Search Insert Position
* ✅ Plus One
* ✅ Sqrt(x)

---

# 🎯 These 15 Questions Cover

* Arrays
* Strings
* HashMap
* HashSet
* Two Pointers
* Binary Search
* Greedy
* Prefix Logic
* In-place Array Manipulation
* Frequency Counting
* Overflow Handling

Mastering these patterns will prepare you for a large portion of coding questions asked in **TCS NQT** and other **service-based company placement exams**.
