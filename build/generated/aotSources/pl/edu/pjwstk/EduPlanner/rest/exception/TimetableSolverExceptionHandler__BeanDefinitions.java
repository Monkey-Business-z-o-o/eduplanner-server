package pl.edu.pjwstk.EduPlanner.rest.exception;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TimetableSolverExceptionHandler}.
 */
@Generated
public class TimetableSolverExceptionHandler__BeanDefinitions {
  /**
   * Get the bean definition for 'timetableSolverExceptionHandler'.
   */
  public static BeanDefinition getTimetableSolverExceptionHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimetableSolverExceptionHandler.class);
    beanDefinition.setInstanceSupplier(TimetableSolverExceptionHandler::new);
    return beanDefinition;
  }
}
