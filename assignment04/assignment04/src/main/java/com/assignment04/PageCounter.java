package com.assignment04;

import lombok.Data;

@Data
public class PageCounter {
    private Integer pageCounter = 0;

    public void incrementPageCounter(){
        this.pageCounter++ ;
    }
}
