package dev.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TextFormattingGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 3.0f)
                curveTo(5.0f, 2.4477f, 4.5523f, 2.0f, 4.0f, 2.0f)
                curveTo(3.4477f, 2.0f, 3.0f, 2.4477f, 3.0f, 3.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 13.9706f, 7.0294f, 18.0f, 12.0f, 18.0f)
                curveTo(16.9706f, 18.0f, 21.0f, 13.9706f, 21.0f, 9.0f)
                verticalLineTo(3.0f)
                curveTo(21.0f, 2.4477f, 20.5523f, 2.0f, 20.0f, 2.0f)
                curveTo(19.4477f, 2.0f, 19.0f, 2.4477f, 19.0f, 3.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 12.866f, 15.866f, 16.0f, 12.0f, 16.0f)
                curveTo(8.134f, 16.0f, 5.0f, 12.866f, 5.0f, 9.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0f, 20.0f)
                curveTo(3.4477f, 20.0f, 3.0f, 20.4477f, 3.0f, 21.0f)
                curveTo(3.0f, 21.5523f, 3.4477f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 22.0f, 21.0f, 21.5523f, 21.0f, 21.0f)
                curveTo(21.0f, 20.4477f, 20.5523f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
            .build()
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
