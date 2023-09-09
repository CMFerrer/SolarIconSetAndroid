package com.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.AstronomyGroup

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
                moveTo(12.7497f, 15.9603f)
                curveTo(16.2632f, 15.5862f, 19.0f, 12.6127f, 19.0f, 9.0f)
                curveTo(19.0f, 5.134f, 15.866f, 2.0f, 12.0f, 2.0f)
                curveTo(8.134f, 2.0f, 5.0f, 5.134f, 5.0f, 9.0f)
                curveTo(5.0f, 12.6125f, 7.7365f, 15.5859f, 11.2497f, 15.9603f)
                verticalLineTo(17.75f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 17.75f, 8.75f, 18.0858f, 8.75f, 18.5f)
                curveTo(8.75f, 18.9142f, 9.0858f, 19.25f, 9.5f, 19.25f)
                horizontalLineTo(11.2498f)
                lineTo(11.25f, 22.0001f)
                curveTo(11.25f, 22.4143f, 11.5858f, 22.75f, 12.0001f, 22.75f)
                curveTo(12.4143f, 22.75f, 12.75f, 22.4142f, 12.75f, 21.9999f)
                lineTo(12.7498f, 19.25f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 19.25f, 15.25f, 18.9142f, 15.25f, 18.5f)
                curveTo(15.25f, 18.0858f, 14.9142f, 17.75f, 14.5f, 17.75f)
                horizontalLineTo(12.7497f)
                verticalLineTo(15.9603f)
                close()
            }
        }
        .build()
        return _women!!
    }

private var _women: ImageVector? = null
