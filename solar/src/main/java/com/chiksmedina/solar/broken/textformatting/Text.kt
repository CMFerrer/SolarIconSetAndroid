package com.chiksmedina.solar.broken.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.TextFormattingGroup

val TextFormattingGroup.Text: ImageVector
    get() {
        if (_text != null) {
            return _text!!
        }
        _text = Builder(
            name = "Text", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(6.1144f, 3.0f, 5.1716f, 3.0f, 4.5858f, 3.5858f)
                curveTo(4.0f, 4.1716f, 4.0f, 5.1144f, 4.0f, 7.0f)
                verticalLineTo(7.95f)
                moveTo(12.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(17.8856f, 3.0f, 18.8284f, 3.0f, 19.4142f, 3.5858f)
                curveTo(20.0f, 4.1716f, 20.0f, 5.1144f, 20.0f, 7.0f)
                verticalLineTo(7.95f)
                moveTo(12.0f, 3.0f)
                verticalLineTo(8.0f)
                moveTo(12.0f, 21.0f)
                verticalLineTo(12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 21.0f)
                horizontalLineTo(17.0f)
            }
        }
            .build()
        return _text!!
    }

private var _text: ImageVector? = null
