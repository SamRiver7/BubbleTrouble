import java.awt.event.KeyEvent;

public class Player {

    private static final int PERIOD_OF_PLAYER = 6000;

    private static final double PLAYER_HEIGHT_SCALE_Y_RATE = 1.0/9.0;
    private static final double PLAYER_WIDTH_HEIGHT_RATE = 27.0/37.0;

    private static final double playerHeight = PLAYER_HEIGHT_SCALE_Y_RATE * Environment.SET_Y2_SCALE;
    private static final double playerWidth = PLAYER_WIDTH_HEIGHT_RATE * playerHeight;

    private static double arrowHeight = playerHeight;

    private static double Player_X_Coor = (Environment.SET_X2_SCALE-Environment.SET_X1_SCALE) / 2;
    private static double Player_Y_Coor = playerHeight / 2;

    private static double Arrow_X_Coor;

    private static double Arrow_Y_Coor = Player_Y_Coor;

    private static final double playerLimitX1 = Environment.SET_X1_SCALE + playerWidth/2 ;
    private static final double playerLimitX2 = Environment.SET_X2_SCALE - playerWidth/2 ;

    private static final double arrowLimitY = Environment.SET_Y2_SCALE;
    private static final int keyboardPauseDuration = (int)(PERIOD_OF_PLAYER / (134));

    public static void playerInAction(){
        System.out.println(keyboardPauseDuration);
        while(true){

            if(Player_X_Coor > playerLimitX1 ){
                if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
                    // Move the player to the left
                    StdDraw.pause(keyboardPauseDuration);
                    Player_X_Coor = Player_X_Coor - playerWidth/4;
                }
            }
            if(Player_X_Coor < playerLimitX2) {
                if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
                    // Move the player to the right
                    StdDraw.pause(keyboardPauseDuration);
                    Player_X_Coor = Player_X_Coor + playerWidth / 4;
                }
            }

            Arrow_X_Coor = Player_X_Coor;

            StdDraw.clear();
            Environment.displayBackground();
            Bar.drawTimeBar();
            StdDraw.picture(Arrow_X_Coor,Arrow_Y_Coor,"arrow.png",0.2,arrowHeight);
            StdDraw.picture(Player_X_Coor,Player_Y_Coor,"player_back.png",playerWidth,playerHeight);
            StdDraw.show();
        }
    }
}
