package com.example.jettriviaapp.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jettriviaapp.components.Questions


@Composable
fun TriviaHome(viewModel: QuestionViewModel = viewModel()) {
    Questions(viewModel = viewModel)
}