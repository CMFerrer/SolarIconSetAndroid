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

public val TextFormattingGroup.TextBold: ImageVector
    get() {
        if (_textBold != null) {
            return _textBold!!
        }
        _textBold = Builder(name = "TextBold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                horizontalLineTo(12.0f)
                curveTo(14.7614f, 12.0f, 17.0f, 9.7614f, 17.0f, 7.0f)
                curveTo(17.0f, 4.2386f, 14.7614f, 2.0f, 12.0f, 2.0f)
                horizontalLineTo(7.6087f)
                curveTo(6.168f, 2.0f, 5.0f, 3.1679f, 5.0f, 4.6087f)
                verticalLineTo(12.0f)
                close()
                moveTo(5.0f, 12.0f)
                horizontalLineTo(14.0f)
                curveTo(16.7614f, 12.0f, 19.0f, 14.2386f, 19.0f, 17.0f)
                curveTo(19.0f, 19.7614f, 16.7614f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(7.0588f)
                curveTo(5.9218f, 22.0f, 5.0f, 21.1371f, 5.0f, 20.0f)
                moveTo(5.0f, 12.0f)
                verticalLineTo(15.9706f)
            }
        }
        .build()
        return _textBold!!
    }

private var _textBold: ImageVector? = null
