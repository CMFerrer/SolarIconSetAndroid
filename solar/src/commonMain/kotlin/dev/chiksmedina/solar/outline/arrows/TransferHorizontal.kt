package dev.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ArrowsGroup

val ArrowsGroup.TransferHorizontal: ImageVector
    get() {
        if (_transferHorizontal != null) {
            return _transferHorizontal!!
        }
        _transferHorizontal = Builder(
            name = "TransferHorizontal", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0068f, 3.4471f)
                curveTo(10.3121f, 3.727f, 10.3328f, 4.2015f, 10.0529f, 4.5068f)
                lineTo(5.7049f, 9.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 9.25f, 20.75f, 9.5858f, 20.75f, 10.0f)
                curveTo(20.75f, 10.4142f, 20.4142f, 10.75f, 20.0f, 10.75f)
                horizontalLineTo(4.0f)
                curveTo(3.7026f, 10.75f, 3.4333f, 10.5742f, 3.3135f, 10.302f)
                curveTo(3.1937f, 10.0298f, 3.2462f, 9.7125f, 3.4471f, 9.4932f)
                lineTo(8.9472f, 3.4932f)
                curveTo(9.227f, 3.1879f, 9.7015f, 3.1672f, 10.0068f, 3.4471f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.6865f, 13.698f)
                curveTo(20.5668f, 13.4258f, 20.2974f, 13.25f, 20.0f, 13.25f)
                lineTo(4.0f, 13.25f)
                curveTo(3.5858f, 13.25f, 3.25f, 13.5858f, 3.25f, 14.0f)
                curveTo(3.25f, 14.4142f, 3.5858f, 14.75f, 4.0f, 14.75f)
                lineTo(18.2951f, 14.75f)
                lineTo(13.9472f, 19.4932f)
                curveTo(13.6673f, 19.7985f, 13.6879f, 20.273f, 13.9932f, 20.5529f)
                curveTo(14.2986f, 20.8328f, 14.773f, 20.8121f, 15.0529f, 20.5068f)
                lineTo(20.5529f, 14.5068f)
                curveTo(20.7539f, 14.2876f, 20.8063f, 13.9703f, 20.6865f, 13.698f)
                close()
            }
        }
            .build()
        return _transferHorizontal!!
    }

private var _transferHorizontal: ImageVector? = null
