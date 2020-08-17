# Exploring ways to create a clean API for Bulkification Pattern

Bulkification is a performance improvement pattern used when persisting entities to a database. 
When there is a list of entities on which some computation has to be done, and the result should be INSERTed/UPDATEd in the database, 
we may a bulkification step. It involves doing the computation over source entities to derive a list
of entities and issuing the database call as a batch call. This will save multiple round trips from Java to the 
database. However, when the computation is long and at various points there is need to persist intermediate states,
this style of coding can get difficult to read.

### Domain Model and Problem Statement

### 01 Naive Imperative Approach

### 02 Fluent Imperative Approach

### 03 Fluent Lazy Approach

[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/Rmer37g9AZM/0.jpg)](https://www.youtube.com/watch?v=Rmer37g9AZM)
