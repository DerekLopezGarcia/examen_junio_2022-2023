package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.BankAccount;

public interface BankAccountRepository {
    public void saveBankAccount(BankAccount bankAccount);
    public BankAccount findById(Integer id);
}
