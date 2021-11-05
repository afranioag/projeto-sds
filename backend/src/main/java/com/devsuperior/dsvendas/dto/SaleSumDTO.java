package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {
    private static final long seriaLVersionUID =1L;

    private String saleName;
    private Double sum;

    public SaleSumDTO(){
    }

    public SaleSumDTO(Seller seller, Double sum){
        this.saleName = seller.getName();
        this.sum = sum;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
