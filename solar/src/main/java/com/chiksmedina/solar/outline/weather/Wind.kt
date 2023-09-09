package com.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.WeatherGroup

public val WeatherGroup.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 5.5f)
                curveTo(6.25f, 3.7051f, 7.7051f, 2.25f, 9.5f, 2.25f)
                curveTo(11.2949f, 2.25f, 12.75f, 3.7051f, 12.75f, 5.5f)
                curveTo(12.75f, 7.2949f, 11.2949f, 8.75f, 9.5f, 8.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 8.75f, 2.25f, 8.4142f, 2.25f, 8.0f)
                curveTo(2.25f, 7.5858f, 2.5858f, 7.25f, 3.0f, 7.25f)
                horizontalLineTo(9.5f)
                curveTo(10.4665f, 7.25f, 11.25f, 6.4665f, 11.25f, 5.5f)
                curveTo(11.25f, 4.5335f, 10.4665f, 3.75f, 9.5f, 3.75f)
                curveTo(8.5335f, 3.75f, 7.75f, 4.5335f, 7.75f, 5.5f)
                verticalLineTo(5.8571f)
                curveTo(7.75f, 6.2714f, 7.4142f, 6.6071f, 7.0f, 6.6071f)
                curveTo(6.5858f, 6.6071f, 6.25f, 6.2714f, 6.25f, 5.8571f)
                verticalLineTo(5.5f)
                close()
                moveTo(14.25f, 7.5f)
                curveTo(14.25f, 5.1528f, 16.1528f, 3.25f, 18.5f, 3.25f)
                curveTo(20.8472f, 3.25f, 22.75f, 5.1528f, 22.75f, 7.5f)
                curveTo(22.75f, 9.8472f, 20.8472f, 11.75f, 18.5f, 11.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 11.75f, 1.25f, 11.4142f, 1.25f, 11.0f)
                curveTo(1.25f, 10.5858f, 1.5858f, 10.25f, 2.0f, 10.25f)
                horizontalLineTo(18.5f)
                curveTo(20.0188f, 10.25f, 21.25f, 9.0188f, 21.25f, 7.5f)
                curveTo(21.25f, 5.9812f, 20.0188f, 4.75f, 18.5f, 4.75f)
                curveTo(16.9812f, 4.75f, 15.75f, 5.9812f, 15.75f, 7.5f)
                verticalLineTo(8.0f)
                curveTo(15.75f, 8.4142f, 15.4142f, 8.75f, 15.0f, 8.75f)
                curveTo(14.5858f, 8.75f, 14.25f, 8.4142f, 14.25f, 8.0f)
                verticalLineTo(7.5f)
                close()
                moveTo(3.25f, 14.0f)
                curveTo(3.25f, 13.5858f, 3.5858f, 13.25f, 4.0f, 13.25f)
                horizontalLineTo(18.5f)
                curveTo(20.8472f, 13.25f, 22.75f, 15.1528f, 22.75f, 17.5f)
                curveTo(22.75f, 19.8472f, 20.8472f, 21.75f, 18.5f, 21.75f)
                curveTo(16.1528f, 21.75f, 14.25f, 19.8472f, 14.25f, 17.5f)
                verticalLineTo(17.0f)
                curveTo(14.25f, 16.5858f, 14.5858f, 16.25f, 15.0f, 16.25f)
                curveTo(15.4142f, 16.25f, 15.75f, 16.5858f, 15.75f, 17.0f)
                verticalLineTo(17.5f)
                curveTo(15.75f, 19.0188f, 16.9812f, 20.25f, 18.5f, 20.25f)
                curveTo(20.0188f, 20.25f, 21.25f, 19.0188f, 21.25f, 17.5f)
                curveTo(21.25f, 15.9812f, 20.0188f, 14.75f, 18.5f, 14.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 14.75f, 3.25f, 14.4142f, 3.25f, 14.0f)
                close()
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null
