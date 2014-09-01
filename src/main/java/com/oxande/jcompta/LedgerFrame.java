package com.oxande.jcompta;



/**
 */
public class LedgerFrame extends AbstractLedgerFrame {

	@Override
	public void onExit(){
		System.exit(0);
	}
	
	@Override
	public void onNewAccount(){
		AccountDialog.inputNewAccount();
	}
	
	public static void main(String[] args) {
		LedgerFrame appl = new LedgerFrame();
		appl.initComponents();
		appl.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		appl.setVisible(true);
	}
}
