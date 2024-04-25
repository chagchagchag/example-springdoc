package io.chagchagchag.example.springdoc_example.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
  @Bean
  public OpenAPI openAPI(
      @Value("${springdoc.version}") String version
  ){
    Info info = new Info()
        .title("SpringDoc 예제 페이지")
        .version(version)
        .description("docs-springdoc 예제 페이지")
        .contact(
            new Contact()
                .name("chagchagchag")
                .email("chagchagchag.dev@gmail.com")
        );

    return new OpenAPI().info(info).components(new Components());
  }
}
