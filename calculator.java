public class calculator {
  
  private int ans;
  private int x;
  private int y;

  public calculator(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int add(int x, int y) {
     return x + y;
  }
  public int sub(int x, int y) {
     return x - y;
  }
  public int mult(int x, int y) {    
     return x * y;
  }
  /*public int div(int x, int y) {
     return (x / y);
  }*/
}
