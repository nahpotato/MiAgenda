package miagenda;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import miagenda.views.MainFrame;

public class MiAgenda {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            
        }
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}
