package com.oxande.jcompta;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.UnsupportedOperationException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Class created automatically -- DO NOT UPDATE MANUALLY.
 * This class has been created based on a XML file and must
 * be extended by your own code. The following code only
 * provide an easy way to obtain a basic GUI.
 */
public class AbstractLedgerFrame extends JFrame {
   private JPanel jpanel1 = new JPanel();
   private JMenuBar jmenubar1 = new JMenuBar();
   private JMenu jmenu1 = new JMenu();
   private JMenuItem jmenuitem1 = new JMenuItem();
   private JMenu jmenu2 = new JMenu();
   private JMenuItem jmenuitem2 = new JMenuItem();
   private JMenu jmenu3 = new JMenu();
   private JMenuItem jmenuitem3 = new JMenuItem();
public class WindowAdapter1 extends java.awt.event.WindowAdapter {

      public void windowClosing(WindowEvent e)
      {
         onExit();
      }
}


   /**
    * Called by the menu item <i>Accounts/New account</i>.
    */
   protected void onNewAccount()
   {
      JOptionPane.showMessageDialog(jmenuitem2, "Not implemented.",jmenuitem2.getText(), JOptionPane.INFORMATION_MESSAGE);
   }

   /**
    * Called by the menu item <i>File/Exit</i>.
    */
   protected void onExit()
   {
      JOptionPane.showMessageDialog(jmenuitem1, "Not implemented.",jmenuitem1.getText(), JOptionPane.INFORMATION_MESSAGE);
   }

   public void initComponents()
   {
      jpanel1.setLayout(new BorderLayout());
      jmenu1.setText("File");
      jmenuitem1.setText("Exit");
      jmenuitem1.setAction(new AbstractAction()  {
   {
      putValue(Action.NAME, "Exit");
   }

   public void actionPerformed(ActionEvent e)
   {
      onExit();
   }
}

);
      jmenu1.add(jmenuitem1);
      jmenubar1.add(jmenu1);
      jmenu2.setText("Accounts");
      jmenu2.setMnemonic(java.awt.event.KeyEvent.VK_A);
      jmenu2.setDisplayedMnemonicIndex(0);
      jmenuitem2.setText("New account");
      jmenuitem2.setMnemonic(java.awt.event.KeyEvent.VK_N);
      jmenuitem2.setDisplayedMnemonicIndex(0);
      jmenuitem2.setAction(new AbstractAction()  {
   {
      putValue(Action.NAME, "New account");
      putValue(Action.MNEMONIC_KEY, java.awt.event.KeyEvent.VK_N);
      putValue(Action.DISPLAYED_MNEMONIC_INDEX_KEY, new Integer(0));
   }

   public void actionPerformed(ActionEvent e)
   {
      onNewAccount();
   }
}

);
      jmenu2.add(jmenuitem2);
      jmenubar1.add(jmenu2);
      jmenu3.setText("Help");
      jmenuitem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke("ctrl A"));
      jmenuitem3.setText("About...");
      jmenuitem3.setMnemonic(java.awt.event.KeyEvent.VK_A);
      jmenuitem3.setDisplayedMnemonicIndex(0);
      jmenuitem3.setAction(new AbstractAction()  {
   {
      putValue(Action.NAME, "About...");
      putValue(Action.MNEMONIC_KEY, java.awt.event.KeyEvent.VK_A);
      putValue(Action.DISPLAYED_MNEMONIC_INDEX_KEY, new Integer(0));
      putValue(Action.ACCELERATOR_KEY, jmenuitem3.getAccelerator());
   }

   public void actionPerformed(ActionEvent e)
   {
      JOptionPane.showMessageDialog(jmenuitem3, "Not implemented.",jmenuitem3.getText(), JOptionPane.INFORMATION_MESSAGE);
   }
}

);
      jmenu3.add(jmenuitem3);
      jmenubar1.add(jmenu3);
      this.setJMenuBar(jmenubar1);
      this.addWindowListener(new WindowAdapter1());
      jpanel1.add(Box.createGlue(), BorderLayout.CENTER);
      this.setContentPane(jpanel1);
      this.setName("com.oxande.xmlswing.example.ledger.AbstractLedgerFrame");
      this.setLocationByPlatform(true);
      this.setTitle("Ledger");
      this.pack();
   }

   public static void main(String[] args)
   {
      AbstractLedgerFrame appl = new AbstractLedgerFrame();
      appl.initComponents();
      appl.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
      appl.setVisible(true);
   }
}

