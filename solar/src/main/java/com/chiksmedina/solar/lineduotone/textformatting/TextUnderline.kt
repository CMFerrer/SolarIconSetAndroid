package com.chiksmedina.solar.lineduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.TextFormattingGroup

val TextFormattingGroup.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) {
            return _textUnderline!!
        }
        _textUnderline = Builder(
            name = "TextUnderline", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 21.0f)
                horizontalLineTo(20.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0f, 3.0f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 13.4183f, 7.5817f, 17.0f, 12.0f, 17.0f)
                curveTo(16.4183f, 17.0f, 20.0f, 13.4183f, 20.0f, 9.0f)
                verticalLineTo(3.0f)
            }
        }
            .build()
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
