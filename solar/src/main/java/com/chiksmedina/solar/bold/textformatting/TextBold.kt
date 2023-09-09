package com.chiksmedina.solar.bold.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TextFormattingGroup

public val TextFormattingGroup.TextBold: ImageVector
    get() {
        if (_textBold != null) {
            return _textBold!!
        }
        _textBold = Builder(name = "TextBold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.6087f, 1.0f)
                curveTo(5.6157f, 1.0f, 4.0f, 2.6157f, 4.0f, 4.6087f)
                verticalLineTo(19.9412f)
                curveTo(4.0f, 21.6305f, 5.3695f, 23.0f, 7.0588f, 23.0f)
                horizontalLineTo(14.0f)
                curveTo(17.3137f, 23.0f, 20.0f, 20.3137f, 20.0f, 17.0f)
                curveTo(20.0f, 14.4259f, 18.3791f, 12.2304f, 16.1022f, 11.3786f)
                curveTo(17.2702f, 10.2839f, 18.0f, 8.7271f, 18.0f, 7.0f)
                curveTo(18.0f, 3.6863f, 15.3137f, 1.0f, 12.0f, 1.0f)
                horizontalLineTo(7.6087f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.2091f, 11.0f, 16.0f, 9.2091f, 16.0f, 7.0f)
                curveTo(16.0f, 4.7909f, 14.2091f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(7.6087f)
                curveTo(6.7202f, 3.0f, 6.0f, 3.7202f, 6.0f, 4.6087f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(6.0f, 13.0f)
                verticalLineTo(19.9412f)
                curveTo(6.0f, 20.5259f, 6.4741f, 21.0f, 7.0588f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(16.2091f, 21.0f, 18.0f, 19.2091f, 18.0f, 17.0f)
                curveTo(18.0f, 14.7909f, 16.2091f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _textBold!!
    }

private var _textBold: ImageVector? = null
