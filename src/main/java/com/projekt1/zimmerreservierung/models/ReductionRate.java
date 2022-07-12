package com.projekt1.zimmerreservierung.models;


import com.projekt1.zimmerreservierung.models.enums.ClientType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "reductionRates")
@NoArgsConstructor
@Getter
@Setter
public class ReductionRate {
    @Id
    @GeneratedValue
    private Long reductionRateId;
    private Integer rate;

    @Enumerated(EnumType.STRING)
    private ClientType type;
}
