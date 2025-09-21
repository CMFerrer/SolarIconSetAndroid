package dev.chiksmedina.solar.boldduotone.arrows

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
import dev.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.DoubleAltArrowRight: ImageVector
    get() {
        if (_doubleAltArrowRight != null) {
            return _doubleAltArrowRight!!
        }
        _doubleAltArrowRight = Builder(
            name = "DoubleAltArrowRight", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.25f, 19.0f)
                curveTo(6.25f, 19.3139f, 6.4454f, 19.5946f, 6.7398f, 19.7035f)
                curveTo(7.0342f, 19.8123f, 7.3652f, 19.7264f, 7.5694f, 19.4881f)
                lineTo(13.5694f, 12.4881f)
                curveTo(13.8102f, 12.2073f, 13.8102f, 11.7928f, 13.5694f, 11.5119f)
                lineTo(7.5694f, 4.5119f)
                curveTo(7.3652f, 4.2736f, 7.0342f, 4.1877f, 6.7398f, 4.2966f)
                curveTo(6.4454f, 4.4055f, 6.25f, 4.6862f, 6.25f, 5.0f)
                lineTo(6.25f, 19.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.5119f, 19.5695f)
                curveTo(10.1974f, 19.2999f, 10.161f, 18.8264f, 10.4306f, 18.5119f)
                lineTo(16.0122f, 12.0f)
                lineTo(10.4306f, 5.4881f)
                curveTo(10.161f, 5.1736f, 10.1974f, 4.7001f, 10.5119f, 4.4306f)
                curveTo(10.8264f, 4.161f, 11.2999f, 4.1974f, 11.5695f, 4.5119f)
                lineTo(17.5695f, 11.5119f)
                curveTo(17.8102f, 11.7928f, 17.8102f, 12.2072f, 17.5695f, 12.4881f)
                lineTo(11.5695f, 19.4881f)
                curveTo(11.2999f, 19.8026f, 10.8264f, 19.839f, 10.5119f, 19.5695f)
                close()
            }
        }
            .build()
        return _doubleAltArrowRight!!
    }

private var _doubleAltArrowRight: ImageVector? = null
