package org.springframework.boot.autoconfigure.hateoas;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HateoasProperties}.
 */
@Generated
public class HateoasProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'hateoasProperties'.
   */
  public static BeanDefinition getHateoasPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HateoasProperties.class);
    beanDefinition.setInstanceSupplier(HateoasProperties::new);
    return beanDefinition;
  }
}
