package com.wookdongkang.s1.bankbook;

public class BankbookDTO {
	private long book_number;
	private String book_name;
	private double book_rate;
	private int book_sale;

	public long getBook_number() {
		return book_number;
	}

	public void setBook_number(long book_number) {
		this.book_number = book_number;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public double getBook_rate() {
		return book_rate;
	}

	public void setBook_rate(double book_rate) {
		this.book_rate = book_rate;
	}

	public int getBook_sale() {
		return book_sale;
	}

	public void setBook_sale(int book_sale) {
		this.book_sale = book_sale;
	}
}
