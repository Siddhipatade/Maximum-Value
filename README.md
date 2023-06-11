# Maximum Value at a Given Index in a Bounded Array

This repository contains a Java solution to the problem of finding the maximum value at a given index in a bounded array. The problem is defined as follows:

You are given three positive integers: n, index, and maxSum. You want to construct an array nums (0-indexed) that satisfies the following conditions:

- `nums.length == n`
- `nums[i]` is a positive integer where `0 <= i < n`.
- `abs(nums[i] - nums[i+1]) <= 1` where `0 <= i < n-1`.
- The sum of all the elements of nums does not exceed `maxSum`.
- `nums[index]` is maximized.

The goal is to find the maximum value for `nums[index]` given the constraints.

## Solution Approach

The solution utilizes a `binary search algorithm` to find the maximum value at the given index. The key steps of the algorithm are as follows:

1. Set the initial search range for the maximum value to be between 1 and `maxSum`.
2. Perform a binary search within the search range:
   - Calculate the midpoint of the range as `(start + end) / 2`.
   - Calculate the sums of the values to the left and right of the index using the midpoint value.
   - Compare the calculated sum with `maxSum` to determine if the midpoint value is valid:
     - If the sum is greater than `maxSum`, adjust the search range by updating `end = midpoint - 1`.
     - Otherwise, update `start = midpoint + 1`.
3. Repeat steps 2 until the search range is exhausted (i.e., `start > end`).
4. The maximum value for `nums[index]` will be the value stored in `end`.

The Java code in this repository implements the above algorithm to find the maximum value at the given index in a bounded array.

## Usage


To use the provided solution, follow these steps:

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Clone this repository to your local machine or download the code files.
3. Open the code in your preferred Java Integrated Development Environment (IDE) or text editor.
4. Modify the sample values of `n`, `index`, and `maxSum` in the `main` function or provide your own input.
5. Compile and run the code.
6. The output will display the maximum value at the given index based on the provided input.

Feel free to experiment with different input values to test the solution against various scenarios.

