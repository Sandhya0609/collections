package map.hashMap;

public class NumberOfOccurrencesInAString {
    static final int MAX_CHAR = 256;

    static void getRepeatingChar(String str) {
        //creating an array of size 256
        int count[] = new int[MAX_CHAR];
        int len = str.length();
        //initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
//create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
//if any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1)
                System.out.println("Number of occurrences of " + str.charAt(i) + " is :" + count[str.charAt(i)]);


        }
    }

    public static void main(String args[]){
        String str = "this is your first round this is not a final round ";
        getRepeatingChar(str);

    }
}

