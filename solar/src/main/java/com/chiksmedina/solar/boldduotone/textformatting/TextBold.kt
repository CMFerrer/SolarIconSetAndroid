package com.chiksmedina.solar.boldduotone.textformatting

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
import com.chiksmedina.solar.boldduotone.TextFormattingGroup

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
                moveTo(4.0f, 4.6087f)
                curveTo(4.0f, 2.6157f, 5.6157f, 1.0f, 7.6087f, 1.0f)
                horizontalLineTo(12.0f)
                curveTo(15.3137f, 1.0f, 18.0f, 3.6863f, 18.0f, 7.0f)
                curveTo(18.0f, 10.3137f, 15.3137f, 13.0f, 12.0f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.6087f)
                close()
                moveTo(7.6087f, 3.0f)
                curveTo(6.7202f, 3.0f, 6.0f, 3.7202f, 6.0f, 4.6087f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                curveTo(14.2091f, 11.0f, 16.0f, 9.2091f, 16.0f, 7.0f)
                curveTo(16.0f, 4.7909f, 14.2091f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(7.6087f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 12.9998f)
                verticalLineTo(19.941f)
                curveTo(4.0f, 21.6303f, 5.3695f, 22.9998f, 7.0588f, 22.9998f)
                horizontalLineTo(14.0f)
                curveTo(17.3137f, 22.9998f, 20.0f, 20.3135f, 20.0f, 16.9998f)
                curveTo(20.0f, 14.4257f, 18.3791f, 12.2303f, 16.1022f, 11.3784f)
                curveTo(15.0293f, 12.384f, 13.5866f, 12.9998f, 12.0f, 12.9998f)
                horizontalLineTo(14.0f)
                curveTo(16.2091f, 12.9998f, 18.0f, 14.7907f, 18.0f, 16.9998f)
                curveTo(18.0f, 19.209f, 16.2091f, 20.9998f, 14.0f, 20.9998f)
                horizontalLineTo(7.0588f)
                curveTo(6.4741f, 20.9998f, 6.0f, 20.5258f, 6.0f, 19.941f)
                verticalLineTo(12.9998f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _textBold!!
    }

private var _textBold: ImageVector? = null
