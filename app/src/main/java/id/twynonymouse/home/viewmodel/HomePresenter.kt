package id.twynonymouse.home.viewmodel

import co.zsmb.rainbowcake.withIOContext
import id.twynonymouse.core.interactor.UserInteract
import javax.inject.Inject

class HomePresenter @Inject constructor(private val userInteract: UserInteract) {

    suspend fun getData() = withIOContext {
        userInteract.getUserInfo()
    }
}
