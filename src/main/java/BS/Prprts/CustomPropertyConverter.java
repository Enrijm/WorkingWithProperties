package BS.Prprts;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Component;

//@Data
@Component
@ConfigurationPropertiesBinding
public class CustomPropertyConverter implements Converter<String,CustomProperty> {
    //@Override
    public  CustomProperty convert(String s) {
        final String [] fields =s.split(",");
        return new CustomProperty(fields[0],Boolean.valueOf(fields[1]));
    }

    //    @Override
//    public CustomProperty convert (String s) {
//        final String[] fields = s.split(",");
//
//        return new CustomProperty(fields[0],Boolean.valueOf(fields[1]));
//    }
}
