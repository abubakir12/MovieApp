package com.example.movieapp.presentation.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapp.data.remote.MovieService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val movieService: MovieService,
):ViewModel() {

    init {
        viewModelScope.launch (Dispatchers.IO ) {
            movieService.fetchPopular()
        }
    }

}