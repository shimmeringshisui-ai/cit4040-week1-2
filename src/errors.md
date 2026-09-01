# Task 3.4 — NullPointerException

## Full stack trace

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "missingProduct" is null
at Calculator.main(Calculator.java:65)

## Answers

1. Which file and which line caused the exception?

Calculator.java, line 65.

2. Which line of the trace is the first one that mentions code you wrote?

at Calculator.main(Calculator.java:65)

3. What single change would prevent it?

Change:

String missingProduct = null;

to:

String missingProduct = "Notebook";