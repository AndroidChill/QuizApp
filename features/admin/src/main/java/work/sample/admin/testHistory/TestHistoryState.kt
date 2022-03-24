package work.sample.admin.testHistory

import work.sample.core.mvi.State
import work.sample.domain.models.testHistory.TestHistoryAllResponse
import work.sample.domain.models.testHistory.TestHistoryMyResponse

sealed class TestHistoryState : State{

    object Default : TestHistoryState()

    data class TestHistoryMySuccess(
        val data: List<TestHistoryMyResponse>
    ) : TestHistoryState()

    data class TestHistoryAllSuccess(
        val data: List<TestHistoryAllResponse>
    ) : TestHistoryState()

}