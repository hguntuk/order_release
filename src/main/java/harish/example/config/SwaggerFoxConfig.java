package harish.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "application", name = "swagger3.enabled")
public class SwaggerFoxConfig {
    @Bean
    public OpenAPI springOpenApi(){
        Contact contact = new Contact()
                .email("guntukharry@gamil.com")
                .name("Order Swagger")
                .url("harish.example");

        Info info = new Info()
                .title("Order Details")
                .contact(contact)
                .description("Swagger for Employee");
        return new OpenAPI().info(info);
    }

}
