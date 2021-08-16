# Gilded Rose Refactoring Kata

This Kata was originally created by Terry Hughes (http://twitter.com/TerryHughes). It was then translated into many programming languages (including the Java version used here) by Emily Bache (https://github.com/emilybache/GildedRose-Refactoring-Kata).  

I have also included a set of tests written by Sandra Parsick (https://github.com/sparsick) which can be used to ensure that nothing is broken while doing the refactoring exercise. 

The ["Gilded Rose Requirements"](https://github.com/kblincoe/GildedRose-Refactoring-Kata/blob/main/GildedRoseRequirements.txt) explains what the code is for. These requirements are also included as comments in the ["GildedRoseTest.java"](https://github.com/kblincoe/GildedRose-Refactoring-Kata/blob/main/src/test/java/com/gildedrose/GildedRoseTest.java) class.

## How to use this Kata

1. Clone this repository so that you can add a "new feature" to the code. You can create a new Java project with the cloned code in your favorite IDE. Be sure to add the JUnit5 library to your project so that you can run the provided test suite.

2. Modify the code to add a new feature. Your task is to enable selling of "conjured" items, which degrade in Quality twice as fast as normal items. There are two failing test cases, which should pass once the code is successfully modified to add this new feature. While you do this code modification, take note of the following: How readable is the code? How easy is the code to modify? How flexible is the code? i.e., could you easily add another item?

3. Consider the principles of clean code and code smells. What code smells are present in the code? What clean code principles are violated? 

4. Refactor the code to address the issues you have identified. Be careful not to break any of the existing functionality (check all tests will still pass). 
 
_Constraints for all code modifications / refactoring:_ Feel free to make any changes to the UpdateQuality method and add any new code as long as everything still works correctly. However, **do not alter** the Item class or Items property.
