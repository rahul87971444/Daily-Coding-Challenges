# 1700. Number of Students Unable to Eat Lunch

## Problem Statement

The school cafeteria offers:
- Circular sandwiches represented by `0`
- Square sandwiches represented by `1`

All students stand in a queue. Each student prefers either circular or square sandwiches.

The number of sandwiches equals the number of students. Sandwiches are placed in a stack.

At each step:

- If the student at the front of the queue prefers the sandwich on top of the stack:
  - they take it and leave the queue.
- Otherwise:
  - they move to the end of the queue.

The process continues until no student in the queue wants the sandwich on top of the stack.

Return the number of students unable to eat.

---

## Example 1

### Input
```text
students = [1,1,0,0]
sandwiches = [0,1,0,1]
```

### Output
```text
0
```

### Explanation

- Front student leaves the top sandwich and moves to end:
  students = [1,0,0,1]

- Front student leaves the top sandwich and moves to end:
  students = [0,0,1,1]

- Front student takes sandwich:
  students = [0,1,1]
  sandwiches = [1,0,1]

- Front student moves to end:
  students = [1,1,0]

- Front student takes sandwich:
  students = [1,0]
  sandwiches = [0,1]

- Front student moves to end:
  students = [0,1]

- Front student takes sandwich:
  students = [1]
  sandwiches = [1]

- Front student takes sandwich:
  students = []
  sandwiches = []

Hence, all students are able to eat.

---

## Example 2

### Input
```text
students = [1,1,1,0,0,1]
sandwiches = [1,0,0,0,1,1]
```

### Output
```text
3
```
