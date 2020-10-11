package se.lexicon.romeobot.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration

@ComponentScan({
        "se.lexicon.romeobot.data_access",
        "se.lexicon.romeobot.util",
        "se.lexicon.romeobot.service"
})

public class ComponentScanConfig {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
