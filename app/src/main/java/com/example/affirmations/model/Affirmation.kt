package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation (val stringResource: Int, val imageResource: Int){
    @StringRes
    val stringResourceId: Int = stringResource

    @DrawableRes
    val imageResourceId: Int = imageResource
}