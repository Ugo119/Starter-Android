package com.ugo.core.domain.util

import androidx.annotation.StringDef
import com.ugo.core.domain.util.StringConstants.Companion.TYPE_ONE
import com.ugo.core.domain.util.StringConstants.Companion.TYPE_THREE
import com.ugo.core.domain.util.StringConstants.Companion.TYPE_TWO



@StringDef(
    value = [
        TYPE_ONE,
        TYPE_TWO,
        TYPE_THREE
    ]
)
@Retention(AnnotationRetention.SOURCE)

annotation class StringConstants {
    companion object {
        const val TYPE_ONE = "type_one"
        const val TYPE_TWO = "type_two"
        const val TYPE_THREE = "type_three"
    }
}