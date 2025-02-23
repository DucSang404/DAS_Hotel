package com.dashotel.hotelmanagement.entity.peple;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "admin")
public class AdminEntity extends UserEntity {
}
