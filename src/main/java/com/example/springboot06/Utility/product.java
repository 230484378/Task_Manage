package com.example.springboot06.Utility;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.util.Date;

public class product {
    private Integer id;
    private String name;
    //    自定义数字格式化
    @NumberFormat(pattern = "#,###.#")
    private BigDecimal price;
    private Integer cid;
    //    格式化日期 自定义
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy.MM.dd")
    private Date date;

    public product() {
    }
}