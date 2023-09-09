package com.chiksmedina.solar.bold.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.NetworkItProgrammingGroup

public val NetworkItProgrammingGroup.WindowFrame: ImageVector
    get() {
        if (_windowFrame != null) {
            return _windowFrame!!
        }
        _windowFrame = Builder(name = "WindowFrame", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.3842f, 4.5447f, 2.1008f, 6.1106f, 2.0264f, 8.75f)
                horizontalLineTo(21.9736f)
                curveTo(21.8992f, 6.1106f, 21.6158f, 4.5447f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 11.3766f, 2.0f, 10.7944f, 2.0034f, 10.25f)
                horizontalLineTo(8.25f)
                lineTo(8.25f, 21.0f)
                verticalLineTo(21.9563f)
                curveTo(5.9096f, 21.8591f, 4.4747f, 21.5458f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
                moveTo(6.0f, 7.0f)
                curveTo(6.5523f, 7.0f, 7.0f, 6.5523f, 7.0f, 6.0f)
                curveTo(7.0f, 5.4477f, 6.5523f, 5.0f, 6.0f, 5.0f)
                curveTo(5.4477f, 5.0f, 5.0f, 5.4477f, 5.0f, 6.0f)
                curveTo(5.0f, 6.5523f, 5.4477f, 7.0f, 6.0f, 7.0f)
                close()
                moveTo(10.0f, 6.0f)
                curveTo(10.0f, 6.5523f, 9.5523f, 7.0f, 9.0f, 7.0f)
                curveTo(8.4477f, 7.0f, 8.0f, 6.5523f, 8.0f, 6.0f)
                curveTo(8.0f, 5.4477f, 8.4477f, 5.0f, 9.0f, 5.0f)
                curveTo(9.5523f, 5.0f, 10.0f, 5.4477f, 10.0f, 6.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(12.5523f, 7.0f, 13.0f, 6.5523f, 13.0f, 6.0f)
                curveTo(13.0f, 5.4477f, 12.5523f, 5.0f, 12.0f, 5.0f)
                curveTo(11.4477f, 5.0f, 11.0f, 5.4477f, 11.0f, 6.0f)
                curveTo(11.0f, 6.5523f, 11.4477f, 7.0f, 12.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(11.1815f, 22.0f, 10.4341f, 22.0f, 9.75f, 21.9923f)
                verticalLineTo(21.0f)
                lineTo(9.75f, 10.25f)
                horizontalLineTo(21.9966f)
                curveTo(22.0f, 10.7944f, 22.0f, 11.3766f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _windowFrame!!
    }

private var _windowFrame: ImageVector? = null
