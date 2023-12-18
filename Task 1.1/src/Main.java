import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String text;

    HashMap<String, Integer> map = new HashMap<>();
    int i = 0;
    while (true){
      try {
        if(sc.hasNext()){
          text = sc.next();
          if(map.containsKey(text)){
            throw new AlreadyExistsException(text, map.get(text));
          } else {
            map.put(text, i);
          }
        }
        i++;
      } catch (AlreadyExistsException e){
        System.err.println("Пойманная ошибка: " + e.getMessage());
        break;
      }

    }
  }
}