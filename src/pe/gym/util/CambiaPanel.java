/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author Carlos
 */
public class CambiaPanel {

    private JDesktopPane container;
    private JInternalFrame content;
//    private JPanel content;

    /**
     * Constructor de clase
     */
    public CambiaPanel(JDesktopPane container, JInternalFrame content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();

        this.container.add(this.content);
        this.content.setVisible(true);
        this.content.setSize(this.container.getWidth(), this.container.getHeight());
        this.container.revalidate();
        this.container.repaint();

    }
}
