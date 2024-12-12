package acc.br.bean.life.cycle.config;

import acc.br.bean.life.cycle.beans.Character;
import acc.br.bean.life.cycle.beans.Item;
import acc.br.bean.life.cycle.beans.Weapon;
import acc.br.bean.life.cycle.processor.MagicBeanPostProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CharacterConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Character character(Item potion, Weapon sword) {
        Character character = new Character();
        character.setItem(potion);
        character.setWeapon(sword);
        return character;
    }

    @Bean
    public MagicBeanPostProcessor magicBeanPostProcessor() {
        return new MagicBeanPostProcessor();
    }
}
