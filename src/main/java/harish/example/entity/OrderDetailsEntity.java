package harish.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_details")
public class OrderDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderSeq")
    @SequenceGenerator(name = "orderSeq", sequenceName = "order_sequence", allocationSize = 1)
    @Column(name = "orderid")
    private int orderId;
    @Column(name = "eid")
    private int employeeId;
   @Column(name = "product")
    private String productName;
    @Column(name = "price")
    private String price;
}
