import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

//https://en.wikipedia.org/wiki/Mandelbrot_set

public class MandelbrotSet extends JFrame{
    private static BufferedImage image;

    public static void main(String[] args){

        new MandelbrotSet().setVisible(true);

    }

     public MandelbrotSet(){

        setSize(600, 400);
        setLocationRelativeTo(null);
        setTitle("Mandelbrot Set");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);

        for(int pX = 0; pX < getWidth(); pX++){

            for(int pY = 0; pY < getHeight(); pY++){

                double xTemp;
                double x0 = (3.5 / getWidth()) - 2.5;
                double y0 = (3.5 / getHeight() - 2.5);
                double x = 0, y = 0;

                int iteration = 0;
                int maxIterations = 1000;

                while(Math.pow(x, 2) + Math.pow(y, 2) < 4 && iteration < maxIterations){
                    xTemp = Math.pow(x, 2) - Math.pow(y, 2) + x0;
                    y = 2 * x * y + y0;
                    x = xTemp;
                    iteration++;
                }

                image.setRGB(pX, pY, iteration << 12);
            }

        }

    }

    @Override
    public void paint(Graphics g){

        g.drawImage(image, 0, 0, this);

    }
}
