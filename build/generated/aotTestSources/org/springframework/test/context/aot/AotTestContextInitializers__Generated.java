package org.springframework.test.context.aot;

import java.lang.Class;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.springframework.aot.generate.Generated;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import pl.edu.pjwstk.EduPlanner.EduPlannerApplicationTests__TestContext001_ApplicationContextInitializer;
import pl.edu.pjwstk.EduPlanner.rest.TimetableControllerTest__TestContext002_ApplicationContextInitializer;
import pl.edu.pjwstk.EduPlanner.rest.TimetableEnvironmentTest__TestContext003_ApplicationContextInitializer;

/**
 * Generated mappings for {@link AotTestContextInitializers}.
 */
@Generated
public class AotTestContextInitializers__Generated {
  public static Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> getContextInitializers(
      ) {
    Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> map = new HashMap<>();
    map.put("pl.edu.pjwstk.EduPlanner.EduPlannerApplicationTests", () -> new EduPlannerApplicationTests__TestContext001_ApplicationContextInitializer());
    map.put("pl.edu.pjwstk.EduPlanner.solver.TimetableConstraintProviderTest", () -> new EduPlannerApplicationTests__TestContext001_ApplicationContextInitializer());
    map.put("pl.edu.pjwstk.EduPlanner.rest.TimetableControllerTest", () -> new TimetableControllerTest__TestContext002_ApplicationContextInitializer());
    map.put("pl.edu.pjwstk.EduPlanner.rest.TimetableEnvironmentTest", () -> new TimetableEnvironmentTest__TestContext003_ApplicationContextInitializer());
    return map;
  }

  public static Map<String, Class<? extends ApplicationContextInitializer<?>>> getContextInitializerClasses(
      ) {
    Map<String, Class<? extends ApplicationContextInitializer<?>>> map = new HashMap<>();
    map.put("pl.edu.pjwstk.EduPlanner.EduPlannerApplicationTests", EduPlannerApplicationTests__TestContext001_ApplicationContextInitializer.class);
    map.put("pl.edu.pjwstk.EduPlanner.solver.TimetableConstraintProviderTest", EduPlannerApplicationTests__TestContext001_ApplicationContextInitializer.class);
    map.put("pl.edu.pjwstk.EduPlanner.rest.TimetableControllerTest", TimetableControllerTest__TestContext002_ApplicationContextInitializer.class);
    map.put("pl.edu.pjwstk.EduPlanner.rest.TimetableEnvironmentTest", TimetableEnvironmentTest__TestContext003_ApplicationContextInitializer.class);
    return map;
  }
}
