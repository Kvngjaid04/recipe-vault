package com.kvngjaid04.recipevault.domain.usecase

import kotlin.math.round

class ScaleRecipeUseCase {

    fun scaleQuantity(
        quantity: Double,
        originalServings: Int,
        targetServings: Int
    ): Double {

        val scaled =
            quantity * targetServings / originalServings.toDouble()

        return roundToCookingValue(scaled)
    }

    private fun roundToCookingValue(
        value: Double
    ): Double {

        return (round(value * 2) / 2)
    }
}