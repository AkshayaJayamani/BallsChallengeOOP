import processing.core.PApplet;

public class BallsChallenge extends PApplet{

    BallModel ballModel = new BallModel();

    int speedOfFirstBall = ballModel.getSpeedOfFirstBall();
    int speedOfSecondBall = ballModel.getSpeedOfSecondBall();
    int speedOfThirdBall = ballModel.getSpeedOfThirdBall();
    int speedOfFourthBall = ballModel.getSpeedOfFourthBall();
    int diameter = ballModel.getDiameter();
    int height = ballModel.getHeight();

    public static void main(String[] args) {
        PApplet.main("BallsChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(ballModel.getWidth(), ballModel.getHeight());
    }


    @Override
    public void draw() {
        getFirstBall();
        getSecondBall();
        getThirdBall();
        getFourthBall();
    }

    private void getFourthBall() {
        ellipse(speedOfFourthBall, 4 * height /5, diameter, diameter);
        speedOfFourthBall+=4;
    }

    private void getThirdBall() {
        ellipse(speedOfThirdBall, 3 * height/5, diameter, diameter);
        speedOfThirdBall+=3;
    }

    private void getSecondBall() {
        ellipse(speedOfSecondBall, 2 * height/5, diameter, diameter);
        speedOfSecondBall+=2;
    }

    private void getFirstBall() {
        ellipse(speedOfFirstBall, height/5, diameter, diameter);
        speedOfFirstBall++;
    }

}
