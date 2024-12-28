package pl.edu.pjwstk.EduPlanner.rest;

import ai.timefold.solver.core.api.solver.SolutionManager;
import ai.timefold.solver.core.api.solver.SolverManager;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TimetableController}.
 */
@Generated
public class TimetableController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'timetableController'.
   */
  private static BeanInstanceSupplier<TimetableController> getTimetableControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TimetableController>forConstructor(SolverManager.class, SolutionManager.class)
            .withGenerator((registeredBean, args) -> new TimetableController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'timetableController'.
   */
  public static BeanDefinition getTimetableControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimetableController.class);
    beanDefinition.setInstanceSupplier(getTimetableControllerInstanceSupplier());
    return beanDefinition;
  }
}
