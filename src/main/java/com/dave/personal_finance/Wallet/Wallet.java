package com.dave.personal_finance.Wallet;

import javax.persistence.*;

import com.dave.personal_finance.Account.Account;

@Entity
@Table(name="wallet")
public class Wallet {
    
    @Id
    @SequenceGenerator(
        name = "wallet_sequence",
        sequenceName = "wallet_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "wallet_sequence"
    )
    private Long id;
    @ManyToOne
    @JoinColumn(
        name = "account_id",
        nullable = false
    )
    private Account account;
    private String name;

    public Wallet(){}

    public Wallet(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account){
        this.account = account;
    }
}
