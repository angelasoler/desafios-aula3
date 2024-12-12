package acc.br.bean.life.cycle.config;

import acc.br.bean.life.cycle.beans.Item;
import acc.br.bean.life.cycle.processor.MagicBeanPostProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ItemConfig {
    @Bean
    public Item potion() {
        return new Item("Health Potion");
    }
}
