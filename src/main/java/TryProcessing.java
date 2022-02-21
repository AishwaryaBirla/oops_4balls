import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 649;
    public static final int HEIGHT = 480;
    int a=0;
    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
        super.setup();
        background(175,238,238);

    }

    @Override
    public void draw() {
        Drawing drawing = new Drawing();
        drawing.getEllipse(a,4);
        a++;
    }


    private class Drawing {
        public void getEllipse(int x, int n) {
            int y = HEIGHT/(n+1);
            for (int i=1;i<=n;i++){
                ellipse(x*i,y*i,15,15);
            }
        }
    }
}
