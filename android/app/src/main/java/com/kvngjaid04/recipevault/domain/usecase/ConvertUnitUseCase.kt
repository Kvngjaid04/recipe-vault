package com.kvngjaid04.recipevault.domain.usecase

class ConvertUnitUseCase {

    fun gramsToKg(
        grams: Double
    ): Double {
        return grams / 1000
    }

    fun kgToGrams(
        kg: Double
    ): Double {
        return kg * 1000
    }

    fun mlToLiters(
        ml: Double
    ): Double {
        return ml / 1000
    }

    fun litersToMl(
        liters: Double
    ): Double {
        return liters * 1000
    }
}