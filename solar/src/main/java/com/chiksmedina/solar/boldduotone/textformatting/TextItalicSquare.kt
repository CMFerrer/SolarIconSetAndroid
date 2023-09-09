package com.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.TextFormattingGroup

public val TextFormattingGroup.TextItalicSquare: ImageVector
    get() {
        if (_textItalicSquare != null) {
            return _textItalicSquare!!
        }
        _textItalicSquare = Builder(name = "TextItalicSquare", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6667f, 6.2502f)
                horizontalLineTo(13.3162f)
                curveTo(13.3273f, 6.2499f, 13.3384f, 6.2499f, 13.3495f, 6.2502f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 6.2502f, 16.75f, 6.586f, 16.75f, 7.0002f)
                curveTo(16.75f, 7.4144f, 16.4142f, 7.7502f, 16.0f, 7.7502f)
                horizontalLineTo(13.9095f)
                lineTo(11.6429f, 16.2502f)
                horizontalLineTo(13.3333f)
                curveTo(13.7475f, 16.2502f, 14.0833f, 16.586f, 14.0833f, 17.0002f)
                curveTo(14.0833f, 17.4144f, 13.7475f, 17.7502f, 13.3333f, 17.7502f)
                horizontalLineTo(10.6838f)
                curveTo(10.6727f, 17.7504f, 10.6616f, 17.7504f, 10.6505f, 17.7502f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 17.7502f, 7.25f, 17.4144f, 7.25f, 17.0002f)
                curveTo(7.25f, 16.586f, 7.5858f, 16.2502f, 8.0f, 16.2502f)
                horizontalLineTo(10.0905f)
                lineTo(12.3571f, 7.7502f)
                horizontalLineTo(10.6667f)
                curveTo(10.2525f, 7.7502f, 9.9167f, 7.4144f, 9.9167f, 7.0002f)
                curveTo(9.9167f, 6.586f, 10.2525f, 6.2502f, 10.6667f, 6.2502f)
                close()
            }
        }
        .build()
        return _textItalicSquare!!
    }

private var _textItalicSquare: ImageVector? = null
