package com.microservices.bookmyshow.walletservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wallet {

	@Id
	@Column(name="wallet_id")
	private int walletId;
	
	@Column(name="wallet_type")
	private String walletType;
	
	@Column(name="wallet_name")
	private String walletName;
	
	@Column(name="userId")
	private int userId;
	
	public Wallet() {
		
	}
	
	public Wallet(int walletId, String walletType, String walletName, int userId) {
		super();
		this.walletId = walletId;
		this.walletType = walletType;
		this.walletName = walletName;
		this.userId = userId;
	}

	public int getWalletId() {
		return walletId;
	}

	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}

	public String getWalletType() {
		return walletType;
	}

	public void setWalletType(String walletType) {
		this.walletType = walletType;
	}

	public String getWalletName() {
		return walletName;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
