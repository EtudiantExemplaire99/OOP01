//
import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> examScores = new HashMap<String, Integer>();
    examScores.put("Math", 75);
    examScores.put("English", 56);
    examScores.put("Science", 98);
    examScores.put("Geography", 69);

    examScores.replace("Math",96);


    examScores.put("Religion",99);

    examScores.put("Philosophy",82);

    
    System.out.println(examScores.toString());
    
  }
}
