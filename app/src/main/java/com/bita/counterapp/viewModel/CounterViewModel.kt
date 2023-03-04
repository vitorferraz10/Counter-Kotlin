package com.bita.counterapp.viewModel


class CounterViewModel {

     fun removeCount(countState: Int): Int {
        return if(countState > 0) {
            countState - 1
        } else {
            countState
        }
    }

     fun addCount(countState: Int): Int {
        return countState + 1
    }

}