package com.github.artemsinchuk.divRem;

import javax.swing.SwingUtilities;

public class MainClass {
  public static void main(String[] args) {
    GUI application = new GUI();
    SwingUtilities.invokeLater(() -> application.runGUI());
    
  }
}
