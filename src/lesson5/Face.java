package lesson5;

import java.awt.Color;
import java.awt.Graphics;

public class Face {

    private int xPos, yPos, diameter;
    private Color color,c;
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
    }

    public void drawHead() {
        color = Color.red;
        g.setColor(color);
        g.fillOval(xPos, yPos, diameter, diameter);
    }
    
    public void drawEyes(){
        c = Color.yellow;
        g.setColor(c);
        g.fillOval(xPos + 15,yPos + 20,diameter / 4, diameter / 4);
        g.fillOval(xPos+ 60,yPos + 20,diameter / 4, diameter / 4);
    }
    public void drawMouth(){
    }

    public void move(int x, int y) {
       xPos = x;
       yPos = y;
    }
    public void erase(){
    g.setColor(Color.white);
    g.fillRect(xPos-10, yPos-10, diameter + 20, diameter + 20);
    }
}
