public class Environment {

    private static final int CANVAS_WIDTH = 800;
    private static final int CANVAS_HEIGHT = 500;
    public static final double SET_X1_SCALE = 0.0;
    public static final double SET_X2_SCALE = 16.0;
    public static final double SET_Y1_SCALE = -1.0;
    public static final double SET_Y2_SCALE = 9.0;

    public static  double timeBarX = (SET_X2_SCALE-SET_X1_SCALE) / 2;
    public static  double timeBarY = -0.5;

    public static  double timeBarWidth = SET_X2_SCALE-SET_X1_SCALE;
    public static  double timeBarHeight = 0.5;

    public static void setCanvasSize(){
        StdDraw.setCanvasSize(Environment.CANVAS_WIDTH, Environment.CANVAS_HEIGHT);
        StdDraw.setXscale(Environment.SET_X1_SCALE,Environment.SET_X2_SCALE);
        StdDraw.setYscale(Environment.SET_Y1_SCALE,Environment.SET_Y2_SCALE);
    }
    public static void displayBackground(){
        StdDraw.picture((SET_X2_SCALE - SET_X1_SCALE) / 2.0, (SET_Y2_SCALE - 0.0) / 2.0, "background.png",16,9.0,0);
        StdDraw.picture((SET_X2_SCALE - SET_X1_SCALE) / 2.0,-0.5,"bar.png",(SET_X2_SCALE - SET_X1_SCALE),1,0);
    }

}
