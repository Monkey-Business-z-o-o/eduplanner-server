package ai.timefold.solver.spring.boot.autoconfigure;

import ai.timefold.solver.core.config.solver.SolverConfig;
import java.lang.String;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TimefoldSolverAotFactory}.
 */
@Generated
public class TimefoldSolverAotFactory__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'timefoldSolverAotFactory'.
   */
  public static BeanDefinition getTimefoldSolverAotFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimefoldSolverAotFactory.class);
    beanDefinition.setInstanceSupplier(TimefoldSolverAotFactory::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'getSolverConfig'.
   */
  private static BeanInstanceSupplier<SolverConfig> getGetSolverConfigInstanceSupplier() {
    return BeanInstanceSupplier.<SolverConfig>forFactoryMethod(TimefoldSolverAotFactory.class, "solverConfigSupplier", String.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TimefoldSolverAotFactory.class).solverConfigSupplier(args.get(0)));
  }

  /**
   * Get the bean definition for 'getSolverConfig'.
   */
  public static BeanDefinition getGetSolverConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SolverConfig.class);
    beanDefinition.setTargetType(SolverConfig.class);
    beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("<?xml version=\"1.0\" encoding=\"UTF-8\"?><solver>\n"
            + "  <solutionClass>pl.edu.pjwstk.EduPlanner.domain.Timetable</solutionClass>\n"
            + "  <entityClass>pl.edu.pjwstk.EduPlanner.domain.Lesson</entityClass>\n"
            + "  <scoreDirectorFactory>\n"
            + "    <constraintProviderClass>pl.edu.pjwstk.EduPlanner.solver.TimetableConstraintProvider</constraintProviderClass>\n"
            + "  </scoreDirectorFactory>\n"
            + "  <termination>\n"
            + "    <spentLimit>PT30S</spentLimit>\n"
            + "  </termination>\n"
            + "</solver>\n");
    beanDefinition.setInstanceSupplier(getGetSolverConfigInstanceSupplier());
    return beanDefinition;
  }
}
