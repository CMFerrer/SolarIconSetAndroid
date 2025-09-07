package com.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TextFormattingGroup

val TextFormattingGroup.TextItalic: ImageVector
    get() {
        if (_textItalic != null) {
            return _textItalic!!
        }
        _textItalic = Builder(
            name = "TextItalic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.9826f, 1.2502f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 1.2502f, 8.25f, 1.586f, 8.25f, 2.0002f)
                curveTo(8.25f, 2.4144f, 8.5858f, 2.7502f, 9.0f, 2.7502f)
                horizontalLineTo(13.992f)
                lineTo(8.442f, 21.2502f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 21.2502f, 2.25f, 21.586f, 2.25f, 22.0002f)
                curveTo(2.25f, 22.4144f, 2.5858f, 22.7502f, 3.0f, 22.7502f)
                horizontalLineTo(8.9831f)
                curveTo(8.9946f, 22.7505f, 9.006f, 22.7505f, 9.0174f, 22.7502f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 22.7502f, 15.75f, 22.4144f, 15.75f, 22.0002f)
                curveTo(15.75f, 21.586f, 15.4142f, 21.2502f, 15.0f, 21.2502f)
                horizontalLineTo(10.008f)
                lineTo(15.558f, 2.7502f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 2.7502f, 21.75f, 2.4144f, 21.75f, 2.0002f)
                curveTo(21.75f, 1.586f, 21.4142f, 1.2502f, 21.0f, 1.2502f)
                horizontalLineTo(15.0169f)
                curveTo(15.0054f, 1.2499f, 14.994f, 1.2499f, 14.9826f, 1.2502f)
                close()
            }
        }
            .build()
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
