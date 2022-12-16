package com.example.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.handler.predicate.HeaderRoutePredicateFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator routes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("nothing", r -> r.path("/highschools/**")
//                        .filters(f -> f )
//                        .uri("https://localhost:8080/"))
//                .build();
//    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/highschools/**")
                        .and()
                        .header("highSchoolsToken","highSchoolsTokenValue")
                        .uri("lb://HIGH-SCHOOL-SERVICE"))
                .route(p -> p
                        .path("/programs/**")
                        .and()
                        .header("programsToken","programsTokenValue")
                        .uri("lb://PROGRAM-SERVICE"))
                .build();
    }


}


