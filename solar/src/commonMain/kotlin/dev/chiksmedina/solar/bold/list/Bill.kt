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

val ListGroup.Bill: ImageVector
    get() {
        if (_bill != null) {
            return _bill!!
        }
        _bill = Builder(
            name = "Bill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 1.25f)
                curveTo(1.5858f, 1.25f, 1.25f, 1.5858f, 1.25f, 2.0f)
                curveTo(1.25f, 2.4142f, 1.5858f, 2.75f, 2.0f, 2.75f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.2774f)
                curveTo(4.0f, 13.6175f, 4.0f, 14.2875f, 4.2681f, 14.8783f)
                curveTo(4.5362f, 15.4692f, 5.0405f, 15.9104f, 6.049f, 16.7928f)
                lineTo(8.049f, 18.5429f)
                curveTo(9.9315f, 20.1901f, 10.8728f, 21.0137f, 12.0f, 21.0137f)
                curveTo(13.1272f, 21.0137f, 14.0685f, 20.1901f, 15.951f, 18.5429f)
                lineTo(17.951f, 16.7929f)
                curveTo(18.9595f, 15.9104f, 19.4638f, 15.4692f, 19.7319f, 14.8783f)
                curveTo(20.0f, 14.2875f, 20.0f, 13.6175f, 20.0f, 12.2774f)
                verticalLineTo(2.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 2.75f, 22.75f, 2.4142f, 22.75f, 2.0f)
                curveTo(22.75f, 1.5858f, 22.4142f, 1.25f, 22.0f, 1.25f)
                horizontalLineTo(2.0f)
                close()
                moveTo(8.5f, 12.25f)
                curveTo(8.0858f, 12.25f, 7.75f, 12.5858f, 7.75f, 13.0f)
                curveTo(7.75f, 13.4142f, 8.0858f, 13.75f, 8.5f, 13.75f)
                horizontalLineTo(15.5f)
                curveTo(15.9142f, 13.75f, 16.25f, 13.4142f, 16.25f, 13.0f)
                curveTo(16.25f, 12.5858f, 15.9142f, 12.25f, 15.5f, 12.25f)
                horizontalLineTo(8.5f)
                close()
                moveTo(7.75f, 8.0f)
                curveTo(7.75f, 7.5858f, 8.0858f, 7.25f, 8.5f, 7.25f)
                horizontalLineTo(15.5f)
                curveTo(15.9142f, 7.25f, 16.25f, 7.5858f, 16.25f, 8.0f)
                curveTo(16.25f, 8.4142f, 15.9142f, 8.75f, 15.5f, 8.75f)
                horizontalLineTo(8.5f)
                curveTo(8.0858f, 8.75f, 7.75f, 8.4142f, 7.75f, 8.0f)
                close()
            }
        }
            .build()
        return _bill!!
    }

private var _bill: ImageVector? = null
