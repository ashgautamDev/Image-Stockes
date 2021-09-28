package com.ashish.dhammavichar.utils

import com.ashish.dhammavichar.domain.model.Quote

sealed class ViewState {


    // It Represents different states for quotes
    object Empty : ViewState()
    object Loading : ViewState()
    data class Success(val quote: List<Quote>) : ViewState()
    data class Error(val exception: Throwable) : ViewState()
}
