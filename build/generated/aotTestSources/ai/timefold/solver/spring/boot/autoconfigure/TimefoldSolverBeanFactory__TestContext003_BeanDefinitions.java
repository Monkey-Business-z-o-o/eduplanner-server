package ai.timefold.solver.spring.boot.autoconfigure;

import ai.timefold.solver.core.api.score.ScoreManager;
import ai.timefold.solver.core.api.score.stream.ConstraintMetaModel;
import ai.timefold.solver.core.api.solver.SolutionManager;
import ai.timefold.solver.core.api.solver.SolverFactory;
import ai.timefold.solver.core.api.solver.SolverManager;
import ai.timefold.solver.test.api.score.stream.ConstraintVerifier;
import com.fasterxml.jackson.databind.Module;
import java.lang.SuppressWarnings;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link TimefoldSolverBeanFactory}.
 */
@Generated
public class TimefoldSolverBeanFactory__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'timefoldSolverBeanFactory'.
   */
  public static BeanDefinition getTimefoldSolverBeanFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimefoldSolverBeanFactory.class);
    beanDefinition.setTargetType(TimefoldSolverBeanFactory.class);
    ConfigurationClassUtils.initializeConfigurationClass(TimefoldSolverBeanFactory.class);
    beanDefinition.setInstanceSupplier(TimefoldSolverBeanFactory$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'getBanner'.
   */
  private static BeanInstanceSupplier<TimefoldSolverBannerBean> getGetBannerInstanceSupplier() {
    return BeanInstanceSupplier.<TimefoldSolverBannerBean>forFactoryMethod(TimefoldSolverBeanFactory.class, "getBanner")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TimefoldSolverBeanFactory.class).getBanner());
  }

  /**
   * Get the bean definition for 'getBanner'.
   */
  public static BeanDefinition getGetBannerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimefoldSolverBannerBean.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getGetBannerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'getSolverFactory'.
   */
  private static BeanInstanceSupplier<SolverFactory> getGetSolverFactoryInstanceSupplier() {
    return BeanInstanceSupplier.<SolverFactory>forFactoryMethod(TimefoldSolverBeanFactory.class, "getSolverFactory")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TimefoldSolverBeanFactory.class).getSolverFactory());
  }

  /**
   * Get the bean definition for 'getSolverFactory'.
   */
  public static BeanDefinition getGetSolverFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SolverFactory.class);
    beanDefinition.setTargetType(ResolvableType.forClass(SolverFactory.class));
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getGetSolverFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'solverManager'.
   */
  private static BeanInstanceSupplier<SolverManager> getSolverManagerInstanceSupplier() {
    return BeanInstanceSupplier.<SolverManager>forFactoryMethod(TimefoldSolverBeanFactory.class, "solverManager", SolverFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TimefoldSolverBeanFactory.class).solverManager(args.get(0)));
  }

  /**
   * Get the bean definition for 'solverManager'.
   */
  public static BeanDefinition getSolverManagerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SolverManager.class);
    beanDefinition.setTargetType(ResolvableType.forClass(SolverManager.class));
    beanDefinition.setLazyInit(true);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getSolverManagerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'scoreManager'.
   */
  @SuppressWarnings("removal")
  private static BeanInstanceSupplier<ScoreManager> getScoreManagerInstanceSupplier() {
    return BeanInstanceSupplier.<ScoreManager>forFactoryMethod(TimefoldSolverBeanFactory.class, "scoreManager")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TimefoldSolverBeanFactory.class).scoreManager());
  }

  /**
   * Get the bean definition for 'scoreManager'.
   */
  @SuppressWarnings("removal")
  public static BeanDefinition getScoreManagerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ScoreManager.class);
    beanDefinition.setTargetType(ResolvableType.forClass(ScoreManager.class));
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getScoreManagerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'solutionManager'.
   */
  private static BeanInstanceSupplier<SolutionManager> getSolutionManagerInstanceSupplier() {
    return BeanInstanceSupplier.<SolutionManager>forFactoryMethod(TimefoldSolverBeanFactory.class, "solutionManager")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TimefoldSolverBeanFactory.class).solutionManager());
  }

  /**
   * Get the bean definition for 'solutionManager'.
   */
  public static BeanDefinition getSolutionManagerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SolutionManager.class);
    beanDefinition.setTargetType(ResolvableType.forClass(SolutionManager.class));
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getSolutionManagerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'constraintMetaModel'.
   */
  private static BeanInstanceSupplier<ConstraintMetaModel> getConstraintMetaModelInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ConstraintMetaModel>forFactoryMethod(TimefoldSolverBeanFactory.class, "constraintMetaModel")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TimefoldSolverBeanFactory.class).constraintMetaModel());
  }

  /**
   * Get the bean definition for 'constraintMetaModel'.
   */
  public static BeanDefinition getConstraintMetaModelBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ConstraintMetaModel.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConstraintMetaModelInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link TimefoldSolverBeanFactory.TimefoldConstraintVerifierConfiguration}.
   */
  @Generated
  public static class TimefoldConstraintVerifierConfiguration {
    /**
     * Get the bean instance supplier for 'ai.timefold.solver.spring.boot.autoconfigure.TimefoldSolverBeanFactory$TimefoldConstraintVerifierConfiguration'.
     */
    private static BeanInstanceSupplier<TimefoldSolverBeanFactory.TimefoldConstraintVerifierConfiguration> getTimefoldConstraintVerifierConfigurationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<TimefoldSolverBeanFactory.TimefoldConstraintVerifierConfiguration>forConstructor(ApplicationContext.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TimefoldSolverBeanFactory.class).new TimefoldConstraintVerifierConfiguration(args.get(0)));
    }

    /**
     * Get the bean definition for 'timefoldConstraintVerifierConfiguration'.
     */
    public static BeanDefinition getTimefoldConstraintVerifierConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(TimefoldSolverBeanFactory.TimefoldConstraintVerifierConfiguration.class);
      beanDefinition.setInstanceSupplier(getTimefoldConstraintVerifierConfigurationInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'constraintVerifier'.
     */
    private static BeanInstanceSupplier<ConstraintVerifier> getConstraintVerifierInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ConstraintVerifier>forFactoryMethod(TimefoldSolverBeanFactory.TimefoldConstraintVerifierConfiguration.class, "constraintVerifier")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TimefoldSolverBeanFactory.TimefoldConstraintVerifierConfiguration.class).constraintVerifier());
    }

    /**
     * Get the bean definition for 'constraintVerifier'.
     */
    public static BeanDefinition getConstraintVerifierBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ConstraintVerifier.class);
      beanDefinition.setTargetType(ResolvableType.forClass(ConstraintVerifier.class));
      beanDefinition.setLazyInit(true);
      beanDefinition.setInstanceSupplier(getConstraintVerifierInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link TimefoldSolverBeanFactory.TimefoldJacksonConfiguration}.
   */
  @Generated
  public static class TimefoldJacksonConfiguration {
    /**
     * Get the bean definition for 'timefoldJacksonConfiguration'.
     */
    public static BeanDefinition getTimefoldJacksonConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(TimefoldSolverBeanFactory.TimefoldJacksonConfiguration.class);
      beanDefinition.setInstanceSupplier(TimefoldSolverBeanFactory.TimefoldJacksonConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jacksonModule'.
     */
    private static BeanInstanceSupplier<Module> getJacksonModuleInstanceSupplier() {
      return BeanInstanceSupplier.<Module>forFactoryMethod(TimefoldSolverBeanFactory.TimefoldJacksonConfiguration.class, "jacksonModule")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TimefoldSolverBeanFactory.TimefoldJacksonConfiguration.class).jacksonModule());
    }

    /**
     * Get the bean definition for 'jacksonModule'.
     */
    public static BeanDefinition getJacksonModuleBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(Module.class);
      beanDefinition.setInstanceSupplier(getJacksonModuleInstanceSupplier());
      return beanDefinition;
    }
  }
}
