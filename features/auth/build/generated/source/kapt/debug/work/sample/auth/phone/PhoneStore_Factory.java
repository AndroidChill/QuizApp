// Generated by Dagger (https://dagger.dev).
package work.sample.auth.phone;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import work.sample.domain.usecase.AuthCodeUseCase;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PhoneStore_Factory implements Factory<PhoneStore> {
  private final Provider<AuthCodeUseCase> authCodeUseCaseProvider;

  public PhoneStore_Factory(Provider<AuthCodeUseCase> authCodeUseCaseProvider) {
    this.authCodeUseCaseProvider = authCodeUseCaseProvider;
  }

  @Override
  public PhoneStore get() {
    return newInstance(authCodeUseCaseProvider.get());
  }

  public static PhoneStore_Factory create(Provider<AuthCodeUseCase> authCodeUseCaseProvider) {
    return new PhoneStore_Factory(authCodeUseCaseProvider);
  }

  public static PhoneStore newInstance(AuthCodeUseCase authCodeUseCase) {
    return new PhoneStore(authCodeUseCase);
  }
}
