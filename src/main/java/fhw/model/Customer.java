package fhw.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer        
{
    private Long id; 
    private Long bankId; 
    private String firstName; 
    private String lastName; 
    private Long version; 
}
