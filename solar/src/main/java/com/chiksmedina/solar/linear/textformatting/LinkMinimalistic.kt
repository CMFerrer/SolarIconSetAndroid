package com.chiksmedina.solar.linear.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.TextFormattingGroup

val TextFormattingGroup.LinkMinimalistic: ImageVector
    get() {
        if (_linkMinimalistic != null) {
            return _linkMinimalistic!!
        }
        _linkMinimalistic = Builder(
            name = "LinkMinimalistic", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.9999f, 11.9999f)
                horizontalLineTo(14.9999f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 18.0f)
                horizontalLineTo(8.0f)
                curveTo(4.6863f, 18.0f, 2.0f, 15.3137f, 2.0f, 12.0f)
                curveTo(2.0f, 8.6863f, 4.6863f, 6.0f, 8.0f, 6.0f)
                horizontalLineTo(9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 6.0f)
                horizontalLineTo(16.0f)
                curveTo(19.3137f, 6.0f, 22.0f, 8.6863f, 22.0f, 12.0f)
                curveTo(22.0f, 15.3137f, 19.3137f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(15.0f)
            }
        }
            .build()
        return _linkMinimalistic!!
    }

private var _linkMinimalistic: ImageVector? = null
