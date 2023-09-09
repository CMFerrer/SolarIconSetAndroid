package com.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.broken.AstronomyGroup

public val AstronomyGroup.Women: ImageVector
    get() {
        if (_women != null) {
            return _women!!
        }
        _women = Builder(name = "Women", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 17.75f)
                curveTo(9.0858f, 17.75f, 8.75f, 18.0858f, 8.75f, 18.5f)
                curveTo(8.75f, 18.9142f, 9.0858f, 19.25f, 9.5f, 19.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(14.5f, 19.25f)
                curveTo(14.9142f, 19.25f, 15.25f, 18.9142f, 15.25f, 18.5f)
                curveTo(15.25f, 18.0858f, 14.9142f, 17.75f, 14.5f, 17.75f)
                verticalLineTo(19.25f)
                close()
                moveTo(11.25f, 22.0001f)
                curveTo(11.25f, 22.4143f, 11.5858f, 22.75f, 12.0001f, 22.75f)
                curveTo(12.4143f, 22.75f, 12.75f, 22.4142f, 12.75f, 21.9999f)
                lineTo(11.25f, 22.0001f)
                close()
                moveTo(11.2497f, 16.0f)
                verticalLineTo(18.5f)
                horizontalLineTo(12.7497f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.2497f)
                close()
                moveTo(11.9997f, 17.75f)
                horizontalLineTo(9.5f)
                verticalLineTo(19.25f)
                horizontalLineTo(11.9997f)
                verticalLineTo(17.75f)
                close()
                moveTo(14.5f, 17.75f)
                horizontalLineTo(11.9997f)
                verticalLineTo(19.25f)
                horizontalLineTo(14.5f)
                verticalLineTo(17.75f)
                close()
                moveTo(11.2497f, 18.5001f)
                lineTo(11.25f, 22.0001f)
                lineTo(12.75f, 21.9999f)
                lineTo(12.7497f, 18.4999f)
                lineTo(11.2497f, 18.5001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 2.9365f)
                curveTo(9.5296f, 2.3409f, 10.725f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                curveTo(19.0f, 12.866f, 15.866f, 16.0f, 12.0f, 16.0f)
                curveTo(8.134f, 16.0f, 5.0f, 12.866f, 5.0f, 9.0f)
                curveTo(5.0f, 7.725f, 5.3409f, 6.5296f, 5.9365f, 5.5f)
            }
        }
        .build()
        return _women!!
    }

private var _women: ImageVector? = null
