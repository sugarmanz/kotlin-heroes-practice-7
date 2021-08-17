# F. Prefixes and Suffixes
- time limit per test: 2.0 s
- memory limit per test: 512 MB
- input: standard input
- output: standard output

Ivan wants to play a game with you. He picked some string 𝑠 of length 𝑛 consisting only of lowercase Latin letters.

You don't know this string. Ivan has informed you about all its improper prefixes and suffixes (i.e. prefixes and suffixes of lengths from 1 to 𝑛−1), but he didn't tell you which strings are prefixes and which are suffixes.

Ivan wants you to guess which of the given 2𝑛−2 strings are prefixes of the given string and which are suffixes. It may be impossible to guess the string Ivan picked (since multiple strings may give the same set of suffixes and prefixes), but Ivan will accept your answer if there is at least one string that is consistent with it. Let the game begin!

## Input
The first line of the input contains one integer number 𝑛 (2≤𝑛≤100) — the length of the guessed string 𝑠.

The next 2𝑛−2 lines are contain prefixes and suffixes, one per line. Each of them is the string of length from 1 to 𝑛−1 consisting only of lowercase Latin letters. They can be given in arbitrary order.

It is guaranteed that there are exactly 2 strings of each length from 1 to 𝑛−1. It is also guaranteed that these strings are prefixes and suffixes of some existing string of length 𝑛.

## Output
Print one string of length 2𝑛−2 — the string consisting only of characters 'P' and 'S'. The number of characters 'P' should be equal to the number of characters 'S'. The 𝑖-th character of this string should be 'P' if the 𝑖-th of the input strings is the prefix and 'S' otherwise.

If there are several possible answers, you can print any.