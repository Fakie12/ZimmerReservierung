package com.projekt1.zimmerreservierung.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="authorities", uniqueConstraints = {
        @UniqueConstraint(columnNames = "role")
})
@NoArgsConstructor
@Getter
@Setter
public class Authority {
    @Id
    @GeneratedValue
    private Long authorityId;

    private String role;
}
