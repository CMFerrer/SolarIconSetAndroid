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
                moveTo(17.4879f, 4.4306f)
                curveTo(17.8024f, 4.7001f, 17.8388f, 5.1736f, 17.5693f, 5.4881f)
                lineTo(11.9876f, 12.0f)
                lineTo(17.5693f, 18.5119f)
                curveTo(17.8388f, 18.8264f, 17.8024f, 19.2999f, 17.4879f, 19.5695f)
                curveTo(17.1734f, 19.839f, 16.6999f, 19.8026f, 16.4304f, 19.4881f)
                lineTo(10.4304f, 12.4881f)
                curveTo(10.1896f, 12.2072f, 10.1896f, 11.7928f, 10.4304f, 11.5119f)
                lineTo(16.4304f, 4.5119f)
                curveTo(16.6999f, 4.1974f, 17.1734f, 4.161f, 17.4879f, 4.4306f)
                close()
                moveTo(13.488f, 4.4307f)
                curveTo(13.8025f, 4.7002f, 13.8389f, 5.1737f, 13.5694f, 5.4882f)
                lineTo(7.9877f, 12.0001f)
                lineTo(13.5694f, 18.512f)
                curveTo(13.8389f, 18.8265f, 13.8025f, 19.3f, 13.488f, 19.5696f)
                curveTo(13.1735f, 19.8391f, 12.7f, 19.8027f, 12.4305f, 19.4882f)
                lineTo(6.4305f, 12.4882f)
                curveTo(6.1897f, 12.2073f, 6.1897f, 11.7929f, 6.4305f, 11.512f)
                lineTo(12.4305f, 4.512f)
                curveTo(12.7f, 4.1975f, 13.1735f, 4.1611f, 13.488f, 4.4307f)
                close()
            }
        }
            .build()
        return _doubleAltArrowLeft!!
    }

private var _doubleAltArrowLeft: ImageVector? = null
