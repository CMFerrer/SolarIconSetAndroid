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

val ArrowsGroup.DoubleAltArrowUp: ImageVector
    get() {
        if (_doubleAltArrowUp != null) {
            return _doubleAltArrowUp!!
        }
        _doubleAltArrowUp = Builder(
            name = "DoubleAltArrowUp", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.5119f, 6.4306f)
                curveTo(11.7928f, 6.1898f, 12.2072f, 6.1898f, 12.4881f, 6.4306f)
                lineTo(19.4881f, 12.4306f)
                curveTo(19.8026f, 12.7001f, 19.839f, 13.1736f, 19.5695f, 13.4881f)
                curveTo(19.2999f, 13.8026f, 18.8264f, 13.839f, 18.5119f, 13.5694f)
                lineTo(12.0f, 7.9878f)
                lineTo(5.4881f, 13.5694f)
                curveTo(5.1736f, 13.839f, 4.7001f, 13.8026f, 4.4306f, 13.4881f)
                curveTo(4.161f, 13.1736f, 4.1974f, 12.7001f, 4.5119f, 12.4306f)
                lineTo(11.5119f, 6.4306f)
                close()
                moveTo(4.5119f, 16.4306f)
                lineTo(11.5119f, 10.4306f)
                curveTo(11.7928f, 10.1898f, 12.2072f, 10.1898f, 12.4881f, 10.4306f)
                lineTo(19.4881f, 16.4306f)
                curveTo(19.8026f, 16.7001f, 19.839f, 17.1736f, 19.5695f, 17.4881f)
                curveTo(19.2999f, 17.8026f, 18.8264f, 17.839f, 18.5119f, 17.5694f)
                lineTo(12.0f, 11.9878f)
                lineTo(5.4881f, 17.5694f)
                curveTo(5.1736f, 17.839f, 4.7001f, 17.8026f, 4.4306f, 17.4881f)
                curveTo(4.161f, 17.1736f, 4.1974f, 16.7001f, 4.5119f, 16.4306f)
                close()
            }
        }
            .build()
        return _doubleAltArrowUp!!
    }

private var _doubleAltArrowUp: ImageVector? = null
