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

val ArrowsGroup.AltArrowLeft: ImageVector
    get() {
        if (_altArrowLeft != null) {
            return _altArrowLeft!!
        }
        _altArrowLeft = Builder(
            name = "AltArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.4881f, 4.4306f)
                curveTo(15.8026f, 4.7001f, 15.839f, 5.1736f, 15.5694f, 5.4881f)
                lineTo(9.9878f, 12.0f)
                lineTo(15.5694f, 18.5119f)
                curveTo(15.839f, 18.8264f, 15.8026f, 19.2999f, 15.4881f, 19.5695f)
                curveTo(15.1736f, 19.839f, 14.7001f, 19.8026f, 14.4306f, 19.4881f)
                lineTo(8.4306f, 12.4881f)
                curveTo(8.1898f, 12.2072f, 8.1898f, 11.7928f, 8.4306f, 11.5119f)
                lineTo(14.4306f, 4.5119f)
                curveTo(14.7001f, 4.1974f, 15.1736f, 4.161f, 15.4881f, 4.4306f)
                close()
            }
        }
            .build()
        return _altArrowLeft!!
    }

private var _altArrowLeft: ImageVector? = null
