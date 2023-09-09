package com.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val TextFormattingGroup.TextBoldCircle: ImageVector
    get() {
        if (_textBoldCircle != null) {
            return _textBoldCircle!!
        }
        _textBoldCircle = Builder(name = "TextBoldCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.25f, 7.5217f)
                curveTo(7.25f, 6.2671f, 8.2671f, 5.25f, 9.5217f, 5.25f)
                horizontalLineTo(12.0f)
                curveTo(14.0711f, 5.25f, 15.75f, 6.9289f, 15.75f, 9.0f)
                curveTo(15.75f, 10.029f, 15.3356f, 10.9612f, 14.6645f, 11.6387f)
                curveTo(15.9004f, 12.2519f, 16.75f, 13.5268f, 16.75f, 15.0f)
                curveTo(16.75f, 17.0711f, 15.0711f, 18.75f, 13.0f, 18.75f)
                horizontalLineTo(9.1765f)
                curveTo(8.1125f, 18.75f, 7.25f, 17.8875f, 7.25f, 16.8235f)
                verticalLineTo(7.5217f)
                close()
                moveTo(8.75f, 11.25f)
                horizontalLineTo(12.0f)
                curveTo(13.2426f, 11.25f, 14.25f, 10.2426f, 14.25f, 9.0f)
                curveTo(14.25f, 7.7574f, 13.2426f, 6.75f, 12.0f, 6.75f)
                horizontalLineTo(9.5217f)
                curveTo(9.0955f, 6.75f, 8.75f, 7.0955f, 8.75f, 7.5217f)
                verticalLineTo(11.25f)
                close()
                moveTo(8.75f, 12.75f)
                verticalLineTo(16.8235f)
                curveTo(8.75f, 17.0591f, 8.9409f, 17.25f, 9.1765f, 17.25f)
                horizontalLineTo(13.0f)
                curveTo(14.2426f, 17.25f, 15.25f, 16.2426f, 15.25f, 15.0f)
                curveTo(15.25f, 13.7574f, 14.2426f, 12.75f, 13.0f, 12.75f)
                horizontalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
            }
        }
        .build()
        return _textBoldCircle!!
    }

private var _textBoldCircle: ImageVector? = null
