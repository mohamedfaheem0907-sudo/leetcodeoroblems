public boolean isPalindrome(int x) {
    // 1. Handle edge cases (negative numbers, numbers ending in 0)
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }

    int original = x;
    int reversed = 0;

    // 2. Write a loop to extract digits and build 'reversed'
    // Hint: use x % 10 to get the last digit, and x / 10 to remove it
    while (x > 0) {
        // ... update 'reversed' using the extracted digit
        // ... reduce 'x'
    }

    // 3. Compare 'original' with 'reversed'
    return original == reversed;
}
