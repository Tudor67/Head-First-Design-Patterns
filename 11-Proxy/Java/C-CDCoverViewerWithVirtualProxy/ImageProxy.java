import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageProxy implements Icon {
    private ImageIcon imageIcon;
    private URL imageURL;
    private Thread retrievalThread;
    private boolean retrieving;

    public ImageProxy(URL url) {
        imageURL = url;
        retrieving = false;
    }

    public int getIconWidth() {
        if (imageIcon == null) {
            return 800;
        } else {
            return imageIcon.getIconWidth();
        }
    }

    public int getIconHeight() {
        if (imageIcon == null) {
            return 600;
        } else {
            return imageIcon.getIconHeight();
        }
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon == null) {
            g.drawString("Loading CD cover, please wait ...", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageURL);
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        } else {
            imageIcon.paintIcon(c, g, x, y);
        }
    }
}