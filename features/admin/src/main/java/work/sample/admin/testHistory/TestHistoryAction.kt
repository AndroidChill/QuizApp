package work.sample.admin.testHistory

import work.sample.core.mvi.Action
import work.sample.domain.models.testHistory.TestHistoryAllResponse
import work.sample.domain.models.testHistory.TestHistoryMyResponse

sealed class TestHistoryAction : Action{

    object TestHistoryMy : TestHistoryAction()

    object TestHistoryAll : TestHistoryAction()

    data class TestHistoryMySuccess(
        var data: List<TestHistoryMyResponse>
    ) : TestHistoryAction()

    data class TestHistoryAllSuccess(
        var data: List<TestHistoryAllResponse>
    ) : TestHistoryAction()
}