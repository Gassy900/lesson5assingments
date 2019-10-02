package lesson5;

import java.awt.Color;
import java.awt.Graphics;

public class Face {

    private int xPos, yPos, diameter;
    private Color color, c;
    private Graphics g;

    public Face(Graphics g, int x, int y) {
        xPos = x;
        yPos = y;

        this.g = g;

        diameter = 100;
        color = Color.red;
    }

    public void draw() {
        drawHead();
        drawEyes();
        drawMouth();
    }

    public void drawHead() {
        color = Color.red;
        g.setColor(color);
        g.fillOval(xPos, yPos, diameter, diameter);
    }

    public void drawEyes() {
        c = Color.yellow;
        g.setColor(c);
        g.fillOval(xPos + (int)(diameter/1.8), yPos + (int)(diameter/4.2), diameter / 4, diameter / 4);
        g.fillOval(xPos + (int)(diameter/5), yPos +(int)(diameter/4.2), diameter / 4, diameter / 4);
    }

    public void drawMouth() {
        g.setColor(Color.black);
        g.drawLine( xPos +(int)(diameter/6), yPos+(int)(diameter/1.8), xPos+(int)(diameter/5), yPos+(int)(diameter/1.4));
        g.drawLine( xPos+(int)(diameter/5), yPos+(int)(diameter/1.4), xPos+(int)(diameter/1.382),yPos+(int)(diameter/1.4));
        g.drawLine(xPos+(int)(diameter/1.382),yPos+(int)(diameter/1.4), xPos+(int)(diameter/1.25), yPos+(int)(diameter/1.8));
    }
    public void sadMouth(){
        g.drawLine( xPos +(int)(diameter/6), yPos+(int)(diameter/1.8), xPos+(int)(diameter/5), yPos+(int)(diameter/1.4));
        g.drawLine( xPos+(int)(diameter/5), yPos+(int)(diameter/1.4), xPos+(int)(diameter/1.382),yPos+(int)(diameter/1.4));
        g.drawLine(xPos+(int)(diameter/1.382),yPos+(int)(diameter/1.4), xPos+(int)(diameter/1.25), yPos+(int)(diameter/1.8));
    }

    public void move(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void erase() {
        g.setColor(Color.white);
        g.fillRect(xPos - 10, yPos - 10, diameter + 20, diameter + 20);
    }

    public void sizenew(int x) {
        diameter = x;
    }
    public void reset(){
        diameter = 100;
        xPos = 100;
        yPos = 100;
    }
}
