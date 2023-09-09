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

public val ArrowsGroup.AltArrowRight: ImageVector
    get() {
        if (_altArrowRight != null) {
            return _altArrowRight!!
        }
        _altArrowRight = Builder(name = "AltArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.5119f, 4.4306f)
                curveTo(8.8264f, 4.161f, 9.2999f, 4.1974f, 9.5695f, 4.5119f)
                lineTo(15.5695f, 11.5119f)
                curveTo(15.8102f, 11.7928f, 15.8102f, 12.2072f, 15.5695f, 12.4881f)
                lineTo(9.5695f, 19.4881f)
                curveTo(9.2999f, 19.8026f, 8.8264f, 19.839f, 8.5119f, 19.5695f)
                curveTo(8.1974f, 19.2999f, 8.161f, 18.8264f, 8.4306f, 18.5119f)
                lineTo(14.0122f, 12.0f)
                lineTo(8.4306f, 5.4881f)
                curveTo(8.161f, 5.1736f, 8.1974f, 4.7001f, 8.5119f, 4.4306f)
                close()
            }
        }
        .build()
        return _altArrowRight!!
    }

private var _altArrowRight: ImageVector? = null
