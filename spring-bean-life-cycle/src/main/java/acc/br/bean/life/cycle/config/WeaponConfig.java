package acc.br.bean.life.cycle.config;

import acc.br.bean.life.cycle.beans.Weapon;
import acc.br.bean.life.cycle.processor.MagicBeanPostProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class WeaponConfig {
    @Bean
    public Weapon sword() {
        return new Weapon("Sword");
    }
}
