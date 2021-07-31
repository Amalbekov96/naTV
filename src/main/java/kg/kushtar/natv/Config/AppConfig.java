package kg.kushtar.natv.Config;

import com.fasterxml.classmate.TypeResolver;
import com.sun.nio.zipfs.ZipPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.AlternateTypeRules;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

@Configuration
@EnableSwagger2
public class AppConfig {
    private  TypeResolver typeResolver = new TypeResolver();

    Docket docket= new Docket(DocumentationType.SWAGGER_2)
            .alternateTypeRules( AlternateTypeRules.newRule(
                    typeResolver.resolve(Collection.class, Instant.class),
                    typeResolver.resolve(Collection.class, LocalDate.class), Ordered.HIGHEST_PRECEDENCE))
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.test"))
            .paths(PathSelectors.any())
            .build();
}
