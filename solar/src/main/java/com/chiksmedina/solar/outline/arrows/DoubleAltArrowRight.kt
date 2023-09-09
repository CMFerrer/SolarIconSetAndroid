package com.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsGroup

public val ArrowsGroup.DoubleAltArrowRight: ImageVector
    get() {
        if (_doubleAltArrowRight != null) {
            return _doubleAltArrowRight!!
        }
        _doubleAltArrowRight = Builder(name = "DoubleAltArrowRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5117f, 4.4306f)
                curveTo(6.8262f, 4.161f, 7.2997f, 4.1974f, 7.5693f, 4.5119f)
                lineTo(13.5693f, 11.5119f)
                curveTo(13.81f, 11.7928f, 13.81f, 12.2072f, 13.5693f, 12.4881f)
                lineTo(7.5693f, 19.4881f)
                curveTo(7.2997f, 19.8026f, 6.8262f, 19.839f, 6.5117f, 19.5695f)
                curveTo(6.1972f, 19.2999f, 6.1608f, 18.8264f, 6.4304f, 18.5119f)
                lineTo(12.012f, 12.0f)
                lineTo(6.4304f, 5.4881f)
                curveTo(6.1608f, 5.1736f, 6.1972f, 4.7001f, 6.5117f, 4.4306f)
                close()
                moveTo(10.5119f, 4.4307f)
                curveTo(10.8264f, 4.1611f, 11.2999f, 4.1975f, 11.5695f, 4.512f)
                lineTo(17.5695f, 11.512f)
                curveTo(17.8102f, 11.7929f, 17.8102f, 12.2073f, 17.5695f, 12.4882f)
                lineTo(11.5695f, 19.4882f)
                curveTo(11.2999f, 19.8027f, 10.8264f, 19.8391f, 10.5119f, 19.5696f)
                curveTo(10.1974f, 19.3f, 10.161f, 18.8265f, 10.4306f, 18.512f)
                lineTo(16.0122f, 12.0001f)
                lineTo(10.4306f, 5.4882f)
                curveTo(10.161f, 5.1737f, 10.1974f, 4.7002f, 10.5119f, 4.4307f)
                close()
            }
        }
        .build()
        return _doubleAltArrowRight!!
    }

private var _doubleAltArrowRight: ImageVector? = null
