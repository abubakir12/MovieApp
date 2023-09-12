package com.example.movieapp.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.`movie app`.R
import com.example.movieapp.presentation.theme.MovieAppTheme

@Preview
@Composable
fun HomeScreenContentPreview() {
    MovieAppTheme {
        HomeScreen()
    }
}


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
    ) {
        Column(
            modifier = modifier
        ) {
            Text(
                modifier = modifier.padding(top = 42.dp),
                text = stringResource(id = R.string.what_do_you_want_to_watch),
                fontSize = 18.sp,
                color = colorResource(id = R.color.white),
                textAlign = TextAlign.Center
            )

        }
    }
}



