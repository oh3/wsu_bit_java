
public class Point {
	
   private int x;
   private int y;
   
   //持失切 ==============================================
   public Point() {
      this(0,0);
      //x = 0;
      //y = 0;
   }
   
   public Point(int x, int y) {
      this.setX(x);
      this.setY(y);
   }
   //==================================================持失切

   public int getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }
}

