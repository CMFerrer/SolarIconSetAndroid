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
                moveTo(1.25f, 3.0f)
                curveTo(1.25f, 2.5858f, 1.5858f, 2.25f, 2.0f, 2.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 2.25f, 22.75f, 2.5858f, 22.75f, 3.0f)
                curveTo(22.75f, 3.4142f, 22.4142f, 3.75f, 22.0f, 3.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 3.75f, 1.25f, 3.4142f, 1.25f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 3.75f)
                verticalLineTo(13.2774f)
                curveTo(4.0f, 14.6175f, 4.0f, 15.2875f, 4.2681f, 15.8783f)
                curveTo(4.5362f, 16.4692f, 5.0405f, 16.9104f, 6.049f, 17.7928f)
                lineTo(8.049f, 19.5429f)
                curveTo(9.9315f, 21.1901f, 10.8728f, 22.0137f, 12.0f, 22.0137f)
                curveTo(13.1272f, 22.0137f, 14.0685f, 21.1901f, 15.951f, 19.5429f)
                lineTo(17.951f, 17.7929f)
                curveTo(18.9595f, 16.9104f, 19.4638f, 16.4692f, 19.7319f, 15.8783f)
                curveTo(20.0f, 15.2875f, 20.0f, 14.6175f, 20.0f, 13.2774f)
                verticalLineTo(3.75f)
                horizontalLineTo(4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.75f, 14.0f)
                curveTo(7.75f, 13.5858f, 8.0858f, 13.25f, 8.5f, 13.25f)
                horizontalLineTo(15.5f)
                curveTo(15.9142f, 13.25f, 16.25f, 13.5858f, 16.25f, 14.0f)
                curveTo(16.25f, 14.4142f, 15.9142f, 14.75f, 15.5f, 14.75f)
                horizontalLineTo(8.5f)
                curveTo(8.0858f, 14.75f, 7.75f, 14.4142f, 7.75f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.75f, 9.0f)
                curveTo(7.75f, 8.5858f, 8.0858f, 8.25f, 8.5f, 8.25f)
                lineTo(15.5f, 8.25f)
                curveTo(15.9142f, 8.25f, 16.25f, 8.5858f, 16.25f, 9.0f)
                curveTo(16.25f, 9.4142f, 15.9142f, 9.75f, 15.5f, 9.75f)
                horizontalLineTo(8.5f)
                curveTo(8.0858f, 9.75f, 7.75f, 9.4142f, 7.75f, 9.0f)
                close()
            }
        }
            .build()
        return _bill!!
    }

private var _bill: ImageVector? = null
