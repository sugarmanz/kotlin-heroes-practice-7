# B. Frog Jumping
- time limit per test: 2.0 s
- memory limit per test: 512 MB
- input: standard input
- output: standard output

A frog is currently at the point 0 on a coordinate axis 𝑂𝑥. It jumps by the following algorithm: the first jump is 𝑎 units to the right, the second jump is 𝑏 units to the left, the third jump is 𝑎 units to the right, the fourth jump is 𝑏 units to the left, and so on.

Formally:

if the frog has jumped an even number of times (before the current jump), it jumps from its current position 𝑥 to position 𝑥+𝑎;
otherwise it jumps from its current position 𝑥 to position 𝑥−𝑏.
Your task is to calculate the position of the frog after 𝑘 jumps.

But... One more thing. You are watching 𝑡 different frogs so you have to answer 𝑡 independent queries.

Input
The first line of the input contains one integer 𝑡 (1≤𝑡≤1000) — the number of queries.

Each of the next 𝑡 lines contain queries (one query per line).

The query is described as three space-separated integers 𝑎,𝑏,𝑘 (1≤𝑎,𝑏,𝑘≤109) — the lengths of two types of jumps and the number of jumps, respectively.

Output
Print 𝑡 integers. The 𝑖-th integer should be the answer for the 𝑖-th query.