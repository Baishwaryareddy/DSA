class Solution {

    int MOD = (int)Math.pow(10, 9) + 7;

    public int numWays(String s) {

        int numOnes = (int)s.chars()
                .filter(c -> c == '1')
                .count();
        if (numOnes % 3 != 0) {
            return 0;
        }
        if (numOnes == 0) {
            long len = s.length();
            return (int)((len - 1) * (len - 2) / 2 % MOD);
        }
        int onesPerGroup = numOnes / 3;
        int counter = 0;
        long firstBlock = 0, secondBlock = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                counter++;
            }
            if (counter == onesPerGroup) {
                firstBlock++;
            }
            else if (counter == 2 * onesPerGroup) {
                secondBlock++;
            }
        }
        return (int)((firstBlock * secondBlock) % MOD);
    }
}