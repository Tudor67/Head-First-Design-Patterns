import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Test {
    private ImageComponent imageComponent;
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu menu;
    private Hashtable cds;
    
    public static void main(String[] args) throws Exception {
        Test test = new Test();
    }

    public Test() throws Exception {
        cds = new Hashtable();
        cds.put("Nicki Minaj, The Pinkprint", "https://www.billboard.com/wp-content/uploads/2022/03/42.-Nicki-Minaj-%E2%80%98The-Pinkprint-2014-album-art-billboard-1240.jpg?w=1024");
        cds.put("Drake, If You're Reading ...", "https://www.billboard.com/wp-content/uploads/2022/03/22.-Drake-If-Youre-Reading-This-Its-Too-Late-2015-album-art-billboard-1240.jpg?w=1024");
        cds.put("Elvis Presley", "https://www.billboard.com/wp-content/uploads/2022/03/10.-Elvis-Presley-%E2%80%98Elvis-Presley-1956-album-art-billboard-1240.jpg?w=1140");
        cds.put("Pink Floyd, Dark Side of the Moon", "https://www.billboard.com/wp-content/uploads/2022/03/6.-Pink-Floyd-%E2%80%98Dark-Side-of-the-Moon-1973-album-art-billboard-1240.jpg?w=1024");
        cds.put("The Beatles, Abbey Road", "https://www.billboard.com/wp-content/uploads/2022/03/2.-The-Beatles-%E2%80%98Abbey-Road-1969-album-art-billboard-1240.jpg?w=1024");

        frame = new JFrame("CD Cover Viewer");
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        URL initialURL = getCDUrl("Pink Floyd, Dark Side of the Moon");
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 1000);
        frame.setVisible(true);

        for (Enumeration e = cds.keys(); e.hasMoreElements();) {
            String name = (String)e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                    frame.repaint();
                }
            });
        }
    }

    public URL getCDUrl(String name) {
        try {
            return new URL((String)cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}