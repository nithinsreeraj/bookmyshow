package com.microservices.bookmyshow.walletservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {
	public List<Wallet> findByUserId(int userId);

}
