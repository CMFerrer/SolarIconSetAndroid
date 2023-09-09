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

public val ArrowsGroup.AltArrowDown: ImageVector
    get() {
        if (_altArrowDown != null) {
            return _altArrowDown!!
        }
        _altArrowDown = Builder(name = "AltArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.4306f, 8.5119f)
                curveTo(4.7001f, 8.1974f, 5.1736f, 8.161f, 5.4881f, 8.4306f)
                lineTo(12.0f, 14.0122f)
                lineTo(18.5119f, 8.4306f)
                curveTo(18.8264f, 8.161f, 19.2999f, 8.1974f, 19.5694f, 8.5119f)
                curveTo(19.839f, 8.8264f, 19.8026f, 9.2999f, 19.4881f, 9.5695f)
                lineTo(12.4881f, 15.5695f)
                curveTo(12.2072f, 15.8102f, 11.7928f, 15.8102f, 11.5119f, 15.5695f)
                lineTo(4.5119f, 9.5695f)
                curveTo(4.1974f, 9.2999f, 4.161f, 8.8264f, 4.4306f, 8.5119f)
                close()
            }
        }
        .build()
        return _altArrowDown!!
    }

private var _altArrowDown: ImageVector? = null
