public class Bar {

    private static int x = 225;
    private static int y = 225;
    private static int z = 0;

    private static int count = 0;
    public static void drawTimeBar(){

            StdDraw.setPenColor(x, y, z);
            StdDraw.filledRectangle(Environment.timeBarX, Environment.timeBarY, Environment.timeBarWidth / 2, Environment.timeBarHeight / 2);
            Environment.timeBarWidth -= 0.0085;
            Environment.timeBarX = Environment.timeBarWidth / 2;
            count++;
            if(count%9 == 0){
                y-=1;
            }
            if( Environment.timeBarWidth <= 0){
                System.exit(0);
            }
    }

}
