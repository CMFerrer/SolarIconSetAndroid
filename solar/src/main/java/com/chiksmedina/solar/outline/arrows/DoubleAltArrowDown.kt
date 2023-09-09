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
                moveTo(4.4306f, 6.5119f)
                curveTo(4.7001f, 6.1974f, 5.1736f, 6.161f, 5.4881f, 6.4306f)
                lineTo(12.0f, 12.0122f)
                lineTo(18.5119f, 6.4306f)
                curveTo(18.8264f, 6.161f, 19.2999f, 6.1974f, 19.5695f, 6.5119f)
                curveTo(19.839f, 6.8264f, 19.8026f, 7.2999f, 19.4881f, 7.5695f)
                lineTo(12.4881f, 13.5695f)
                curveTo(12.2072f, 13.8102f, 11.7928f, 13.8102f, 11.5119f, 13.5695f)
                lineTo(4.5119f, 7.5695f)
                curveTo(4.1974f, 7.2999f, 4.161f, 6.8264f, 4.4306f, 6.5119f)
                close()
                moveTo(4.4306f, 10.5119f)
                curveTo(4.7001f, 10.1974f, 5.1736f, 10.161f, 5.4881f, 10.4306f)
                lineTo(12.0f, 16.0122f)
                lineTo(18.5119f, 10.4306f)
                curveTo(18.8264f, 10.161f, 19.2999f, 10.1974f, 19.5695f, 10.5119f)
                curveTo(19.839f, 10.8264f, 19.8026f, 11.2999f, 19.4881f, 11.5695f)
                lineTo(12.4881f, 17.5695f)
                curveTo(12.2072f, 17.8102f, 11.7928f, 17.8102f, 11.5119f, 17.5695f)
                lineTo(4.5119f, 11.5695f)
                curveTo(4.1974f, 11.2999f, 4.161f, 10.8264f, 4.4306f, 10.5119f)
                close()
            }
        }
        .build()
        return _doubleAltArrowDown!!
    }

private var _doubleAltArrowDown: ImageVector? = null
