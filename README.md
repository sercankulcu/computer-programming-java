# Computer Fundamentals and Introduction to Programming in Java

Java code examples for the undergraduate **Computer Fundamentals and Introduction to Programming (Bilgisayar ve Programlamaya Giriş)** course at Giresun University. Each `DersNN/src` folder belongs to one chapter of the course and contains the code shown on that chapter's slides and study questions as small runnable programs. Class, method and variable names follow the slides, so each program's output can be compared directly with the slide examples.

Course page and slides: <https://sercankulcu.github.io/teaching/computer-and-introduction-to-programming>

## Chapters

| Folder | Chapter | Programs |
|---|---|---|
| `Ders04` | Programming, Algorithms and Flowcharts | Swapping with a temporary variable, factorial and Fibonacci with trace tables, accumulating products, palindrome, primality and next/previous prime, digit sum and count, linear and binary search, selection/bubble/insertion sort, letter grade (buggy vs. fixed), sequential/conditional/loop flowcharts in Java, counters and accumulators, nested loops and patterns, number-guessing game, basic constructs |
| `Ders05` | Java and the First Program | First program and comment styles, `print` vs. `println`, line endings, escape sequences, tab-aligned output, string vs. number `+`, expressions/statements/blocks, the four error types, integer division, test tables, source file structure |
| `Ders06` | Variables, Data Types and Operators | Integer overflow and range constants, floating-point comparison, `char` arithmetic, declarations and primitive types, widening/narrowing casts, integer vs. floating division, division by zero and `NaN`, `++`/`--`, compound assignment, operator precedence, short-circuit evaluation, `Scanner` pitfalls, `printf`, `Math`, swapping, unit conversions |
| `Ders07` | Conditionals | `if`/`else`, `else if` grade chain, nested and independent decisions, dangling `else`, logical and short-circuit operators, ternary operator, `==` vs. `equals`, `switch` (arrow form, `yield`, classic fall-through), odd/even, absolute value, leap year, quadratic equation, max of three, calculator, common `if` pitfalls |
| `Ders08` | Loops | `for`/`while`/`do-while`, `break`/`continue` and labeled `break`, bounded infinite loop, floating-point loop counter, off-by-one errors, digit count/sum, reverse and palindrome numbers, Armstrong and perfect numbers, decimal to binary, power, primes, Fibonacci, sentinel input, nested loops and star patterns, factorial overflow |
| `Ders09` | Methods | Definition and call, call stack, `static` vs. instance, `void` methods, early return, pass-by-value and the swap pitfall, overloading, varargs, scope and shadowing, `asalMi`/`sonrakiAsal`/`oncekiAsal`, GCD/LCM, decomposition, `usHesapla` with negative exponents, combinations, pure methods |
| `Ders10` | Arrays | Creating and traversing arrays, out-of-bounds errors, sum/average/min/max, reversal and rotation, frequency counting, sieve of Eratosthenes, copying (reference vs. `clone`/`copyOf`/`arraycopy`), `Arrays` utilities, linear and binary search, bubble and insertion sort, 2D and jagged arrays, shallow-copy pitfall, matrices, median |
| `Ders11` | Strings | Creating strings, immutability, common `String` methods, `substring`, `split`/`replace`/`join`, `==` vs. `equals` and the string pool, `compareTo`, Turkish locale, `Scanner` pitfalls, `StringBuilder`, reversal and palindrome, vowel/word/character counting, Caesar cipher, `printf`, UTF-16 length |
| `Ders12` | Recursion | Factorial and 1..n sum with call traces, digit operations, recursive palindrome, Euclid's GCD, Towers of Hanoi, power and fast power, recursive binary search, merge sort, string reversal, subsets by backtracking, stack overflow, Fibonacci and memoization, tail recursion, decimal to binary, binomial coefficient |

Chapters 1–3 of the course (computer fundamentals, operating systems, office applications) have no code examples.

## Running the examples

Requires **JDK 17 or later** (Chapter 7 uses `switch` expressions).

Every file is a standalone program with a `main` method in the default package, and no program waits for keyboard input: programs that demonstrate `Scanner` read from a fixed string, and random numbers use a fixed seed. Code that does not compile or that runs forever on the slides is shown as comments or run with a bounded loop; runtime errors are caught and their messages printed. To compile and run one chapter:

```bash
cd Ders08/src
javac -d ../bin *.java
java -cp ../bin Fibonacci
```

Each folder is also an Eclipse project (`File > Import > Existing Projects into Workspace`).

Comments and identifiers are in Turkish, written without Turkish characters so the files compile with any platform encoding. Terms follow the course glossary: <https://sercankulcu.github.io/files/computer/sozluk.html>

## Contact

For questions or suggestions, contact [Sercan Külcü](https://github.com/sercankulcu) or open an issue on GitHub.
