package com.forexcard.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class ForexCard {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardNumber;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private String status;
    private BigDecimal maxLimit;
    private BigDecimal amount;
    private Integer pin;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "forexCard")
    private List<Transaction> transactions;
    
    

	public ForexCard() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ForexCard(Long id, String cardNumber, LocalDate issueDate, LocalDate expiryDate, String status,
			BigDecimal maxLimit, BigDecimal amount, Integer pin, User user, List<Transaction> transactions) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.status = status;
		this.maxLimit = maxLimit;
		this.amount = amount;
		this.pin = pin;
		this.user = user;
		this.transactions = transactions;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCardNumber() {
		return cardNumber;
	}



	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}



	public LocalDate getIssueDate() {
		return issueDate;
	}



	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}



	public LocalDate getExpiryDate() {
		return expiryDate;
	}



	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public BigDecimal getMaxLimit() {
		return maxLimit;
	}



	public void setMaxLimit(BigDecimal maxLimit) {
		this.maxLimit = maxLimit;
	}



	public BigDecimal getAmount() {
		return amount;
	}



	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}



	public Integer getPin() {
		return pin;
	}



	public void setPin(Integer pin) {
		this.pin = pin;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public List<Transaction> getTransactions() {
		return transactions;
	}



	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}



	@Override
	public String toString() {
		return "ForexCard [id=" + id + ", cardNumber=" + cardNumber + ", issueDate=" + issueDate + ", expiryDate="
				+ expiryDate + ", status=" + status + ", maxLimit=" + maxLimit + ", amount=" + amount + ", pin=" + pin
				+ ", user=" + user + ", transactions=" + transactions + "]";
	}
	
	
    
   
}
