package com.chiksmedina.solar.bold.list

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
import com.chiksmedina.solar.bold.ListGroup

val ListGroup.PlaaylistMinimalistic: ImageVector
    get() {
        if (_plaaylistMinimalistic != null) {
            return _plaaylistMinimalistic!!
        }
        _plaaylistMinimalistic = Builder(
            name = "PlaaylistMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 5.5858f, 2.5858f, 5.25f, 3.0f, 5.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 5.25f, 20.75f, 5.5858f, 20.75f, 6.0f)
                curveTo(20.75f, 6.4142f, 20.4142f, 6.75f, 20.0f, 6.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 6.75f, 2.25f, 6.4142f, 2.25f, 6.0f)
                close()
                moveTo(2.25f, 11.0f)
                curveTo(2.25f, 10.5858f, 2.5858f, 10.25f, 3.0f, 10.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 10.25f, 10.75f, 10.5858f, 10.75f, 11.0f)
                curveTo(10.75f, 11.4142f, 10.4142f, 11.75f, 10.0f, 11.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 11.75f, 2.25f, 11.4142f, 2.25f, 11.0f)
                close()
                moveTo(2.25f, 16.0f)
                curveTo(2.25f, 15.5858f, 2.5858f, 15.25f, 3.0f, 15.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 15.25f, 10.75f, 15.5858f, 10.75f, 16.0f)
                curveTo(10.75f, 16.4142f, 10.4142f, 16.75f, 10.0f, 16.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 16.75f, 2.25f, 16.4142f, 2.25f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.125f, 10.6854f)
                curveTo(20.767f, 11.6334f, 21.588f, 12.1074f, 21.8478f, 12.7346f)
                curveTo(22.0507f, 13.2247f, 22.0507f, 13.7753f, 21.8478f, 14.2654f)
                curveTo(21.588f, 14.8926f, 20.767f, 15.3666f, 19.125f, 16.3146f)
                curveTo(17.483f, 17.2626f, 16.662f, 17.7366f, 15.9889f, 17.648f)
                curveTo(15.4631f, 17.5787f, 14.9862f, 17.3034f, 14.6633f, 16.8826f)
                curveTo(14.25f, 16.344f, 14.25f, 15.396f, 14.25f, 13.5f)
                curveTo(14.25f, 11.604f, 14.25f, 10.656f, 14.6633f, 10.1174f)
                curveTo(14.9862f, 9.6966f, 15.4631f, 9.4213f, 15.9889f, 9.352f)
                curveTo(16.662f, 9.2634f, 17.483f, 9.7374f, 19.125f, 10.6854f)
                close()
            }
        }
            .build()
        return _plaaylistMinimalistic!!
    }

private var _plaaylistMinimalistic: ImageVector? = null
