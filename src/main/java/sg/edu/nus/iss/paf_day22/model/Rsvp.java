package sg.edu.nus.iss.paf_day22.model;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rsvp {

    private int id;
    private String fullName;
    private String email;
    private String phone;
    private Date confirmationDate;
    private String comments;
    
}
