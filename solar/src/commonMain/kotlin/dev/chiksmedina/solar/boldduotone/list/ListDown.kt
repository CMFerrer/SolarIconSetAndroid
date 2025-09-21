package dev.chiksmedina.solar.boldduotone.list

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
import dev.chiksmedina.solar.boldduotone.ListGroup

val ListGroup.ListDown: ImageVector
    get() {
        if (_listDown != null) {
            return _listDown!!
        }
        _listDown = Builder(
            name = "ListDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 5.5858f, 2.5858f, 5.25f, 3.0f, 5.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 5.25f, 21.75f, 5.5858f, 21.75f, 6.0f)
                curveTo(21.75f, 6.4142f, 21.4142f, 6.75f, 21.0f, 6.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 6.75f, 2.25f, 6.4142f, 2.25f, 6.0f)
                close()
                moveTo(2.25f, 10.0f)
                curveTo(2.25f, 9.5858f, 2.5858f, 9.25f, 3.0f, 9.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 9.25f, 21.75f, 9.5858f, 21.75f, 10.0f)
                curveTo(21.75f, 10.4142f, 21.4142f, 10.75f, 21.0f, 10.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 10.75f, 2.25f, 10.4142f, 2.25f, 10.0f)
                close()
                moveTo(2.25f, 14.0f)
                curveTo(2.25f, 13.5858f, 2.5858f, 13.25f, 3.0f, 13.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 13.25f, 10.75f, 13.5858f, 10.75f, 14.0f)
                curveTo(10.75f, 14.4142f, 10.4142f, 14.75f, 10.0f, 14.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 14.75f, 2.25f, 14.4142f, 2.25f, 14.0f)
                close()
                moveTo(2.25f, 18.0f)
                curveTo(2.25f, 17.5858f, 2.5858f, 17.25f, 3.0f, 17.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 17.25f, 10.75f, 17.5858f, 10.75f, 18.0f)
                curveTo(10.75f, 18.4142f, 10.4142f, 18.75f, 10.0f, 18.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 18.75f, 2.25f, 18.4142f, 2.25f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.4306f, 14.5119f)
                curveTo(13.7001f, 14.1974f, 14.1736f, 14.161f, 14.4881f, 14.4306f)
                lineTo(17.5f, 17.0122f)
                lineTo(20.5119f, 14.4306f)
                curveTo(20.8264f, 14.161f, 21.2999f, 14.1974f, 21.5695f, 14.5119f)
                curveTo(21.839f, 14.8264f, 21.8026f, 15.2999f, 21.4881f, 15.5695f)
                lineTo(17.9881f, 18.5695f)
                curveTo(17.7072f, 18.8102f, 17.2928f, 18.8102f, 17.0119f, 18.5695f)
                lineTo(13.5119f, 15.5695f)
                curveTo(13.1974f, 15.2999f, 13.161f, 14.8264f, 13.4306f, 14.5119f)
                close()
            }
        }
            .build()
        return _listDown!!
    }

private var _listDown: ImageVector? = null
