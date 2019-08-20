package com.woniu.woniuticket.user.pojo;

public class Wallet {
    private Integer walletId;

    private Integer userId;

    private Long resAmount;

    public Integer getWalletId() {
        return walletId;
    }

    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getResAmount() {
        return resAmount;
    }

    public void setResAmount(Long resAmount) {
        this.resAmount = resAmount;
    }
}