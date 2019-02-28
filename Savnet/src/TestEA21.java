import java.util.Arrays;

public class TestEA21 {

    public static void main(String[] args) {
        String word = " ";
        String letters = " a";
        System.out.println("{" + hangman(word, letters) + "}");
    }

    public static String hangman(String word, String letters) {
        String[] wordarray = word.split("");
        String[] lettersarray = letters.split("");


        if(word.length() == 0)
        {
            return "";
      }




        for (char c : word.toCharArray()) {
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                return null;
            }
        }


        String[] newwordarray = word.split("");
        for (int i = 0; i < wordarray.length; i++) {
            for (int j = 0; j < lettersarray.length; j++) {
                if(lettersarray[i].equals(" "))
                {
                    j++;
                }
                if (wordarray[i].equals(" ")) {
                    newwordarray[i] = wordarray[i].replace(wordarray[i], " ");
                    break;
                }
               else  if (!wordarray[i].equalsIgnoreCase(lettersarray[j])) {
                    newwordarray[i] = wordarray[i].replace(wordarray[i], "_");
                }
                 else if (wordarray[i].equalsIgnoreCase(lettersarray[j])) {
                    newwordarray[i] = wordarray[i].replace(wordarray[i], wordarray[i]);
                    break;
                }


            }
        }

        String str = "";
        for (int i = 0; i < newwordarray.length; i++) {


            str += newwordarray[i] + "";
        }


        return str;
    }
}
