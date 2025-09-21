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

val ListGroup.ListDownMinimalistic: ImageVector
    get() {
        if (_listDownMinimalistic != null) {
            return _listDownMinimalistic!!
        }
        _listDownMinimalistic = Builder(
            name = "ListDownMinimalistic", defaultWidth = 24.0.dp,
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
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 10.25f, 20.75f, 10.5858f, 20.75f, 11.0f)
                curveTo(20.75f, 11.4142f, 20.4142f, 11.75f, 20.0f, 11.75f)
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
                pathFillType = EvenOdd
            ) {
                moveTo(17.0119f, 18.5694f)
                curveTo(17.2928f, 18.8102f, 17.7072f, 18.8102f, 17.9881f, 18.5694f)
                lineTo(21.4881f, 15.5694f)
                curveTo(21.8026f, 15.2999f, 21.839f, 14.8264f, 21.5694f, 14.5119f)
                curveTo(21.2999f, 14.1974f, 20.8264f, 14.161f, 20.5119f, 14.4306f)
                lineTo(17.5f, 17.0122f)
                lineTo(14.4881f, 14.4306f)
                curveTo(14.1736f, 14.161f, 13.7001f, 14.1974f, 13.4306f, 14.5119f)
                curveTo(13.161f, 14.8264f, 13.1974f, 15.2999f, 13.5119f, 15.5694f)
                lineTo(17.0119f, 18.5694f)
                close()
            }
        }
            .build()
        return _listDownMinimalistic!!
    }

private var _listDownMinimalistic: ImageVector? = null
