Flight Scheduling Problem
(C-13.23, Data Structures and Algorithms in Java. Goodrich, Tamassia)

1 Task Description
Suppose you are given a timetable, which consists of:

A set A of n airports, and for each airport in A, a minimum connecting time c(a). 
A set F of m flights, and the following, for each flight f in F:
Origin airport a1(f) in A
Destination airport a2(f) in A
Departure time t1(f)
Arrival time t2(f)

Describe an efficient algorithm for the flight scheduling problem. 
In this problem we are given airports a and b, and a time t, and we wish to compute a sequence
of flights that allows one to arrive at the earliest possible time in b when departing from a at or after time t. 
Minimum connecting times at intermediate airports should be observed.