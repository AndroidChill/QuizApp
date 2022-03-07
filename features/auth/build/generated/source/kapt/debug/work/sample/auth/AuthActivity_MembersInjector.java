// Generated by Dagger (https://dagger.dev).
package work.sample.auth;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import work.sample.navigation.Router;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthActivity_MembersInjector implements MembersInjector<AuthActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<Router> routerProvider;

  public AuthActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<Router> routerProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.routerProvider = routerProvider;
  }

  public static MembersInjector<AuthActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<Router> routerProvider) {
    return new AuthActivity_MembersInjector(androidInjectorProvider, routerProvider);
  }

  @Override
  public void injectMembers(AuthActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectRouter(instance, routerProvider.get());
  }

  @InjectedFieldSignature("work.sample.auth.AuthActivity.router")
  public static void injectRouter(AuthActivity instance, Router router) {
    instance.router = router;
  }
}
