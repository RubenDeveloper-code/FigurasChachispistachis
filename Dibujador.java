/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figschachipistachis;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.TexturePaint;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

/**
 *
 * @author ruben
 */
public class Dibujador {

    //Dios mio que desastre....
    int defX = 200, defY = 200;
    float defW = 200, defH = 200;
    float adefW = 200, adefH = 200;
    JPanel panel;
    Graphics g;
    Graphics2D g2d;
    Shape shape;
    boolean is_cylinder = false, is_deg = false, is_texture = false;
    private Paint gpglobal;
    Cylinder2D cylinder;
    int selfig = 0, selLine = 0, selFill = 0;
    Color colorFill = Color.WHITE;
    Color colorStroke = Color.BLACK;
    TexturePaint globalTexture;

    Dibujador(JPanel panel) {
        this.panel = panel;
        g = panel.getGraphics();
        g2d = (Graphics2D) g;
        String rutaImagen = System.getProperty("user.dir") + File.separator + "src/figschachipistachis/" + "mc.png";
        System.out.print(rutaImagen);
        try {
            File file = new File(rutaImagen);
            BufferedImage image = ImageIO.read(file);
            int width = image.getWidth();
            int height = image.getHeight();
            globalTexture = new TexturePaint(image, new Rectangle(0, 0, width, height));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void drawFigura(int fig) {
        clearScreen();
        selfig = fig;
        switch (selfig) {
            case 1 ->
                drawCirculo();
            case 2 ->
                drawCuadrado();
            case 3 ->
                drawCilindro();
        }
        redraw();
    }

    public void fillFigura(int typeFill) {
        clearScreen();
        selFill = typeFill;
        switch (selFill) {
            case 1 -> {
                g2d.setColor(colorFill = JColorChooser.showDialog(panel, "Color de relleno", Color.RED));
                is_deg = false;
                is_texture = false;
            }
            case 2 -> {
                Color start = JColorChooser.showDialog(panel, "Color de Inicio", Color.RED);
                Color fin = JColorChooser.showDialog(panel, "Color de Final", Color.RED);
                g2d.setPaint(gpglobal = new GradientPaint(defX, defY, start,
                        defW + defX, defH + defY, fin));
                is_deg = true;
                is_texture = false;
            }
            case 3 -> {
                gpglobal = globalTexture;
                is_texture = true;
                is_deg = false;
            }
        }
        redraw();
    }

    public void lineFigura(int typeLine) {
        clearScreen();
        selLine = typeLine;
        float[] patron = {1f, 3f};
        switch (selLine) {
            case 1 ->
                g2d.setStroke(new BasicStroke(5f));
            case 2 ->
                g2d.setStroke(new BasicStroke(0.5f));
            case 3 ->
                g2d.setStroke(new BasicStroke(5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10f, patron, 0f));
        }
        redraw();
    }
    
    public void scaleFig(int scale){
        clearScreen();
        defW = adefW * (scale/10f);
        defH = adefH * (scale/10f);
        redraw();
    }

    private void drawCirculo() {
        selfig = 1;
        Ellipse2D.Double circulo;
        shape = circulo = new Ellipse2D.Double(defX, defY, defW, defH);
        g2d.draw(circulo);
        is_cylinder = false;
    }

    private void drawCuadrado() {
        selfig = 2;
        Rectangle2D.Double rect;
        shape = rect = new Rectangle2D.Double(defX, defY, defW, defH);
        g2d.draw(rect);
        is_cylinder = false;
    }

    private void drawCilindro() {
        selfig = 3;
        cylinder = new Cylinder2D();
        cylinder.draw();
        is_cylinder = true;
    }

    public void clearScreen() {
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, panel.getWidth(), panel.getHeight());
        g2d.setColor(colorFill);
    }

    public void redraw() {
        switch (selfig) {
            case 1 ->
                drawCirculo();
            case 2 ->
                drawCuadrado();
            case 3 ->
                drawCilindro();
        }
        if (!is_cylinder) {
            if (!is_deg && !is_texture) {
                g2d.setColor(colorFill);
            } else {
                g2d.setPaint(gpglobal);
            }
            g2d.fill(shape);
            g2d.setColor(colorStroke);
            g2d.draw(shape);
        } else {
            if (!is_deg && !is_texture) {
                g2d.setColor(colorFill);
            } else {
                g2d.setPaint(gpglobal);
            }
            cylinder.fill();
            g2d.setColor(colorStroke);
            cylinder.draw();
        }
    }

    private class Cylinder2D {

        Ellipse2D.Double tapa, base;
        Rectangle2D.Double rect;

        Cylinder2D() {
            tapa = new Ellipse2D.Double(defX, defY, 100, 40);
            base = new Ellipse2D.Double(defX, defY + 200, 100, 40);
            rect = new Rectangle2D.Double(defX, defY + (0.1f * defY), 100, defH);
        }

        public void draw() {
            g2d.draw(tapa);
            g2d.draw(base);
            g2d.draw(rect);
        }

        public void fill() {
            g2d.fill(tapa);
            g2d.fill(base);
            g2d.fill(rect);
        }
    }

}
