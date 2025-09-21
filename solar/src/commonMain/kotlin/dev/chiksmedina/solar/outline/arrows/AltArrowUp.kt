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

val ArrowsGroup.AltArrowUp: ImageVector
    get() {
        if (_altArrowUp != null) {
            return _altArrowUp!!
        }
        _altArrowUp = Builder(
            name = "AltArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.5119f, 8.4306f)
                curveTo(11.7928f, 8.1898f, 12.2072f, 8.1898f, 12.4881f, 8.4306f)
                lineTo(19.4881f, 14.4306f)
                curveTo(19.8026f, 14.7001f, 19.839f, 15.1736f, 19.5695f, 15.4881f)
                curveTo(19.2999f, 15.8026f, 18.8264f, 15.839f, 18.5119f, 15.5694f)
                lineTo(12.0f, 9.9878f)
                lineTo(5.4881f, 15.5694f)
                curveTo(5.1736f, 15.839f, 4.7001f, 15.8026f, 4.4306f, 15.4881f)
                curveTo(4.161f, 15.1736f, 4.1974f, 14.7001f, 4.5119f, 14.4306f)
                lineTo(11.5119f, 8.4306f)
                close()
            }
        }
            .build()
        return _altArrowUp!!
    }

private var _altArrowUp: ImageVector? = null
