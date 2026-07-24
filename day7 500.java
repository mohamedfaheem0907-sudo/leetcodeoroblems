class Solution {
    public String[] findWords(String[] words) {
        // Define the rows of the keyboard
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        int[] charRow = new int[26];
        
        // Map each lowercase letter to its row index (0, 1, or 2)
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                charRow[c - 'a'] = i;
            }
        }

        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.isEmpty()) {
                result.add(word);
                continue;
            }

            char[] chars = word.toCharArray();
            // Get the target row of the first character (case-insensitive)
            int targetRow = charRow[Character.toLowerCase(chars[0]) - 'a'];
            boolean valid = true;

            for (char c : chars) {
                if (charRow[Character.toLowerCase(c) - 'a'] != targetRow) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
