package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(
            name = "Scissors", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.4013f, 20.5f)
                lineTo(6.0f, 2.0f)
                moveTo(22.0f, 19.0f)
                curveTo(22.0f, 20.6569f, 20.6569f, 22.0f, 19.0f, 22.0f)
                curveTo(17.3431f, 22.0f, 16.0f, 20.6569f, 16.0f, 19.0f)
                curveTo(16.0f, 17.3431f, 17.3431f, 16.0f, 19.0f, 16.0f)
                curveTo(20.6569f, 16.0f, 22.0f, 17.3431f, 22.0f, 19.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5986f, 20.5f)
                lineTo(18.0f, 2.0f)
                moveTo(2.0f, 19.0f)
                curveTo(2.0f, 20.6569f, 3.3431f, 22.0f, 5.0f, 22.0f)
                curveTo(6.6568f, 22.0f, 8.0f, 20.6569f, 8.0f, 19.0f)
                curveTo(8.0f, 17.3431f, 6.6568f, 16.0f, 5.0f, 16.0f)
                curveTo(3.3431f, 16.0f, 2.0f, 17.3431f, 2.0f, 19.0f)
                close()
            }
        }
            .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
