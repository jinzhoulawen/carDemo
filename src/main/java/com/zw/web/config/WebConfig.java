package com.zw.web.config;


import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.Controller;


import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableTransactionManagement

@Import({WebMvcAutoConfiguration.class})
@ComponentScan(
        value = "com.zw.web",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)
        })
public class WebConfig implements WebMvcConfigurer {

//	@Bean(name="stringToPageQuery")
//    public StringToPageQuery getStringToPageQuery() {
//    	return new StringToPageQuery();
//    }
//
//	@Bean(name="stringToMap")
//    public StringToMap getStringToMap() {
//    	return new StringToMap();
//    }

//	@Bean(name="conversionService")
//    public ConversionServiceFactoryBean getConversionService(StringToPageQuery stringToPageQuery,StringToMap stringToMap) {
//        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
//        Set<Converter> converters = new HashSet<Converter>();
//        converters.add(stringToPageQuery);
//        converters.add(stringToMap);
//        bean.setConverters(converters);
//        return bean;
//    }
//@Bean
//public StringToDateConverter stringToDateConverter() {
//    return new StringToDateConverter();
//}
//	@Bean
//	public HttpMessageConverter gsonConverters() {
//        GsonBuilder builder = GsonUtils.registerTypeAdapter(Json.class, new SpringfoxJsonToGsonAdapter());
//        return new GsonHttpMessageConverter(builder.create());
	//}

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedHeaders("*")
                        .allowedMethods("*")
                        .allowedOrigins("*")
                .allowCredentials(false).maxAge(3600)
                ;
            }
        };
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");

        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
