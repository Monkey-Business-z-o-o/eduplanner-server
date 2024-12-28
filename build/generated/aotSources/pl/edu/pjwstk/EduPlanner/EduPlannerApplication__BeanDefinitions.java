package pl.edu.pjwstk.EduPlanner;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link EduPlannerApplication}.
 */
@Generated
public class EduPlannerApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'eduPlannerApplication'.
   */
  public static BeanDefinition getEduPlannerApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EduPlannerApplication.class);
    beanDefinition.setTargetType(EduPlannerApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(EduPlannerApplication.class);
    beanDefinition.setInstanceSupplier(EduPlannerApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
