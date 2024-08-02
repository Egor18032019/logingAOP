package com.t1.loging.store;

import com.t1.loging.store.base.AbstractBaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbstractBaseEntity {
    @Column(unique = true)
    private String name;
    @Column()
    private String email;
    //Настройте связь между пользователями и их заказами (один ко многим).
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private List<Order> orders;
}
