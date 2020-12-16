package com.example.excel;

public class SinopecpayConfig {
	/** 服务端公钥 **/
//	private String serverPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi5mCbH2aTVlyYET8AE8FX7c4Wa8Iu13wJ6qp36zfb3E/bnaFr7ZBOqPRowATlAOosvAaqv0mPZe4xnQLyRkSBWeWO4NGZSqwRAvwY2uMHRJtrfuLDl8pdwtnOp6C9owsMFS3ZcM3FhisMgiEK8+6LvK3Owrp1+wrdHXx3XQ6KxlxWMZDx6LVqbEtMRlpl0ViLJzEzAMWEgQgED2SWJ4boY9lIlBzeCt5WApbruHTtZJIsMY9qaIF/pWTaP2ooKwGtuXt3hE6+RwHVu4wovQtYtiSBnqSPOHoQ5GS5P4kEzyGH4EhbrLFAxOM504Ssp6w5dhA0OtJMQB6SgHaergyuwIDAQAB";
	/** 2020-10-15 金科平台更新 **/
	private String serverPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAycYejanNKPEyRdSGR01Fe860AB7ojcUwzs2hw24OsfX7mPrP2/J8df3BS3rRCWa03oQKb8/6L2bS4YppA5jhHRHrsnRBbCtkfgJWOuJuHMUWZ1N76gWXxCWPjfHRCRV/hYrKgJZSzMwLG/lb4syyfQULPzR5zTdAPFXlIfXGM3LDH9vS6JDxeWbYUhUnBumVtBEZoZMeklHa8DZHvIXdzR/W+iAwphkBqfHTTP8oSCWjz2KojjZKljjJBE+HQjug0teEYsL2h5PiFaa8AvxWWN7iUsNCh2YjgCeUQ4IybuuqjeG3XoE/GqmDF+mGI/xhC6iHFwUEwZ44gBWt8PVHvQIDAQAB/bnaFr7ZBOqPRowATlAOosvAaqv0mPZe4xnQLyRkSBWeWO4NGZSqwRAvwY2uMHRJtrfuLDl8pdwtnOp6C9owsMFS3ZcM3FhisMgiEK8+6LvK3Owrp1+wrdHXx3XQ6KxlxWMZDx6LVqbEtMRlpl0ViLJzEzAMWEgQgED2SWJ4boY9lIlBzeCt5WApbruHTtZJIsMY9qaIF/pWTaP2ooKwGtuXt3hE6+RwHVu4wovQtYtiSBnqSPOHoQ5GS5P4kEzyGH4EhbrLFAxOM504Ssp6w5dhA0OtJMQB6SgHaergyuwIDAQAB";
	/** 服务端地址 **/
//	private String serverUrl = "http://10.248.65.31/scfp-mfront-webapp/mfront/mchtPay/"; // 10.248.65.124
	/** 2020-10-15 金科平台更新 **/
	private String serverUrl = "http://10.248.132.146/scfp-mfront-webapp/mfront/mchtPay/"; // 10.248.65.124
	
	private String statmentUrl = "http://10.248.65.31/scfp-mfront-webapp/mfront/mchtBill/";
	/** 商旅商户号 **/
	private String merchantNo = "820200908000001";
	/** 商户公钥 **/
	private String merchantPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC0w3HuJgWP3F2prSEHAHzmQkxWUGTJZLV3I0hu7DFLvDPIcfEg3OhfJWx7TEssc3F0VycHOw8r2TT04VE9nJJitP+Z1nejD6SuD4b8MUXyL+8G4YYAvs53h/HrBe+hinGR3IopI2htiwRp6+ycoEf1mqNyYtaRfwfFl6JNAUmOlwIDAQAB";
	/** 商户私钥 **/
	private String merchantPrivateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALTDce4mBY/cXamt" + "IQcAfOZCTFZQZMlktXcjSG7sMUu8M8hx8SDc6F8lbHtMSyxzcXRXJwc7DyvZNPTh"
			+ "UT2ckmK0/5nWd6MPpK4PhvwxRfIv7wbhhgC+zneH8esF76GKcZHciikjaG2LBGnr" + "7JygR/Wao3Ji1pF/B8WXok0BSY6XAgMBAAECgYEArCv0WlbQuWO1uqVybc7jKBZB"
			+ "y3yrYr+PsDhlB3HkyjQqRmNwvlJq6iUlHJNgjqguihdwzwxLuQIb1Jq/3KVDLzM5" + "O1KRR451As/A8HHpyU5LHsgUJsaLsFuldFjks9PmK9S6aUyiTanxfb3hYnpXe0OX"
			+ "H0CIBCPXx/wYqBjfOzECQQDcZbuJ8O1EL9Mjy3Nn/jtf++ilRqv8rUOsfLmvPH6n" + "LemE7au1jLGjKT4fPd+6oCYebT0w37e/UqHaQZgox8pbAkEA0fay83By4cnwoQcR"
			+ "Yf8ivsW/Q9KKlBrkLvcscMU2B4B0I7b5kNFhrhl1zX1uyc8gG9msxuljUT18cHJE" + "QWypdQJAI81K16+Re2AhdlEYYC5GSuNK+X4vdg5XTe+84iB7moC0zGknWYiPWqfa"
			+ "dYzBiTl2t76bEBNnb+bmb+Pz6bv6vQJAd2tkTtfHT6rG5R+bAGzXuz/H0HCAh0pg" + "PGIzcZSJbWzfIa0hdv/QGfC7MvxDth7LeWuuPJhj98IL8/zZ24hNPQJAMUb/UvjB"
			+ "+DCGA8jw9yrjTgOXe8QqKS0YcCEiT+PzzTJt01g9kewMKLG8/2Ud4KGDdf9f95CR" + "UonCweMyrGCaFg==";
	/** 接口版本号 **/
	private String serverTinVersion = "1.0.0";
	/** 后端支付通知地址 **/
	private String paySucessBackUrl;

	public String getServerUrl() {
		return serverUrl;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getMerchantPublicKey() {
		return merchantPublicKey;
	}

	public String getMerchantPrivateKey() {
		return merchantPrivateKey;
	}

	public void setMerchantPublicKey(String merchantPublicKey) {
		this.merchantPublicKey = merchantPublicKey;
	}

	public void setMerchantPrivateKey(String merchantPrivateKey) {
		this.merchantPrivateKey = merchantPrivateKey;
	}

	public String getServerPublicKey() {
		return serverPublicKey;
	}

	public void setServerPublicKey(String serverPublicKey) {
		this.serverPublicKey = serverPublicKey;
	}

	public String getServerTinVersion() {
		return serverTinVersion;
	}

	public void setServerTinVersion(String serverTinVersion) {
		this.serverTinVersion = serverTinVersion;
	}

	public String getPaySucessBackUrl() {
		return paySucessBackUrl;
	}

	public void setPaySucessBackUrl(String paySucessBackUrl) {
		this.paySucessBackUrl = paySucessBackUrl;
	}

	public String getStatmentUrl() {
		return statmentUrl;
	}

	public void setStatmentUrl(String statmentUrl) {
		this.statmentUrl = statmentUrl;
	}
}
