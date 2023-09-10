package com.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TextFormattingGroup

val TextFormattingGroup.TextCross: ImageVector
    get() {
        if (_textCross != null) {
            return _textCross!!
        }
        _textCross = Builder(
            name = "TextCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.948f, 2.25f)
                horizontalLineTo(16.052f)
                curveTo(16.9505f, 2.25f, 17.6997f, 2.2499f, 18.2945f, 2.3299f)
                curveTo(18.9223f, 2.4143f, 19.4891f, 2.6f, 19.9445f, 3.0555f)
                curveTo(20.4f, 3.5109f, 20.5857f, 4.0777f, 20.6701f, 4.7055f)
                curveTo(20.7501f, 5.3003f, 20.75f, 6.0495f, 20.75f, 6.948f)
                verticalLineTo(7.95f)
                curveTo(20.75f, 8.3642f, 20.4142f, 8.7f, 20.0f, 8.7f)
                curveTo(19.5858f, 8.7f, 19.25f, 8.3642f, 19.25f, 7.95f)
                verticalLineTo(7.0f)
                curveTo(19.25f, 6.036f, 19.2484f, 5.3884f, 19.1835f, 4.9054f)
                curveTo(19.1214f, 4.4439f, 19.0142f, 4.2464f, 18.8839f, 4.1161f)
                curveTo(18.7536f, 3.9858f, 18.5561f, 3.8786f, 18.0946f, 3.8165f)
                curveTo(17.6116f, 3.7516f, 16.964f, 3.75f, 16.0f, 3.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(9.0f)
                curveTo(12.75f, 9.4142f, 12.4142f, 9.75f, 12.0f, 9.75f)
                curveTo(11.5858f, 9.75f, 11.25f, 9.4142f, 11.25f, 9.0f)
                verticalLineTo(3.75f)
                horizontalLineTo(8.0f)
                curveTo(7.036f, 3.75f, 6.3884f, 3.7516f, 5.9054f, 3.8165f)
                curveTo(5.4439f, 3.8786f, 5.2464f, 3.9858f, 5.1161f, 4.1161f)
                curveTo(4.9858f, 4.2464f, 4.8786f, 4.4439f, 4.8165f, 4.9054f)
                curveTo(4.7516f, 5.3884f, 4.75f, 6.036f, 4.75f, 7.0f)
                verticalLineTo(7.95f)
                curveTo(4.75f, 8.3642f, 4.4142f, 8.7f, 4.0f, 8.7f)
                curveTo(3.5858f, 8.7f, 3.25f, 8.3642f, 3.25f, 7.95f)
                lineTo(3.25f, 6.948f)
                curveTo(3.25f, 6.0495f, 3.2499f, 5.3003f, 3.3299f, 4.7055f)
                curveTo(3.4143f, 4.0777f, 3.6f, 3.5109f, 4.0555f, 3.0555f)
                curveTo(4.5109f, 2.6f, 5.0777f, 2.4143f, 5.7055f, 2.3299f)
                curveTo(6.3003f, 2.2499f, 7.0495f, 2.25f, 7.948f, 2.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 14.25f)
                curveTo(12.4142f, 14.25f, 12.75f, 14.5858f, 12.75f, 15.0f)
                verticalLineTo(20.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 20.25f, 17.75f, 20.5858f, 17.75f, 21.0f)
                curveTo(17.75f, 21.4142f, 17.4142f, 21.75f, 17.0f, 21.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 21.75f, 6.25f, 21.4142f, 6.25f, 21.0f)
                curveTo(6.25f, 20.5858f, 6.5858f, 20.25f, 7.0f, 20.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(15.0f)
                curveTo(11.25f, 14.5858f, 11.5858f, 14.25f, 12.0f, 14.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0f, 11.25f)
                curveTo(3.5858f, 11.25f, 3.25f, 11.5858f, 3.25f, 12.0f)
                curveTo(3.25f, 12.4142f, 3.5858f, 12.75f, 4.0f, 12.75f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 12.75f, 20.75f, 12.4142f, 20.75f, 12.0f)
                curveTo(20.75f, 11.5858f, 20.4142f, 11.25f, 20.0f, 11.25f)
                horizontalLineTo(4.0f)
                close()
            }
        }
            .build()
        return _textCross!!
    }

private var _textCross: ImageVector? = null
