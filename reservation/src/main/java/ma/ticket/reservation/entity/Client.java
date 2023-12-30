package ma.ticket.reservation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private Long idClient;
    private String nom;
    private String prenom;
    private String tel;
    private String email;
}
