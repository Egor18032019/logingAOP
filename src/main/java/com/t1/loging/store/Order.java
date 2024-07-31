package com.t1.loging.store;

import com.t1.loging.store.base.AbstractBaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order extends AbstractBaseEntity {

    @Column()
    private String description;

    @Column()
    private String status; // todo enum сделать


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
