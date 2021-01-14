# TDDKataStringCalculator

This is  a String Calculator made in Java using TDD which passes the following Testcases:
1. Empty String must Return Zero 
2. String with Single Number Must Return That Number 
3. String with Two Numbers and Comma Delimiter must return the sum of Two Numbers
4. String with Two Numbers and Newline Delimiter must return the sum of Two Numbers
5. String with Three Numbers and Comma and  Newline Delimiter must return the sum of Three Numbers
6. String with Negative Numbers must throw Exception
7. Ignore those elements in String whose value is greater than 1000
8. Allowing Delimiters of Variable Length having format ***“//[delimiter]\n”***
9. Allowing Multiple Delimiters which can also have length more than one char ***“//[delim1][delim2]\n”***
   - Multiple delimiters when length of char is one              : **"//[-][%]\n1-2%3"**
   - Multiple delimiters when length of char is longer than one  : **"//[--][%%]\n1--2%%3"**
