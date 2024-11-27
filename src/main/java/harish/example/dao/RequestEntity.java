package harish.example.dao;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;


@Getter
@Setter
public class RequestEntity {
    private int employeeId;
}
