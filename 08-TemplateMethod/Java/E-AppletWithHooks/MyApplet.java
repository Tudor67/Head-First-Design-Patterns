import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    String message;

    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    public void destroy() {
        // applet is going away...
    }

    public void paint(Graphics graphics) {
        graphics.drawString(message, 5, 15);
    }
}

/*
<applet code="MyApplet" width=300 height=100>
</applet>
*/