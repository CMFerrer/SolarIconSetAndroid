package com.chiksmedina.solar.lineduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.TimeGroup

val TimeGroup.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(
            name = "Hourglass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.9577f, 9.0711f)
                lineTo(12.0f, 12.0f)
                lineTo(9.0423f, 9.0711f)
                lineTo(9.0423f, 9.0711f)
                curveTo(6.1198f, 6.177f, 4.6586f, 4.73f, 5.0676f, 3.4815f)
                curveTo(5.1028f, 3.3742f, 5.1465f, 3.2698f, 5.1982f, 3.1693f)
                curveTo(5.8005f, 2.0f, 7.867f, 2.0f, 12.0f, 2.0f)
                curveTo(16.133f, 2.0f, 18.1995f, 2.0f, 18.8017f, 3.1693f)
                curveTo(18.8535f, 3.2698f, 18.8972f, 3.3742f, 18.9323f, 3.4815f)
                curveTo(19.3414f, 4.73f, 17.8802f, 6.177f, 14.9577f, 9.0711f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0423f, 14.9289f)
                lineTo(12.0f, 12.0f)
                lineTo(14.9577f, 14.9289f)
                curveTo(17.8802f, 17.823f, 19.3414f, 19.27f, 18.9323f, 20.5185f)
                curveTo(18.8972f, 20.6258f, 18.8535f, 20.7302f, 18.8017f, 20.8307f)
                curveTo(18.1995f, 22.0f, 16.133f, 22.0f, 12.0f, 22.0f)
                curveTo(7.867f, 22.0f, 5.8005f, 22.0f, 5.1982f, 20.8307f)
                curveTo(5.1465f, 20.7302f, 5.1028f, 20.6258f, 5.0676f, 20.5185f)
                curveTo(4.6586f, 19.27f, 6.1198f, 17.823f, 9.0423f, 14.9289f)
                lineTo(9.0423f, 14.9289f)
                close()
            }
        }
            .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
