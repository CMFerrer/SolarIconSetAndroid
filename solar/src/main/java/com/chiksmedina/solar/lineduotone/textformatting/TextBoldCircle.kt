package com.chiksmedina.solar.lineduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.TextFormattingGroup

val TextFormattingGroup.TextBoldCircle: ImageVector
    get() {
        if (_textBoldCircle != null) {
            return _textBoldCircle!!
        }
        _textBoldCircle = Builder(
            name = "TextBoldCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 7.5217f)
                curveTo(8.0f, 6.6813f, 8.6813f, 6.0f, 9.5217f, 6.0f)
                horizontalLineTo(12.0f)
                curveTo(13.6569f, 6.0f, 15.0f, 7.3432f, 15.0f, 9.0f)
                curveTo(15.0f, 10.6569f, 13.6569f, 12.0f, 12.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.5217f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(14.6569f, 12.0f, 16.0f, 13.3431f, 16.0f, 15.0f)
                curveTo(16.0f, 16.6569f, 14.6569f, 18.0f, 13.0f, 18.0f)
                horizontalLineTo(9.1765f)
                curveTo(8.5267f, 18.0f, 8.0f, 17.4733f, 8.0f, 16.8235f)
                verticalLineTo(12.0f)
                close()
            }
        }
            .build()
        return _textBoldCircle!!
    }

private var _textBoldCircle: ImageVector? = null
