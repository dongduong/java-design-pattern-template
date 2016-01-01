package com.dongduong.designpattern.adapter.example2;

public class XpayAdapterImpl implements XpayAdapter {

	@Override
	public PayD convertToPayD(Xpay xpay) {
		PayD payD = new PayDImpl();
		payD.setCardOwnerName(xpay.getCustomerName());
		payD.setCustCardNo(xpay.getCreditCardNo());
		payD.setCardExpMonthDate(xpay.getCardExpMonth()+"/"+xpay.getCardExpYear());
		payD.setCVVNo(xpay.getCardCVVNo().intValue());
		payD.setTotalAmount(xpay.getAmount());
		
		return payD;
	}

}
