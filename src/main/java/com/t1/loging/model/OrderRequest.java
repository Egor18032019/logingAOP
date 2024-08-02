package com.t1.loging.model;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    String userName;
    String description;
    String status;
}
