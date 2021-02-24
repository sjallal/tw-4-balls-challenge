package tw.procedural;

import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    int ball1_x_pos = 0;
    int ball2_x_pos = 0;
    int ball3_x_pos = 0;
    int ball4_x_pos = 0;

    float ball1_y_pos = 0;
    float ball2_y_pos = 0;
    float ball3_y_pos = 0;
    float ball4_y_pos = 0;

    public static void main(String[] args) {
        PApplet.main("tw.procedural.FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1_y_pos = (float) (HEIGHT * (1.0 / 5.0));
        ball2_y_pos = (float) (HEIGHT * (2.0 / 5.0));
        ball3_y_pos = (float) (HEIGHT * (3.0 / 5.0));
        ball4_y_pos = (float) (HEIGHT * (4.0 / 5.0));
    }

    @Override
    public void draw() {
        drawCircle(ball1_x_pos, ball1_y_pos);
        drawCircle(ball2_x_pos, ball2_y_pos);
        drawCircle(ball3_x_pos, ball3_y_pos);
        drawCircle(ball4_x_pos, ball4_y_pos);
        ball1_x_pos += 1;
        ball2_x_pos += 2;
        ball3_x_pos += 3;
        ball4_x_pos += 4;
    }

    private void drawCircle(int ball_x_pos, float ball_y_pos) {
        ellipse(ball_x_pos, ball_y_pos, DIAMETER, DIAMETER);
    }
}
