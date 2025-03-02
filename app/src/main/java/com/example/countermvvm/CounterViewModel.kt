package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _repository : CounterRespository = CounterRespository()
    private val _counter = mutableStateOf(_repository.getCounter().count)

    val counter : MutableState<Int> = _counter

    fun increment() {
        _repository.incrementCounter()
        _counter.value = _repository.getCounter().count
    }

    fun decrement() {
        _repository.decrementCounter()
        _counter.value = _repository.getCounter().count
    }

    fun reset() {
        _repository.resetCounter()
        _counter.value = _repository.getCounter().count
    }
}