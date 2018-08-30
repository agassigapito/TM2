package my.com.tm.portal.asset.config;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import my.com.tm.portal.asset.constant.Constants;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
private static final String DEFAULT_INCLUDE_PATTERN = "/api/*";
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("asset-mgt-service")
					.select()
					.apis(RequestHandlerSelectors.basePackage("my.com.tm.portal.asset.controller"))
					.paths(PathSelectors.any())
					.build()
				.apiInfo(apiInfo())
				.securitySchemes(newArrayList(apiKey()))
		       .securityContexts(newArrayList(securityContext()));
	                
	}

	private ApiKey apiKey() {
		return new ApiKey(Constants.AUTHORIZATION_HEADER, Constants.AUTHORIZATION_HEADER , "header");
	}

	private SecurityContext securityContext() {
		return SecurityContext.builder()
				.securityReferences(defaultAuth())
				.forPaths(PathSelectors.regex(DEFAULT_INCLUDE_PATTERN))
				.build();
	}

	private List<SecurityReference> defaultAuth() {
		AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
		AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
		authorizationScopes[0] = authorizationScope;
		return newArrayList(new SecurityReference(Constants.AUTHORIZATION_HEADER, authorizationScopes));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("TM Asset Management Portal")
				.description("TM Asset Management Portal API")
				.termsOfServiceUrl("https://accenture.com")
				.license("Private License")
				.licenseUrl("jesserey.r.joseph@accenture.com")
				.version("1.0")
				.build();
	}
}
