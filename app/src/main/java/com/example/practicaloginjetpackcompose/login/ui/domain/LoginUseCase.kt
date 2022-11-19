package com.example.practicaloginjetpackcompose.login.ui.domain

import com.example.practicaloginjetpackcompose.login.ui.data.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository: LoginRepository) {

    suspend operator fun invoke(user: String, password: String): Boolean {
        return repository.doLogin(user = user, password = password)
    }
}