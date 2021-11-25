package fr.warzou.s1.tp8;

public class WordCount {

    public static int count(String string) {
        int count = 1;
        char[] splitter = new char[] {'.', ' '};
        char lastChar = (char) -1;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (lastChar == -1) {
                lastChar = c;
                continue;
            }
            if (contain(splitter, c) && !contain(splitter, lastChar))
                count++;
            lastChar = c;
        }

        return count;
    }

    private static boolean contain(char[] array, char c) {
        for (char check : array) {
            if (check == c)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(count("Le     .si.e.t le la en cle de fa")); // 10
    }

}
