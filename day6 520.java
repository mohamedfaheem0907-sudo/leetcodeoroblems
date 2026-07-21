class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) upperCount++;
        }
        // all upper or all lower
        if (upperCount == word.length() || upperCount == 0) return true;
        // exactly one upper and it's the first character
        if (upperCount == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}
