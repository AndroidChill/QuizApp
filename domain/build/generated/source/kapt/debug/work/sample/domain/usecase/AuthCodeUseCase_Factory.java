// Generated by Dagger (https://dagger.dev).
package work.sample.domain.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import work.sample.domain.repository.AuthRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthCodeUseCase_Factory implements Factory<AuthCodeUseCase> {
  private final Provider<AuthRepository> authRepositoryProvider;

  public AuthCodeUseCase_Factory(Provider<AuthRepository> authRepositoryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
  }

  @Override
  public AuthCodeUseCase get() {
    return newInstance(authRepositoryProvider.get());
  }

  public static AuthCodeUseCase_Factory create(Provider<AuthRepository> authRepositoryProvider) {
    return new AuthCodeUseCase_Factory(authRepositoryProvider);
  }

  public static AuthCodeUseCase newInstance(AuthRepository authRepository) {
    return new AuthCodeUseCase(authRepository);
  }
}