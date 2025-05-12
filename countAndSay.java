38. Count and Say
________________________________________________________________________________________________________________________________________________________________________________________________________________
public String countAndSay(int n) {
        if (n == 1) return "1";

        String say = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();

        // processing 

        int i = 0;
        while (i < say.length()) {
            char ch = say.charAt(i);
            int count = 1;

            while (i  < say.length()-1 && say.charAt(i + 1) == ch) {
                count++;
                i++;
            }

            result.append(count).append(ch);
            i++; // move to next different character
        }

        return result.toString();

    }
