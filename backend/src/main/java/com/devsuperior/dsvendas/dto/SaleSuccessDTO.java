package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSuccessDTO implements Serializable {
    private static final long seriaLVersionUID =1L;

    private String saleName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO(){
    }

    public SaleSuccessDTO(Seller seller, Long visited, Long deals){
        this.saleName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
