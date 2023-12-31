package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.Xxx: ImageVector
    get() {
        if (_xxx != null) {
            return _xxx!!
        }
        _xxx = Builder(
            name = "Xxx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.5f, 9.0f)
                lineTo(6.5f, 12.0f)
                moveTo(6.5f, 12.0f)
                lineTo(4.5f, 15.0f)
                moveTo(6.5f, 12.0f)
                lineTo(4.5f, 9.0f)
                moveTo(6.5f, 12.0f)
                lineTo(8.5f, 15.0f)
                moveTo(14.0f, 9.0f)
                lineTo(12.0f, 12.0f)
                moveTo(12.0f, 12.0f)
                lineTo(10.0f, 15.0f)
                moveTo(12.0f, 12.0f)
                lineTo(10.0f, 9.0f)
                moveTo(12.0f, 12.0f)
                lineTo(14.0f, 15.0f)
                moveTo(19.5f, 9.0f)
                lineTo(17.5f, 12.0f)
                moveTo(17.5f, 12.0f)
                lineTo(15.5f, 15.0f)
                moveTo(17.5f, 12.0f)
                lineTo(15.5f, 9.0f)
                moveTo(17.5f, 12.0f)
                lineTo(19.5f, 15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
        }
            .build()
        return _xxx!!
    }

private var _xxx: ImageVector? = null
