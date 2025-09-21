package dev.chiksmedina.solar.bold.arrows

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
import dev.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.DoubleAltArrowLeft: ImageVector
    get() {
        if (_doubleAltArrowLeft != null) {
            return _doubleAltArrowLeft!!
        }
        _doubleAltArrowLeft = Builder(
            name = "DoubleAltArrowLeft", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.4881f, 4.4306f)
                curveTo(13.8026f, 4.7001f, 13.839f, 5.1736f, 13.5694f, 5.4881f)
                lineTo(7.9878f, 12.0f)
                lineTo(13.5694f, 18.5119f)
                curveTo(13.839f, 18.8264f, 13.8026f, 19.2999f, 13.4881f, 19.5695f)
                curveTo(13.1736f, 19.839f, 12.7001f, 19.8026f, 12.4306f, 19.4881f)
                lineTo(6.4306f, 12.4881f)
                curveTo(6.1898f, 12.2072f, 6.1898f, 11.7928f, 6.4306f, 11.5119f)
                lineTo(12.4306f, 4.5119f)
                curveTo(12.7001f, 4.1974f, 13.1736f, 4.161f, 13.4881f, 4.4306f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.75f, 5.0001f)
                curveTo(17.75f, 4.6862f, 17.5546f, 4.4055f, 17.2602f, 4.2966f)
                curveTo(16.9658f, 4.1877f, 16.6348f, 4.2737f, 16.4306f, 4.512f)
                lineTo(10.4306f, 11.512f)
                curveTo(10.1898f, 11.7928f, 10.1898f, 12.2073f, 10.4306f, 12.4881f)
                lineTo(16.4306f, 19.4881f)
                curveTo(16.6348f, 19.7264f, 16.9658f, 19.8124f, 17.2602f, 19.7035f)
                curveTo(17.5546f, 19.5946f, 17.75f, 19.3139f, 17.75f, 19.0f)
                lineTo(17.75f, 5.0001f)
                close()
            }
        }
            .build()
        return _doubleAltArrowLeft!!
    }

private var _doubleAltArrowLeft: ImageVector? = null
