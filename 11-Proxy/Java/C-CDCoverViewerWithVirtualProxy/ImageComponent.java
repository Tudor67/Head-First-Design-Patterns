import java.awt.*;
import javax.swing.*;

public class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (1200 - w) / 2;
        int y = (1000 - h) / 2;
        icon.paintIcon(this, g, x, y);
    }
}