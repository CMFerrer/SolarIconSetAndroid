package com.chiksmedina.solar.broken.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.TextFormattingGroup

val TextFormattingGroup.LinkCircle: ImageVector
    get() {
        if (_linkCircle != null) {
            return _linkCircle!!
        }
        _linkCircle = Builder(
            name = "LinkCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 15.3137f, 11.3137f, 18.0f, 8.0f, 18.0f)
                curveTo(4.6863f, 18.0f, 2.0f, 15.3137f, 2.0f, 12.0f)
                curveTo(2.0f, 8.6863f, 4.6863f, 6.0f, 8.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 8.6863f, 12.6863f, 6.0f, 16.0f, 6.0f)
                moveTo(16.0f, 18.0f)
                curveTo(19.3137f, 18.0f, 22.0f, 15.3137f, 22.0f, 12.0f)
                curveTo(22.0f, 10.7733f, 21.6318f, 9.6325f, 21.0f, 8.6822f)
            }
        }
            .build()
        return _linkCircle!!
    }

private var _linkCircle: ImageVector? = null
