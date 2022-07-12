package com.projekt1.zimmerreservierung.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bedrooms", uniqueConstraints = {
        @UniqueConstraint(columnNames = "numRoom")
})
@NoArgsConstructor
@Getter
@Setter
public class BedRoom {
    @Id
    @GeneratedValue
    private Long bedRoomId;

    private Long numRoom;
    private Integer level;
    private String desc;
    private Double price;
    private Integer bedCount;
}
