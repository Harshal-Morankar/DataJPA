package com.csi.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private int productId;
    private String productName;
    private double productPrice;
    @JsonFormat(pattern = "dd-MM-yyyy", timezone ="Asia/Kolkata")
    @Temporal(TemporalType.DATE)
    private Date productLaunchDate;

}
