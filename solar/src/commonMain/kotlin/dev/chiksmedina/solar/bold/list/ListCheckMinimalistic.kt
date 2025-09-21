package dev.chiksmedina.solar.bold.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ListGroup

val ListGroup.ListCheckMinimalistic: ImageVector
    get() {
        if (_listCheckMinimalistic != null) {
            return _listCheckMinimalistic!!
        }
        _listCheckMinimalistic = Builder(
            name = "ListCheckMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.0f, 6.75f)
                curveTo(3.0f, 6.3358f, 3.3358f, 6.0f, 3.75f, 6.0f)
                horizontalLineTo(20.75f)
                curveTo(21.1642f, 6.0f, 21.5f, 6.3358f, 21.5f, 6.75f)
                curveTo(21.5f, 7.1642f, 21.1642f, 7.5f, 20.75f, 7.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 7.5f, 3.0f, 7.1642f, 3.0f, 6.75f)
                close()
                moveTo(21.2113f, 11.1586f)
                curveTo(21.5379f, 11.4134f, 21.5961f, 11.8847f, 21.3414f, 12.2113f)
                lineTo(17.4414f, 17.2113f)
                curveTo(17.3022f, 17.3897f, 17.0899f, 17.4958f, 16.8636f, 17.4999f)
                curveTo(16.6373f, 17.504f, 16.4213f, 17.4057f, 16.2757f, 17.2324f)
                lineTo(14.1757f, 14.7324f)
                curveTo(13.9093f, 14.4152f, 13.9504f, 13.9421f, 14.2676f, 13.6757f)
                curveTo(14.5848f, 13.4093f, 15.0579f, 13.4504f, 15.3243f, 13.7676f)
                lineTo(16.8284f, 15.5582f)
                lineTo(20.1586f, 11.2887f)
                curveTo(20.4134f, 10.9621f, 20.8847f, 10.9039f, 21.2113f, 11.1586f)
                close()
                moveTo(3.0f, 11.75f)
                curveTo(3.0f, 11.3358f, 3.3358f, 11.0f, 3.75f, 11.0f)
                horizontalLineTo(10.75f)
                curveTo(11.1642f, 11.0f, 11.5f, 11.3358f, 11.5f, 11.75f)
                curveTo(11.5f, 12.1642f, 11.1642f, 12.5f, 10.75f, 12.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 12.5f, 3.0f, 12.1642f, 3.0f, 11.75f)
                close()
                moveTo(3.0f, 16.75f)
                curveTo(3.0f, 16.3358f, 3.3358f, 16.0f, 3.75f, 16.0f)
                horizontalLineTo(10.75f)
                curveTo(11.1642f, 16.0f, 11.5f, 16.3358f, 11.5f, 16.75f)
                curveTo(11.5f, 17.1642f, 11.1642f, 17.5f, 10.75f, 17.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 17.5f, 3.0f, 17.1642f, 3.0f, 16.75f)
                close()
            }
        }
            .build()
        return _listCheckMinimalistic!!
    }

private var _listCheckMinimalistic: ImageVector? = null
