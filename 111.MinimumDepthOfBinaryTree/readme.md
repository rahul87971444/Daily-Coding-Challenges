# 111. Minimum Depth of Binary Tree

## Problem Statement

Given the `root` of a binary tree, return its **minimum depth**.

The **minimum depth** is the number of nodes along the shortest path from the root node down to the nearest **leaf node**.

> **Note:** A leaf is a node with **no left child and no right child**.

---

## Example 1

### Input

```text
root = [3,9,20,null,null,15,7]
```

### Output

```text
2
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

The shortest path is:

```text
3 → 9
```

Minimum depth:

```text
2
```

---

## Example 2

### Input

```text
root = [2,null,3,null,4,null,5,null,6]
```

### Output

```text
5
```

### Explanation

```
2
 \
  3
   \
    4
     \
      5
       \
        6
```

There is only one root-to-leaf path:

```text
2 → 3 → 4 → 5 → 6
```

Number of nodes in the path:

```text
5
```

Minimum depth:

```text
5
```

---

## Constraints

```text
The number of nodes is in the range [0, 10^5].

-1000 <= Node.val <= 1000
```

---

## Approach

Use **Depth-First Search (DFS)** recursively.

### Cases

1. If the tree is empty, return `0`.
2. If the node is a leaf, return `1`.
3. If one child is missing, continue with the existing child.
4. If both children exist, return:

```text
1 + min(leftDepth, rightDepth)
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
minDepth(3)

= 1 + min(
      minDepth(9),
      minDepth(20)
  )
```

Node `9` is a leaf:

```text
Depth = 1
```

Node `20`:

```text
1 + min(1,1) = 2
```

Finally:

```text
1 + min(1,2)

= 2
```

---

## Java Solution

```java
class Solution {

    public int minDepth(TreeNode root) {

        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        if (root.left == null)
            return 1 + minDepth(root.right);

        if (root.right == null)
            return 1 + minDepth(root.left);

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
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
- Base Cases
- Divide and Conquer
