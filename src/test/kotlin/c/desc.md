# C. Uniform String
- time limit per test: 2.0 s
- memory limit per test: 512 MB
- input: standard input
- output: standard output

You are given two integers 𝑛 and 𝑘.

Your task is to construct such a string 𝑠 of length 𝑛 that for each 𝑖 from 1 to 𝑘 there is at least one 𝑖-th letter of the Latin alphabet in this string (the first letter is 'a', the second is 'b' and so on) and there are no other letters except these. You have to maximize the minimal frequency of some letter (the frequency of a letter is the number of occurrences of this letter in a string). If there are several possible answers, you can print any.

You have to answer 𝑡 independent queries.

## Input
The first line of the input contains one integer 𝑡 (1≤𝑡≤100) — the number of queries.

The next 𝑡 lines are contain queries, one per line. The 𝑖-th line contains two integers 𝑛𝑖 and 𝑘𝑖 (1≤𝑛𝑖≤100,1≤𝑘𝑖≤𝑚𝑖𝑛(𝑛𝑖,26)) — the length of the string in the 𝑖-th query and the number of characters in the 𝑖-th query.

## Output
Print 𝑡 lines. In the 𝑖-th line print the answer to the 𝑖-th query: any string 𝑠𝑖 satisfying the conditions in the problem statement with constraints from the 𝑖-th query.