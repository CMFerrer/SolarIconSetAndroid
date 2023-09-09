package com.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TextFormattingGroup

public val TextFormattingGroup.TextItalicCircle: ImageVector
    get() {
        if (_textItalicCircle != null) {
            return _textItalicCircle!!
        }
        _textItalicCircle = Builder(name = "TextItalicCircle", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6667f, 6.25f)
                horizontalLineTo(13.3162f)
                curveTo(13.3273f, 6.2498f, 13.3384f, 6.2498f, 13.3495f, 6.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 6.25f, 16.75f, 6.5858f, 16.75f, 7.0f)
                curveTo(16.75f, 7.4142f, 16.4142f, 7.75f, 16.0f, 7.75f)
                horizontalLineTo(13.9095f)
                lineTo(11.6429f, 16.25f)
                horizontalLineTo(13.3333f)
                curveTo(13.7475f, 16.25f, 14.0833f, 16.5858f, 14.0833f, 17.0f)
                curveTo(14.0833f, 17.4142f, 13.7475f, 17.75f, 13.3333f, 17.75f)
                horizontalLineTo(10.6838f)
                curveTo(10.6727f, 17.7502f, 10.6616f, 17.7502f, 10.6505f, 17.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 17.75f, 7.25f, 17.4142f, 7.25f, 17.0f)
                curveTo(7.25f, 16.5858f, 7.5858f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(10.0905f)
                lineTo(12.3571f, 7.75f)
                horizontalLineTo(10.6667f)
                curveTo(10.2525f, 7.75f, 9.9167f, 7.4142f, 9.9167f, 7.0f)
                curveTo(9.9167f, 6.5858f, 10.2525f, 6.25f, 10.6667f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(6.8914f, 21.25f, 2.75f, 17.1086f, 2.75f, 12.0f)
                close()
            }
        }
        .build()
        return _textItalicCircle!!
    }

private var _textItalicCircle: ImageVector? = null
