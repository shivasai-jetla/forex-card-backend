package com.forexcard.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;
    private BigDecimal amount;
    private String merchant;
    private String status;

    @ManyToOne
    @JoinColumn(name = "cardId")
    private ForexCard forexCard;

    @ManyToOne
    @JoinColumn(name = "currency", cascade = CascadeType.ALL)
    private Currency currency;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(Long id, LocalDateTime date, BigDecimal amount, String merchant, String status,
			ForexCard forexCard, Currency currency) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.merchant = merchant;
		this.status = status;
		this.forexCard = forexCard;
		this.currency = currency;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ForexCard getForexCard() {
		return forexCard;
	}

	public void setForexCard(ForexCard forexCard) {
		this.forexCard = forexCard;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", date=" + date + ", amount=" + amount + ", merchant=" + merchant
				+ ", status=" + status + ", forexCard=" + forexCard + ", currency=" + currency + "]";
	}
    
    

}
