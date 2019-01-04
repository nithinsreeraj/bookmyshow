package com.microservices.bookmyshow.walletservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

	@Autowired
	WalletRepository  walletRepo;
	
	@GetMapping("/{userId}/wallets")
	public List<Wallet> getMovies(@PathVariable int userId) {
		return walletRepo.findByUserId(userId);
	}
}
