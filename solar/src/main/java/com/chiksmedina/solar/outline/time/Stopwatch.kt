package com.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TimeGroup

public val TimeGroup.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.25f, 2.0f)
                curveTo(9.25f, 1.5858f, 9.5858f, 1.25f, 10.0f, 1.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 1.25f, 14.75f, 1.5858f, 14.75f, 2.0f)
                curveTo(14.75f, 2.4142f, 14.4142f, 2.75f, 14.0f, 2.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 2.75f, 9.25f, 2.4142f, 9.25f, 2.0f)
                close()
                moveTo(12.0f, 4.75f)
                curveTo(7.4436f, 4.75f, 3.75f, 8.4437f, 3.75f, 13.0f)
                curveTo(3.75f, 17.5563f, 7.4436f, 21.25f, 12.0f, 21.25f)
                curveTo(16.5563f, 21.25f, 20.25f, 17.5563f, 20.25f, 13.0f)
                curveTo(20.25f, 8.4437f, 16.5563f, 4.75f, 12.0f, 4.75f)
                close()
                moveTo(2.25f, 13.0f)
                curveTo(2.25f, 7.6152f, 6.6152f, 3.25f, 12.0f, 3.25f)
                curveTo(17.3848f, 3.25f, 21.75f, 7.6152f, 21.75f, 13.0f)
                curveTo(21.75f, 18.3848f, 17.3848f, 22.75f, 12.0f, 22.75f)
                curveTo(6.6152f, 22.75f, 2.25f, 18.3848f, 2.25f, 13.0f)
                close()
                moveTo(12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(12.75f, 13.4142f, 12.4142f, 13.75f, 12.0f, 13.75f)
                curveTo(11.5858f, 13.75f, 11.25f, 13.4142f, 11.25f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
