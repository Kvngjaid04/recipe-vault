package com.kvngjaid04.recipevault.data.local.database

import androidx.room.TypeConverter
import com.kvngjaid04.recipevault.domain.model.UnitType

class Converters {

    @TypeConverter
    fun fromUnitType(unitType: UnitType): String {
        return unitType.name
    }

    @TypeConverter
    fun toUnitType(value: String): UnitType {
        return UnitType.valueOf(value)
    }
}