package com.dashotel.hotelmanagement.entity.account;

import com.dashotel.hotelmanagement.entity.AbstractEntity;
import com.dashotel.hotelmanagement.entity.peple.AdminEntity;
import com.dashotel.hotelmanagement.entity.peple.CustomerEntity;
import com.dashotel.hotelmanagement.entity.peple.OwnerEntity;
import com.dashotel.hotelmanagement.enums.AccountStatusEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class AccountEntity extends AbstractEntity {
    String username;
    String password;
    String role;
    AccountStatusEnum status;

    @OneToOne(mappedBy = "account")
    AdminEntity admin;

    @OneToOne(mappedBy = "account")
    CustomerEntity customer;

    @OneToOne(mappedBy = "account")
    OwnerEntity owner;

}
