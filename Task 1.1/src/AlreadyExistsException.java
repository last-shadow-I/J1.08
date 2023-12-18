public class AlreadyExistsException extends RuntimeException{

  private String value;
  private int position;

  public AlreadyExistsException(String value, int position) {
    super("Значение: " + value + " дублируется. Первый ввод был на позиции " + position);
    setValue(value);
    setPosition(position);
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }
}
