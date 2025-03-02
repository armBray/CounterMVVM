package com.example.countermvvm

data class CounterModel(var count : Int)

class CounterRespository {
    private val _counter = CounterModel(0)

    fun getCounter() = _counter

    fun incrementCounter(){
        _counter.count++
    }

    fun decrementCounter(){
        _counter.count--
    }

    fun resetCounter(){
        _counter.count = 0
    }
}