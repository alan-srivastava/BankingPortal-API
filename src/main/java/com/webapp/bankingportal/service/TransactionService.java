package com.webapp.bankingportal.service;

import java.time.LocalDate;
import java.util.List;

import com.webapp.bankingportal.dto.TransactionDTO;

public interface TransactionService {

	List<TransactionDTO> getAllTransactionsByAccountNumber(String accountNumber);
	void sendBankStatementByEmail(String accountNumber);

	/**
	 * Returns transactions for the given account that occurred between
	 * startDate (inclusive) and endDate (inclusive).
	 */
	List<TransactionDTO> getTransactionsByDateRange(
			String accountNumber, LocalDate startDate, LocalDate endDate);

}