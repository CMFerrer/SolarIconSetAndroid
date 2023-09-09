package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

public val ArrowsGroup.DoubleAltArrowDown: ImageVector
    get() {
        if (_doubleAltArrowDown != null) {
            return _doubleAltArrowDown!!
        }
        _doubleAltArrowDown = Builder(name = "DoubleAltArrowDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.4306f, 10.5119f)
                curveTo(4.7001f, 10.1974f, 5.1736f, 10.161f, 5.4881f, 10.4306f)
                lineTo(12.0f, 16.0122f)
                lineTo(18.5119f, 10.4306f)
                curveTo(18.8264f, 10.161f, 19.2999f, 10.1974f, 19.5695f, 10.5119f)
                curveTo(19.839f, 10.8264f, 19.8026f, 11.2999f, 19.4881f, 11.5694f)
                lineTo(12.4881f, 17.5694f)
                curveTo(12.2072f, 17.8102f, 11.7928f, 17.8102f, 11.5119f, 17.5694f)
                lineTo(4.5119f, 11.5694f)
                curveTo(4.1974f, 11.2999f, 4.161f, 10.8264f, 4.4306f, 10.5119f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0001f, 6.25f)
                curveTo(4.6862f, 6.25f, 4.4055f, 6.4454f, 4.2966f, 6.7398f)
                curveTo(4.1877f, 7.0342f, 4.2737f, 7.3652f, 4.512f, 7.5694f)
                lineTo(11.512f, 13.5694f)
                curveTo(11.7928f, 13.8102f, 12.2073f, 13.8102f, 12.4881f, 13.5694f)
                lineTo(19.4881f, 7.5694f)
                curveTo(19.7264f, 7.3652f, 19.8124f, 7.0342f, 19.7035f, 6.7398f)
                curveTo(19.5946f, 6.4454f, 19.3139f, 6.25f, 19.0f, 6.25f)
                horizontalLineTo(5.0001f)
                close()
            }
        }
        .build()
        return _doubleAltArrowDown!!
    }

private var _doubleAltArrowDown: ImageVector? = null
