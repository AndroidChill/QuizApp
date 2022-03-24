package work.sample.admin.testDetail

import work.sample.core.mvi.Action
import work.sample.domain.models.saveTest.SaveTestRequest
import work.sample.domain.models.test.TestDetailResponse

sealed class TestDetailAction : Action {

    data class TestDetail(
        var id: Int
    ) : TestDetailAction()

    data class TestDetailSuccess(
        var test: TestDetailResponse
    ) : TestDetailAction()

    data class TestSave(
        val request: SaveTestRequest
    ) : TestDetailAction()

    object TestSaveSuccess : TestDetailAction()
}
