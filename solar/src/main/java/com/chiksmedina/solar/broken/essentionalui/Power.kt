package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(
            name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.5f, 3.7059f)
                curveTo(5.2681f, 5.0715f, 3.0f, 8.2709f, 3.0f, 12.0f)
                curveTo(3.0f, 14.3051f, 3.8666f, 16.4078f, 5.2917f, 18.0f)
                moveTo(15.5f, 3.7059f)
                curveTo(18.7319f, 5.0715f, 21.0f, 8.2709f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(10.9481f, 21.0f, 9.9383f, 20.8196f, 9.0f, 20.4879f)
            }
        }
            .build()
        return _power!!
    }

private var _power: ImageVector? = null
