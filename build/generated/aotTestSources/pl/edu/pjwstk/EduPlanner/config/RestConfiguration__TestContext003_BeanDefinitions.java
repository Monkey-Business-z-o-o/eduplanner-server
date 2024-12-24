package pl.edu.pjwstk.EduPlanner.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link RestConfiguration}.
 */
@Generated
public class RestConfiguration__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'restConfiguration'.
   */
  public static BeanDefinition getRestConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestConfiguration.class);
    beanDefinition.setTargetType(RestConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(RestConfiguration.class);
    beanDefinition.setInstanceSupplier(RestConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
