package work.sample.admin.testDetail

import work.sample.core.mvi.State
import work.sample.domain.models.test.TestDetailResponse

sealed class TestDetailState : State {

    object Default : TestDetailState()

    data class TestDetailSuccess(
        var test: TestDetailResponse
    ) : TestDetailState()

    object TestSaveSuccess: TestDetailState()

}