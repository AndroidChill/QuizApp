// Generated by Dagger (https://dagger.dev).
package work.sample.navigation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ResultContainer_Factory implements Factory<ResultContainer> {
  @Override
  public ResultContainer get() {
    return newInstance();
  }

  public static ResultContainer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ResultContainer newInstance() {
    return new ResultContainer();
  }

  private static final class InstanceHolder {
    private static final ResultContainer_Factory INSTANCE = new ResultContainer_Factory();
  }
}
