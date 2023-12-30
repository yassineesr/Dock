package ma.ticket.reservation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private Long idEvent;
    private String nom;
    private String lieu;
    private String description;
    private String type;
    private Long nbTicket;
    private double prix;
    private LocalDate date;

}
