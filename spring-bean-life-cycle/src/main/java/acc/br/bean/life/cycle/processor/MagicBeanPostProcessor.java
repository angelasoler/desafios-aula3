package acc.br.bean.life.cycle.processor;

import org.springframework.beans.factory.config.BeanPostProcessor;

import acc.br.bean.life.cycle.beans.Character;
import acc.br.bean.life.cycle.beans.Item;
import acc.br.bean.life.cycle.beans.Weapon;

public class MagicBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof Character) {
            System.out.println("5. BeanPostProcessor: Adding a touch of magic to " + ((Character) bean).getName());
        } else if (bean instanceof Weapon) {
            System.out.println("5. BeanPostProcessor: Enchanting the weapon: " + ((Weapon) bean).getName());
        } else if (bean instanceof Item) {
            System.out.println("5. BeanPostProcessor: Infusing magic into the item: " + ((Item) bean).getName());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof Character) {
            System.out.println("9. BeanPostProcessor: Magic continues for " + ((Character) bean).getName());
        } else if (bean instanceof Weapon) {
            System.out.println("9. BeanPostProcessor: The weapon " + ((Weapon) bean).getName() + " gleams with magic.");
        } else if (bean instanceof Item) {
            System.out.println("9. BeanPostProcessor: The item " + ((Item) bean).getName() + " is now magically empowered.");
        }
        return bean;
    }
}
