/*
package kakaoLoginTest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorResourceFactory;

import java.net.http.HttpClient;

@Configuration
public class WebClientConfig {
    @Bean
    public ReactorResourceFactory resourceFactory(){
        ReactorResourceFactory factory = new ReactorResourceFactory();
        factory.setUseGlobalResources(false);

        return factory;
    }

    @Bean
    public WebClient webClient(){
        Function<HttpClient, HttpClient> mapper = client -> HttpClient.create()
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 1000)
                .doOnConnected(connection -> connection.addHandlerLast(new ReadTimeoutHandler(10))
                        .addHandlerLast(new WriteTimeoutHandler(10)))
                .responseTimeout(Duration.ofSeconds(1));

        ClientHttpConnector connector =
                new ReactorClientHttpConnector(resourceFactory(), mapper);
        return WebClient.builder().clientConnector(connector).build();
    }
}

*/