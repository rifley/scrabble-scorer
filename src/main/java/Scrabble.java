import java.util.ArrayList;
import java.util.List;


public class Scrabble {

  String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
  int[] letterPoints = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};

  public Integer calculateScore(String word){

    System.out.println("word" + word);
    Integer result = 0;
    // List<Object> res = new ArrayList<Object>();

    word.toLowerCase();
    String[] wordLetters = word.split("");

    System.out.println("wordletters" + wordLetters.length);

    for(int i = 0; i<wordLetters.length;i++){
      for(int b=0; b<alphabet.length;b++){
        if(wordLetters[i].equals(alphabet[b])){
          result+=letterPoints[b];
        }
      }
      }
      else {
        System.out.println("else");
      }

    }
    return result;
  }

}
