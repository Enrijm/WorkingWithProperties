package BS.Prprts;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
// @Component lo he hecho con otro modo que es @ConfigurationPropertiesScan en el main que scaneara Solo @configuationProperties
@ConfigurationProperties(prefix = "simple")

public class SimpleProperties {
    private String text;
    private  int number;
}
