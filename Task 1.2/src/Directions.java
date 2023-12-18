import java.util.Arrays;

public enum Directions {
  Up("Вверх", '↑', new int[]{0, 1}),
  Down("Вниз", '↓', new int[]{0, -1}),
  Left("Влево", '←', new int[]{-1, 0}),
  Right("Вправо", '→', new int[]{1, 0});

  private final String ruName;
  private final char charCode;
  private final int[] vector;

  Directions(String ruName, char charCode, int[] vector) {
    this.ruName = ruName;
    this.charCode = charCode;
    this.vector = vector;
  }

  public String getRuName() {
    return ruName;
  }

  public char getCharCode() {
    return charCode;
  }

  public int[] getVector() {
    return vector;
  }

  @Override
  public String toString() {
    return "Directions{" +
            "ruName='" + ruName + '\'' +
            ", charCode=" + charCode +
            ", vector=" + Arrays.toString(vector) +
            '}';
  }
}
