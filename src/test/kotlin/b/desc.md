# B. Frog Jumping
- time limit per test: 2.0 s
- memory limit per test: 512 MB
- input: standard input
- output: standard output

A frog is currently at the point 0 on a coordinate axis ๐๐ฅ. It jumps by the following algorithm: the first jump is ๐ units to the right, the second jump is ๐ units to the left, the third jump is ๐ units to the right, the fourth jump is ๐ units to the left, and so on.

Formally:

if the frog has jumped an even number of times (before the current jump), it jumps from its current position ๐ฅ to position ๐ฅ+๐;
otherwise it jumps from its current position ๐ฅ to position ๐ฅโ๐.
Your task is to calculate the position of the frog after ๐ jumps.

But... One more thing. You are watching ๐ก different frogs so you have to answer ๐ก independent queries.

## Input
The first line of the input contains one integer ๐ก (1โค๐กโค1000) โ the number of queries.

Each of the next ๐ก lines contain queries (one query per line).

The query is described as three space-separated integers ๐,๐,๐ (1โค๐,๐,๐โค109) โ the lengths of two types of jumps and the number of jumps, respectively.

## Output
Print ๐ก integers. The ๐-th integer should be the answer for the ๐-th query.