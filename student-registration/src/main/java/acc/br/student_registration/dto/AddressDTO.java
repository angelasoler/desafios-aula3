package acc.br.student_registration.dto;
import lombok.Data;

@Data
public class AddressDTO {
    private String cep;
    private String street;
    private String neighborhood;
    private String city;
    private String state;
}
