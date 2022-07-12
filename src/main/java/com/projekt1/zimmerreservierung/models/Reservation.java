package com.projekt1.zimmerreservierung.models;

import com.projekt1.zimmerreservierung.models.enums.ReservationStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue
    private Long reservationId;

    private Instant startDate;
    private Instant endDate;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;


    @ManyToOne
    @JoinColumn(name = "fk_bedroomId", referencedColumnName = "bedRoomId")
    private BedRoom bedRoom;

    @ManyToOne
    @JoinColumn(name = "fk_userId", referencedColumnName = "userId")
    private User user;
}
