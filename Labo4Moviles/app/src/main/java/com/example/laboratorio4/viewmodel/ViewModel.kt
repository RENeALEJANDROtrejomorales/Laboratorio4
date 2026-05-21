package com.example.laboratorio4.viewmodel

import androidx.lifecycle.ViewModel
import com.example.laboratorio4.model.Task
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ViewModel : ViewModel() {

    private val _tasks = MutableStateFlow<MutableList<Task>>(mutableListOf())

    val tasks = _tasks.asStateFlow()

    fun addTask(task: Task) {
        _tasks.value = _tasks.value.toMutableList().apply {
            add(task)
        }
    }
}