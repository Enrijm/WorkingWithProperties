package BS.Prprts;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

//@Data
@ConfigurationProperties(prefix = "custom")
public class CustomProperty {
    private String name;
    private boolean inmutable;


    public CustomProperty(String name, boolean inmutable) {
        this.name = name;
        this.inmutable = inmutable;
    }
}

