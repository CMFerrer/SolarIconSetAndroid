package com.chiksmedina.solar.lineduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.TimeGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 13.0f)
                curveTo(21.0f, 17.9706f, 16.9706f, 22.0f, 12.0f, 22.0f)
                curveTo(7.0294f, 22.0f, 3.0f, 17.9706f, 3.0f, 13.0f)
                curveTo(3.0f, 8.0294f, 7.0294f, 4.0f, 12.0f, 4.0f)
                curveTo(16.9706f, 4.0f, 21.0f, 8.0294f, 21.0f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 13.0f)
                verticalLineTo(9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
            }
        }
            .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
