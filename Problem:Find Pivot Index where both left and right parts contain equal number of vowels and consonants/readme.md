# Find the Index where both left and right part contain equal number of Vowels and Consonants

## Problem Statement

Given a character array consisting of lowercase English letters, find the first index such that:

- The number of vowels on the **left side** of the index is equal to the number of consonants on the left side.
- The number of vowels on the **right side** of the index is equal to the number of consonants on the right side.

If no such index exists, return **-1**.

---

## Example 1

### Input

```text
arr = ['a','b','e','c','i','d','o','f']
```

### Output

```text
3
```

---

## Explanation

The array is:

```text
Index : 0 1 2 3 4 5 6 7
Array : a b e c i d o f
```

At index **3 ('c')**:

### Left Side

```text
a b e
```

Vowels:

```text
a, e = 2
```

Consonants:

```text
b = 1
```

(Counts are checked before adding the current element.)

### Right Side

```text
i d o f
```

Vowels:

```text
i, o = 2
```

Consonants:

```text
d, f = 2
```

Since the left and right satisfy the required conditions, the answer is:

```text
3
```

---

## Approach

1. Count the total number of vowels and consonants in the array.
2. Traverse the array from left to right.
3. Before processing the current character:
   - Remove it from the right-side counts.
4. Compare:
   - Left vowels == Left consonants
   - Right vowels == Right consonants
5. If both conditions are true, return the current index.
6. Otherwise, add the current character to the left-side counts.
7. If no valid index exists, return `-1`.

---

## Algorithm

1. Count total vowels and consonants.
2. Initialize:
   - `leftV = 0`
   - `leftC = 0`
3. For every character:
   - Update right-side counts.
   - Check equilibrium condition.
   - Update left-side counts.
4. Return the first valid index.
5. If none is found, return `-1`.

---

## Java Solution

```java
class Main {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    static int findIndex(char[] arr) {

        int totalV = 0, totalC = 0;

        for (char ch : arr) {
            if (isVowel(ch))
                totalV++;
            else
                totalC++;
        }

        int leftV = 0, leftC = 0;

        for (int i = 0; i < arr.length; i++) {

            if (isVowel(arr[i]))
                totalV--;
            else
                totalC--;

            if (leftV == leftC && totalV == totalC)
                return i;

            if (isVowel(arr[i]))
                leftV++;
            else
                leftC++;
        }

        return -1;
    }

    public static void main(String[] args) {

        char[] arr = {'a','b','e','c','i','d','o','f'};

        System.out.println(findIndex(arr));
    }
}
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

- One pass to count vowels and consonants.
- One pass to find the required index.

---

### Space Complexity

```text
O(1)
```

Only a few integer variables are used.

---

## Key Concepts

- Arrays
- Character Processing
- Two-Pass Traversal
- Prefix and Suffix Counting
- Vowel Detection
- Constant Space Optimization
