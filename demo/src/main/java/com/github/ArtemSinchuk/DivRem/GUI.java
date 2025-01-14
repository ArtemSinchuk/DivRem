package com.github.ArtemSinchuk.DivRem;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
  
  private JPanel mainPanel = new JPanel();
  private JLabel dividendLabel = new JLabel("Dividend");
  private JLabel divisorLabel = new JLabel("Divisor");
  private JLabel quotientLabel = new JLabel("Result");
  private JTextField dividendField = new JTextField(10);
  private JTextField divisorField = new JTextField(10);
  private JButton calculateButton = new JButton("Calculate");

  public GUI() {
    runGUI();
  }

  private void runGUI() {
    frameConf();
    labelConf();
    textFieldConf();
    buttonConf();
    addComponents();
  }

  private void frameConf() {
    setTitle("DivRem");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 100);
    setLayout(new GridLayout());
    setLocationRelativeTo(null);
    setVisible(true);
  }

  public void panelConf() {
    mainPanel.setLayout(new GridLayout(3, 2));
    mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
  }

  private void labelConf() {

  }

  private void textFieldConf() {
    dividendField.setSize(75, 30);
  }

  private void buttonConf() {

  }

  private void addComponents() {
    add(mainPanel);
    mainPanel.add(dividendLabel);
    mainPanel.add(dividendField);
    mainPanel.add(divisorLabel);
    mainPanel.add(divisorField);
    mainPanel.add(quotientLabel);
    mainPanel.add(calculateButton);
  }

  public static void main(String[] args) {
    new GUI();
  }
}
