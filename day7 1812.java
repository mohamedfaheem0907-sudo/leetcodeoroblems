class Solution {
    public boolean squareIsWhite(String coordinates) {
        char col = coordinates.charAt(0);
        char row = coordinates.charAt(1);
        
        // If the sum of character parity values is odd, the square is white.
        return (col + row) % 2 != 0;
    }
}
