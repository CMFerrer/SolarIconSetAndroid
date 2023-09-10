package com.chiksmedina.solar.linear.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ListGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 6.0f)
                lineTo(3.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 16.0f)
                horizontalLineTo(3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 11.0f)
                horizontalLineTo(3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.125f, 10.6854f)
                curveTo(20.767f, 11.6334f, 21.588f, 12.1074f, 21.8478f, 12.7347f)
                curveTo(22.0507f, 13.2247f, 22.0507f, 13.7753f, 21.8478f, 14.2654f)
                curveTo(21.588f, 14.8926f, 20.767f, 15.3666f, 19.125f, 16.3146f)
                curveTo(17.483f, 17.2626f, 16.662f, 17.7366f, 15.9889f, 17.648f)
                curveTo(15.4631f, 17.5787f, 14.9862f, 17.3034f, 14.6633f, 16.8826f)
                curveTo(14.25f, 16.344f, 14.25f, 15.396f, 14.25f, 13.5f)
                curveTo(14.25f, 11.604f, 14.25f, 10.656f, 14.6633f, 10.1174f)
                curveTo(14.9862f, 9.6966f, 15.4631f, 9.4213f, 15.9889f, 9.3521f)
                curveTo(16.662f, 9.2634f, 17.483f, 9.7374f, 19.125f, 10.6854f)
                close()
            }
        }
            .build()
        return _plaaylistMinimalistic!!
    }

private var _plaaylistMinimalistic: ImageVector? = null
