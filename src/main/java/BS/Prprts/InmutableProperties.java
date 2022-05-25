package BS.Prprts;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
@Data
@ConfigurationProperties(prefix = "inmutable")
@ConstructorBinding // lo necesitamos para propiedades inmutables
public class InmutableProperties {
    private final String text;
    private final double number;
    private final String relaxBinding;
} // como son vbles.final no se usan Setter --> supongo que Lombok lo sabra jajajaja---> pues no se lo tenia que decir yo con @ConstructorBinding


