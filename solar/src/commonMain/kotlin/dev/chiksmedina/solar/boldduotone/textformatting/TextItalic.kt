package dev.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TextFormattingGroup

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
                moveTo(9.0f, 0.9998f)
                horizontalLineTo(14.9768f)
                curveTo(14.992f, 0.9994f, 15.0072f, 0.9994f, 15.0225f, 0.9998f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 0.9998f, 22.0f, 1.4475f, 22.0f, 1.9998f)
                curveTo(22.0f, 2.5521f, 21.5523f, 2.9998f, 21.0f, 2.9998f)
                horizontalLineTo(15.744f)
                horizontalLineTo(13.656f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 2.9998f, 8.0f, 2.5521f, 8.0f, 1.9998f)
                curveTo(8.0f, 1.4475f, 8.4477f, 0.9998f, 9.0f, 0.9998f)
                close()
                moveTo(8.256f, 20.9998f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 20.9998f, 2.0f, 21.4475f, 2.0f, 21.9998f)
                curveTo(2.0f, 22.5521f, 2.4477f, 22.9998f, 3.0f, 22.9998f)
                horizontalLineTo(8.9775f)
                curveTo(8.9928f, 23.0001f, 9.008f, 23.0001f, 9.0232f, 22.9998f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 22.9998f, 16.0f, 22.5521f, 16.0f, 21.9998f)
                curveTo(16.0f, 21.4475f, 15.5523f, 20.9998f, 15.0f, 20.9998f)
                horizontalLineTo(10.344f)
                horizontalLineTo(8.256f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.6559f, 3.0f)
                lineTo(8.2559f, 21.0f)
                horizontalLineTo(10.3439f)
                lineTo(15.7439f, 3.0f)
                horizontalLineTo(13.6559f)
                close()
            }
        }
            .build()
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
