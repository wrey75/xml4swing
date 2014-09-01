package com.oxande.jcompta;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Runnable;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * Class created automatically -- DO NOT UPDATE MANUALLY.
 * This class has been created based on a XML file and must
 * be extended by your own code. The following code only
 * provide an easy way to obtain a basic GUI.
 */
public class AbstractAccountDialog extends JDialog {
   private JPanel jpanel1 = new JPanel();
   private JPanel jpanel2 = new JPanel();
   private JLabel jlabel1 = new JLabel();
   private JTextField jtextfield1 = new JTextField();
   private JLabel jlabel2 = new JLabel();
   private JTextField jtextfield2 = new JTextField();
   private JLabel jlabel3 = new JLabel();
   private JPanel jpanel3 = new JPanel();
   private JButton jbutton1 = new JButton();
   private JButton jbutton2 = new JButton();
private class SetAccountIdClass implements Runnable {
      private String input;

      public  SetAccountIdClass(String input)
      {
         this.input = input;
      }

      public void run()
      {
         jtextfield1.setText(String.valueOf(input));
      }
}

private class SetAccountLabelClass implements Runnable {
      private String input;

      public  SetAccountLabelClass(String input)
      {
         this.input = input;
      }

      public void run()
      {
         jtextfield2.setText(String.valueOf(input));
      }
}


   public void setAccountId(String in)
   {
      SwingUtilities.invokeLater(new SetAccountIdClass(in));
   }

   public String getAccountId()
   {
      return jtextfield1.getText();
   }

   public void setAccountLabel(String in)
   {
      SwingUtilities.invokeLater(new SetAccountLabelClass(in));
   }

   /**
    * Called by the menu item <i>OK</i>.
    */
   protected void submit()
   {
      JOptionPane.showMessageDialog(jbutton1, "Not implemented.",jbutton1.getText(), JOptionPane.INFORMATION_MESSAGE);
   }

   public void initComponents()
   {
      jpanel1.setLayout(new BorderLayout());
      GridBagLayout layout1 = new GridBagLayout();
      GridBagConstraints c1 = new GridBagConstraints();
      jpanel2.setLayout(layout1);
      
      jlabel1.setText("ID:");
      c1.gridy = 0;
      c1.gridx = 0;
      c1.gridheight = 1;
      c1.gridwidth = 1;
      c1.anchor = GridBagConstraints.WEST;
      c1.fill = GridBagConstraints.NONE;
      c1.weightx = 1;
      layout1.setConstraints(jlabel1, c1);
      jpanel2.add(jlabel1);
      
      jtextfield1.setColumns(15);
      c1.gridy = 0;
      c1.gridx = 1;
      c1.gridheight = 1;
      c1.gridwidth = 1;
      c1.anchor = GridBagConstraints.WEST;
      c1.fill = GridBagConstraints.NONE;
      c1.weightx = 1;
      layout1.setConstraints(jtextfield1, c1);
      jpanel2.add(jtextfield1);
      
      jlabel2.setText("Label:");
      c1.gridy = 1;
      c1.gridx = 0;
      c1.gridheight = 1;
      c1.gridwidth = 1;
      c1.anchor = GridBagConstraints.WEST;
      c1.fill = GridBagConstraints.NONE;
      c1.weightx = 1;
      layout1.setConstraints(jlabel2, c1);
      jpanel2.add(jlabel2);
      
      jtextfield2.setColumns(15);
      c1.gridy = 1;
      c1.gridx = 1;
      c1.gridheight = 1;
      c1.gridwidth = 1;
      c1.anchor = GridBagConstraints.WEST;
      c1.fill = GridBagConstraints.NONE;
      c1.weightx = 1;
      layout1.setConstraints(jtextfield2, c1);
      jpanel2.add(jtextfield2);
      
      c1.gridy = 2;
      c1.gridx = 0;
      c1.gridheight = 1;
      c1.gridwidth = 1;
      c1.anchor = GridBagConstraints.WEST;
      c1.fill = GridBagConstraints.NONE;
      c1.weightx = 1;
      layout1.setConstraints(jlabel3, c1);
      jpanel2.add(jlabel3);
      
      jpanel3.setLayout(new FlowLayout());
      jbutton1.setText("OK");
      jbutton1.addActionListener(new ActionListener()  {

   public void actionPerformed(ActionEvent e)
   {
      submit();
   }
}

);
      jpanel3.add(jbutton1);
      jbutton2.setText("Cancel");
      jbutton2.addActionListener(new ActionListener()  {

   public void actionPerformed(ActionEvent e)
   {
      JOptionPane.showMessageDialog(jbutton2, "Not implemented.",jbutton2.getText(), JOptionPane.INFORMATION_MESSAGE);
   }
}

);
      jpanel3.add(jbutton2);
      c1.gridy = 2;
      c1.gridx = 1;
      c1.gridheight = 1;
      c1.gridwidth = 1;
      c1.anchor = GridBagConstraints.WEST;
      c1.fill = GridBagConstraints.NONE;
      c1.weightx = 1;
      layout1.setConstraints(jpanel3, c1);
      jpanel2.add(jpanel3);
      jpanel1.add(jpanel2, BorderLayout.CENTER);
      this.setContentPane(jpanel1);
      this.pack();
      this.setName("com.oxande.xmlswing.example.ledger.AbstractAccountDialog");
      this.setLocationByPlatform(true);
      this.setTitle("Dialog Test");
      this.setResizable(false);
      this.setModal(true);
   }

   public String getAccountLabel()
   {
      return jtextfield2.getText();
   }

   public static void main(String[] args)
   {
      AbstractAccountDialog appl = new AbstractAccountDialog();
      appl.initComponents();
      appl.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
      appl.setVisible(true);
   }
}

