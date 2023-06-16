package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.BankAccount;

public class getBankAccountUseCase {
    private BankAccountRepository bankAccountRepository;
    public getBankAccountUseCase(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    public BankAccount execute(Integer id) {
        return bankAccountRepository.findById(id);
    }
}
