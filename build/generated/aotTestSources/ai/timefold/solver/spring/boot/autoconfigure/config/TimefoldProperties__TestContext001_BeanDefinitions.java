package ai.timefold.solver.spring.boot.autoconfigure.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TimefoldProperties}.
 */
@Generated
public class TimefoldProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'timefoldProperties'.
   */
  public static BeanDefinition getTimefoldPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimefoldProperties.class);
    beanDefinition.setInstanceSupplier(TimefoldProperties::new);
    return beanDefinition;
  }
}
