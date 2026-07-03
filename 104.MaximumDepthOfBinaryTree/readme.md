# 104. Maximum Depth of Binary Tree

## Problem Statement

Given the `root` of a binary tree, return its **maximum depth**.

A binary tree's **maximum depth** is the number of nodes along the longest path from the root node down to the farthest leaf node.

---

## Example 1

### Input

```text
root = [3,9,20,null,null,15,7]
```

### Output

```text
3
```

### Explanation

```
        3
       / \
      9   20
         /  \
        15   7
```

Possible root-to-leaf paths:

```text
3 → 9        (Depth = 2)
3 → 20 → 15 (Depth = 3)
3 → 20 → 7  (Depth = 3)
```

The longest path has **3 nodes**.

Maximum depth:

```text
3
```

---

## Example 2

### Input

```text
root = [1,null,2]
```

### Output

```text
2
```

### Explanation

```
1
 \
  2
```

Only one root-to-leaf path exists:

```text
1 → 2
```

Number of nodes:

```text
2
```

Maximum depth:

```text
2
```

---

## Constraints

```text
The number of nodes in the tree is in the range [0, 10^4].

-100 <= Node.val <= 100
```

---

## Approach

Use **Depth-First Search (DFS)** with recursion.

### Cases

1. If the tree is empty, return `0`.
2. Recursively find:
   - Maximum depth of the left subtree.
   - Maximum depth of the right subtree.
3. Return:

```text
1 + max(leftDepth, rightDepth)
```

---

## Dry Run

### Example

```
        3
       / \
      9   20
         /  \
        15   7
```

Recursive calls:

```text
maxDepth(3)

= 1 + max(
      maxDepth(9),
      maxDepth(20)
  )
```

For node `9`:

```text
Depth = 1
```

For node `20`:

```text
1 + max(1,1) = 2
```

Finally:

```text
1 + max(1,2)

= 3
```

---

## Java Solution

```java
class Solution {
    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

Every node is visited exactly once.

### Space Complexity

```text
O(h)
```

where `h` is the height of the tree.

- Best Case (Balanced Tree):

```text
O(log n)
```

- Worst Case (Skewed Tree):

```text
O(n)
```

---

## Key Concepts

- Binary Tree
- Depth-First Search (DFS)
- Recursion
- Tree Traversal
- Divide and Conquer
- Maximum Depth
