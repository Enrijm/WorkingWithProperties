package BS.Prprts;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.unit.DataSize;

import java.time.Duration;
import java.time.Period;


@ConfigurationProperties(prefix = "converted")
@Data

public class ConversionProperties {
    private Duration duration;
    private Period period;
    private DataSize dataSize;
    private CustomProperty customProperty;
}
