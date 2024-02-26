package com.picpaysimplificado.domain.transaction;

import com.picpaysimplificado.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "transactions")
@Entity(name = "transactions")
public class transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

    private LocalDateTime timeStamp;

}
