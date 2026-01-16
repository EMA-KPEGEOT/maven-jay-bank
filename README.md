# Repo 2

## Exercise 7

List of phases for each command :
- mvn clean
```
1. building archetype 
2. clean (cleans generated files in /target)
```
No new files in the /target folder. It is the opposite.
Existing files are being deleted.

- mvn test
```
1. building archetype
2. compiling module
3. testing ressources
4. testing that the program compiles
5. running the tests
```
Generated classes and resources are created in the /target folder.
- mvn package
```
1. building archetype
2. copying ressources to target
3. comiling classes
4. testing ressources to add
5. testing that the program compiles
6. running the tests
7. building the jar file
```
the mvn package command covers also the mvn test command.
Generated classes and resources are created in the /target folder as well as a final jar program.

## Exercise 8
I wrote tests for the `BankAccount` class and `withdraw` method.

## Exercise 9
By running the jacoco report for the first time, the coverage for the withdrawn method is 100%. (previous exercise)
For this exercise I created tests for the deposit method to increase coverage.
Now I have 100% coverage on both methods.

## Exercise 10
See `.github/workflows`
