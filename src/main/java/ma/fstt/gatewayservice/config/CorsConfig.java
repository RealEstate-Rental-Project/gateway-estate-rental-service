//package ma.fstt.gatewayservice.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.CorsWebFilter;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//@Configuration
//public class CorsConfig {
//
//    @Bean
//    public CorsWebFilter corsWebFilter() {
//        CorsConfiguration corsConfig = new CorsConfiguration();
//
//        // Origines autorisées
//        corsConfig.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//        // Ou pour plusieurs origines :
//        // corsConfig.setAllowedOrigins(Arrays.asList(
//        //     "http://localhost:4200",
//        //     "http://localhost:3000"
//        // ));
//
//        // Méthodes HTTP autorisées
//        corsConfig.setAllowedMethods(Arrays.asList(
//                "GET",
//                "POST",
//                "PUT",
//                "DELETE",
//                "OPTIONS",
//                "PATCH"
//        ));
//
//        // Headers autorisés
//        corsConfig.setAllowedHeaders(Arrays.asList("*"));
//
//        // Headers exposés au client
//        corsConfig.setExposedHeaders(Arrays.asList(
//                "Authorization",
//                "Content-Type",
//                "X-Total-Count",
//                "Access-Control-Allow-Origin",
//                "Access-Control-Allow-Credentials"
//        ));
//
//        // Permettre l'envoi de credentials (cookies, authorization headers)
//        corsConfig.setAllowCredentials(true);
//
//        // Durée de cache de la réponse preflight (en secondes)
//        corsConfig.setMaxAge(3600L);
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfig);
//
//        return new CorsWebFilter(source);
//    }
//}