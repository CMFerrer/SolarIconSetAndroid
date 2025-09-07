package com.chiksmedina.solar.bold.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Programming: ImageVector
    get() {
        if (_programming != null) {
            return _programming!!
        }
        _programming = Builder(
            name = "Programming", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(6.4239f, 9.5199f)
                curveTo(6.689f, 9.2017f, 7.162f, 9.1587f, 7.4802f, 9.4239f)
                lineTo(7.7566f, 9.6542f)
                curveTo(8.3615f, 10.1583f, 8.8765f, 10.5874f, 9.233f, 10.9821f)
                curveTo(9.6115f, 11.4013f, 9.9069f, 11.8834f, 9.9069f, 12.5f)
                curveTo(9.9069f, 13.1166f, 9.6115f, 13.5987f, 9.233f, 14.0179f)
                curveTo(8.8765f, 14.4126f, 8.3615f, 14.8418f, 7.7566f, 15.3458f)
                lineTo(7.4802f, 15.5762f)
                curveTo(7.162f, 15.8414f, 6.689f, 15.7984f, 6.4239f, 15.4802f)
                curveTo(6.1587f, 15.1619f, 6.2017f, 14.689f, 6.5199f, 14.4239f)
                lineTo(6.7543f, 14.2285f)
                curveTo(7.4128f, 13.6797f, 7.8435f, 13.3185f, 8.1197f, 13.0126f)
                curveTo(8.382f, 12.7222f, 8.4069f, 12.586f, 8.4069f, 12.5f)
                curveTo(8.4069f, 12.414f, 8.382f, 12.2779f, 8.1197f, 11.9874f)
                curveTo(7.8435f, 11.6815f, 7.4128f, 11.3203f, 6.7543f, 10.7715f)
                lineTo(6.5199f, 10.5762f)
                curveTo(6.2017f, 10.311f, 6.1587f, 9.8381f, 6.4239f, 9.5199f)
                close()
                moveTo(17.75f, 15.0f)
                curveTo(17.75f, 15.4142f, 17.4142f, 15.75f, 17.0f, 15.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 15.75f, 11.25f, 15.4142f, 11.25f, 15.0f)
                curveTo(11.25f, 14.5858f, 11.5858f, 14.25f, 12.0f, 14.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 14.25f, 17.75f, 14.5858f, 17.75f, 15.0f)
                close()
            }
        }
            .build()
        return _programming!!
    }

private var _programming: ImageVector? = null
