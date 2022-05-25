package BS.Prprts;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import javax.sql.rowset.serial.SerialStruct;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "nested")
@Data
@ConstructorBinding
public class NestedProperties {
    private final List<String> strings;
    private final Map<String , String> dictionary;
    private final Item item;
}
