# C. Uniform String
- time limit per test: 2.0 s
- memory limit per test: 512 MB
- input: standard input
- output: standard output

You are given two integers ๐ and ๐.

Your task is to construct such a string ๐  of length ๐ that for each ๐ from 1 to ๐ there is at least one ๐-th letter of the Latin alphabet in this string (the first letter is 'a', the second is 'b' and so on) and there are no other letters except these. You have to maximize the minimal frequency of some letter (the frequency of a letter is the number of occurrences of this letter in a string). If there are several possible answers, you can print any.

You have to answer ๐ก independent queries.

## Input
The first line of the input contains one integer ๐ก (1โค๐กโค100) โ the number of queries.

The next ๐ก lines are contain queries, one per line. The ๐-th line contains two integers ๐๐ and ๐๐ (1โค๐๐โค100,1โค๐๐โค๐๐๐(๐๐,26)) โ the length of the string in the ๐-th query and the number of characters in the ๐-th query.

## Output
Print ๐ก lines. In the ๐-th line print the answer to the ๐-th query: any string ๐ ๐ satisfying the conditions in the problem statement with constraints from the ๐-th query.