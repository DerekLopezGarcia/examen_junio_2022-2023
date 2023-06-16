package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.BankAccount;

public class addBankAccountUseCase {
    private BankAccountRepository bankAccountRepository;
    public addBankAccountUseCase(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    public void execute(BankAccount bankAccount) {
        bankAccountRepository.saveBankAccount(bankAccount);
    }
}
