package SimpleConstructorDependencyInjectionTest;

import Common.Warrior;
import myinjector.MyInjector;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class SimpleConstructorDependencyInjection {

    @Test
    public void constructorDependencyInjection(){
        MyInjector myInjector = new MyInjector(new BindingService());
        Warrior warrior = myInjector.get(Warrior.class);
        assertThat(warrior.getWeapon(), instanceOf(Sword.class));
    }

}
