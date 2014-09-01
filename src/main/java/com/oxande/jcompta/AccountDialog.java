package com.oxande.jcompta;


/**
 */
public class AccountDialog extends AbstractAccountDialog {

	Account account = null;
	
	@Override
	public void submit(){
		account = new Account();
		account.setId( getAccountId() );
		account.setLabel( getAccountLabel() );
		setVisible(false);
	}
	
	public static Account inputNewAccount(){
		AccountDialog dlg = new AccountDialog();
		dlg.initComponents();
		dlg.setVisible(true);
		dlg.dispose();
		return dlg.account;
	}
}

