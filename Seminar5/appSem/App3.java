package Seminar5.appSem;

public class App3 {
    public static void main(String[] args) {
      Rectangle rect = new Rectangle(3, 4);
      System.out.println(rect.getArea());
      Square square = new Square(4);
      System.out.println(square.getArea());
    }
  }
  
  interface Figure {
    int getArea();
  }
  
  class Square implements Figure {
    private int side;
  
    public Square(int side) {
      this.side = side;
    }
  
    @Override
    public int getArea() {
      return side * side;
    }
  }
  
  class Rectangle implements Figure {
    private int width;
    private int height;
  
    public Rectangle(int width, int height) {
      this.height = height;
      this.width = width;
    }
  
    @Override
    public int getArea() {
      return height * width;
    }
  }
  
  /// РњР•РЎРЎР•РќР”Р–Р•Р 
  