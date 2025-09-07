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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.75f, 3.0f)
                curveTo(4.75f, 2.5858f, 4.4142f, 2.25f, 4.0f, 2.25f)
                curveTo(3.5858f, 2.25f, 3.25f, 2.5858f, 3.25f, 3.0f)
                verticalLineTo(9.0f)
                curveTo(3.25f, 13.8325f, 7.1675f, 17.75f, 12.0f, 17.75f)
                curveTo(16.8325f, 17.75f, 20.75f, 13.8325f, 20.75f, 9.0f)
                verticalLineTo(3.0f)
                curveTo(20.75f, 2.5858f, 20.4142f, 2.25f, 20.0f, 2.25f)
                curveTo(19.5858f, 2.25f, 19.25f, 2.5858f, 19.25f, 3.0f)
                verticalLineTo(9.0f)
                curveTo(19.25f, 13.0041f, 16.0041f, 16.25f, 12.0f, 16.25f)
                curveTo(7.9959f, 16.25f, 4.75f, 13.0041f, 4.75f, 9.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0f, 20.25f)
                curveTo(3.5858f, 20.25f, 3.25f, 20.5858f, 3.25f, 21.0f)
                curveTo(3.25f, 21.4142f, 3.5858f, 21.75f, 4.0f, 21.75f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 21.75f, 20.75f, 21.4142f, 20.75f, 21.0f)
                curveTo(20.75f, 20.5858f, 20.4142f, 20.25f, 20.0f, 20.25f)
                horizontalLineTo(4.0f)
                close()
            }
        }
            .build()
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
