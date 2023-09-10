package com.chiksmedina.solar.boldduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.TimeGroup

val TimeGroup.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(
            name = "Stopwatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 23.0f)
                curveTo(16.9706f, 23.0f, 21.0f, 18.9706f, 21.0f, 14.0f)
                curveTo(21.0f, 9.0294f, 16.9706f, 5.0f, 12.0f, 5.0f)
                curveTo(7.0294f, 5.0f, 3.0f, 9.0294f, 3.0f, 14.0f)
                curveTo(3.0f, 18.9706f, 7.0294f, 23.0f, 12.0f, 23.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 9.25f)
                curveTo(12.4142f, 9.25f, 12.75f, 9.5858f, 12.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(12.75f, 14.4142f, 12.4142f, 14.75f, 12.0f, 14.75f)
                curveTo(11.5858f, 14.75f, 11.25f, 14.4142f, 11.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(11.25f, 9.5858f, 11.5858f, 9.25f, 12.0f, 9.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 2.75f)
                curveTo(9.25f, 2.3358f, 9.5858f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 2.0f, 14.75f, 2.3358f, 14.75f, 2.75f)
                curveTo(14.75f, 3.1642f, 14.4142f, 3.5f, 14.0f, 3.5f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 3.5f, 9.25f, 3.1642f, 9.25f, 2.75f)
                close()
            }
        }
            .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
