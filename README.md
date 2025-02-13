# Groovy List Iteration Bug

This repository demonstrates a common error in Groovy when modifying a list while iterating over it using `eachWithIndex`.  The code attempts to remove elements matching "someValue" but encounters issues due to the concurrent modification of the list.

The `bug.groovy` file contains the erroneous code, while `bugSolution.groovy` provides a corrected version.

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`).
3. Observe the unexpected output and the potential `ConcurrentModificationException` (or similar).

## Solution

The solution involves iterating over a copy of the list or using an iterator with `remove()` for safe removal.