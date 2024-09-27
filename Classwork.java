public class Classwork
{
  public static void main(String[] args)
  {
    String firstProb = firstlastN("dictionary", 3);
    System.out.println(firstProb);

    System.out.println(delEnd("library", 5));
    // test your code here
  }

  public static String firstlastN(String word, int n)
  {
    String output = new String(); // makes a blank String
    String firstN = word.substring(0, n); // substring from 0 to n-1
    int indexOfNToLast = word.length() - n;
    String lastN = word.substring(indexOfNToLast); // starts at n to last letter, and goes to the end

    output = firstN + lastN;
    return output;
  }

  public static String delEnd(String word, int n)
  {
    String output = new String();
    int indexofNthToLast = word.length() - n;
    String newWord = word.substring(0, indexofNthToLast);

    return newWord;
  }

  public static
  // write solutions to problems below

}
