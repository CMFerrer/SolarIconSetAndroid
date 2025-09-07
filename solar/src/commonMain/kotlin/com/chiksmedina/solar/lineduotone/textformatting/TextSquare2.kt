package com.chiksmedina.solar.lineduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.TextFormattingGroup

val TextFormattingGroup.TextSquare2: ImageVector
    get() {
        if (_textSquare2 != null) {
            return _textSquare2!!
        }
        _textSquare2 = Builder(
            name = "TextSquare2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 9.3f)
                curveTo(20.9424f, 6.7879f, 20.702f, 5.3206f, 19.6974f, 4.318f)
                curveTo(18.3768f, 3.0f, 16.2512f, 3.0f, 12.0f, 3.0f)
                curveTo(7.7488f, 3.0f, 5.6232f, 3.0f, 4.3026f, 4.318f)
                curveTo(3.298f, 5.3206f, 3.0575f, 6.7879f, 3.0f, 9.3f)
                moveTo(21.0f, 14.7f)
                curveTo(20.9424f, 17.2121f, 20.702f, 18.6794f, 19.6974f, 19.682f)
                curveTo(18.3768f, 21.0f, 16.2512f, 21.0f, 12.0f, 21.0f)
                curveTo(7.7488f, 21.0f, 5.6232f, 21.0f, 4.3026f, 19.682f)
                curveTo(3.298f, 18.6794f, 3.0576f, 17.2121f, 3.0f, 14.7f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 8.0f)
                horizontalLineTo(16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 16.0f)
                lineTo(12.0f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                horizontalLineTo(20.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 12.0f)
                horizontalLineTo(2.0f)
            }
        }
            .build()
        return _textSquare2!!
    }

private var _textSquare2: ImageVector? = null
