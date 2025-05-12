1832. Check if the Sentence Is Pangram
________________________________________________________________________________________________________________________________________________________________________________
public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;
        int i = 0;
        while (i < n) {
            char ch = chars[i];
            int count = 0;
            // count number of characters 
            while ( i < n && chars[i] == ch ) {
                count++;
                i++;
            }
            // assigning values respectively
            chars[index] = ch;
            index++;
           
            if (count > 1) {
                String str = Integer.toString(count);
                for (int j = 0; j < str.length(); j++) {
                    chars[index++] = str.charAt(j);
                }
            }
        }
        return index;

    }
