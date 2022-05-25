package BS.Prprts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ConfigurationPropertiesScan
public class AppProperties {

	@Autowired
	private SimpleProperties simpleProperties;

	@Autowired
	private InmutableProperties inmutableProperties;

	@Autowired
	private NestedProperties nestedProperties;

	public static void main(String[] args) {
		SpringApplication.run(AppProperties.class, args);
	}

	@PostConstruct
	private void postInit() {
//		System.out.println("Simple properties info...");
//		System.out.println(simpleProperties);
//		System.out.println("Inmutable properties info...");
//		System.out.println(inmutableProperties);
		System.out.println("Nested properties info...");
		System.out.println(nestedProperties);
	}

}
