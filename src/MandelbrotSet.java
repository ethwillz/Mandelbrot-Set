import javax.swing.*;
import java.awt.*;

//https://en.wikipedia.org/wiki/Mandelbrot_set

public class MandelbrotSet extends Component{
    public static void main(String[] args){
        JFrame frame = new JFrame("Mandelbrot Set");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);


        //All this wrapped in for loop that goes through each pixel
        int x0, y0; //write equation to scale this
        int x = 0, y = 0;

        int iteration = 0;
        int maxIterations = 1000;

        while(Math.pow(x, 2) + Math.pow(y, 2) < 4 && iteration < maxIterations){
            xTemp = Math.pow(x, 2) - Math.pow(y, 2) + x0;
            y = 2 * x * y + y0;
            x = xtemp;
            iteration++;
        }

        //color = palette index of iteration
        //plot point with color

    }
}
