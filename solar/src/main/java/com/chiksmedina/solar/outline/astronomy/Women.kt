package com.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Women: ImageVector
    get() {
        if (_women != null) {
            return _women!!
        }
        _women = Builder(
            name = "Women", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(8.5482f, 2.75f, 5.75f, 5.5482f, 5.75f, 9.0f)
                curveTo(5.75f, 12.4518f, 8.548f, 15.25f, 11.9998f, 15.25f)
                curveTo(15.4516f, 15.25f, 18.25f, 12.4517f, 18.25f, 9.0f)
                curveTo(18.25f, 5.5482f, 15.4518f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(4.25f, 9.0f)
                curveTo(4.25f, 4.7198f, 7.7198f, 1.25f, 12.0f, 1.25f)
                curveTo(16.2802f, 1.25f, 19.75f, 4.7198f, 19.75f, 9.0f)
                curveTo(19.75f, 13.0272f, 16.6781f, 16.337f, 12.7498f, 16.7142f)
                verticalLineTo(17.75f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 17.75f, 15.25f, 18.0858f, 15.25f, 18.5f)
                curveTo(15.25f, 18.9142f, 14.9142f, 19.25f, 14.5f, 19.25f)
                horizontalLineTo(12.7498f)
                lineTo(12.75f, 21.9999f)
                curveTo(12.7501f, 22.4142f, 12.4143f, 22.75f, 12.0001f, 22.75f)
                curveTo(11.5859f, 22.75f, 11.2501f, 22.4143f, 11.25f, 22.0001f)
                lineTo(11.2498f, 19.25f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 19.25f, 8.75f, 18.9142f, 8.75f, 18.5f)
                curveTo(8.75f, 18.0858f, 9.0858f, 17.75f, 9.5f, 17.75f)
                horizontalLineTo(11.2498f)
                verticalLineTo(16.7142f)
                curveTo(7.3215f, 16.3369f, 4.25f, 13.0272f, 4.25f, 9.0f)
                close()
            }
        }
            .build()
        return _women!!
    }

private var _women: ImageVector? = null
