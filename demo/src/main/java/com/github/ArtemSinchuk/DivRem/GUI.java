package com.github.artemsinchuk.divRem;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {

  private JPanel mainPanel = new JPanel();
  private JLabel dividendLabel = new JLabel("Dividend");
  private JLabel divisorLabel = new JLabel("Divisor");
  private JLabel quotientLabel = new JLabel("Result: ");
  private JTextField dividendField = new JTextField(10);
  private JTextField divisorField = new JTextField(10);
  private JButton calculateButton = new JButton("Calculate");
  private GridLayout layout = new GridLayout(0, 1, 0, 0);
  private ImageIcon logo = new ImageIcon(getClass().getResource("/logo.png"));

  public void runGUI() {
    frameConf();
    panelConf();
    labelConf();
    textFieldConf();
    buttonConf();
    addComponents();
  }

  public void frameConf() {
    setTitle("DivRem");
    setIconImage(logo.getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 250);
    setLayout(new BorderLayout());
    setLocationRelativeTo(null);
    setVisible(true);
  }

  public void panelConf() {
    mainPanel.setLayout(layout);
    mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
  }

  public void labelConf() {}

  public void textFieldConf() {}

  public void buttonConf() {
    calculateButton.addActionListener(ActionListener -> {
      double dividend = Double.parseDouble(dividendField.getText());
      double divisor = Double.parseDouble(divisorField.getText());
      quotientLabel.setText(Division.divide(dividend, divisor));
    });
  }

  public void addComponents() {
    add(mainPanel);
    mainPanel.add(dividendLabel);
    mainPanel.add(dividendField);
    mainPanel.add(divisorLabel);
    mainPanel.add(divisorField);
    mainPanel.add(quotientLabel);
    mainPanel.add(calculateButton);
  }
}
