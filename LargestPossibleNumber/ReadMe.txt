Two Non-negative integers are called sibilings if they can be obtained from each other by rearraning the digits of their decimal reprsentations. For example, 
123 and 213 are sibiings. 535 and 355 are also sibilings.

A set consisting of a non-negative integer N and all of its sibilings is called the family of N. For example, the family of 553 comprises three numbers: 355, 
535 and 553.

Write a function:

	def solution(N)
that, given a non-negative integr N, returns the largest number in the family of N. For example, given N = 213 the function should return 321. Given N = 553 
the function should return 553. 