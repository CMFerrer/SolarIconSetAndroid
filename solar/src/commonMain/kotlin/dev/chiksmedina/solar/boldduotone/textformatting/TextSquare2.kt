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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.75f, 7.0f)
                curveTo(7.3358f, 7.0f, 7.0f, 7.3358f, 7.0f, 7.75f)
                curveTo(7.0f, 8.1642f, 7.3358f, 8.5f, 7.75f, 8.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.75f)
                curveTo(11.0f, 16.1642f, 11.3358f, 16.5f, 11.75f, 16.5f)
                curveTo(12.1642f, 16.5f, 12.5f, 16.1642f, 12.5f, 15.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 8.5f, 16.5f, 8.1642f, 16.5f, 7.75f)
                curveTo(16.5f, 7.3358f, 16.1642f, 7.0f, 15.75f, 7.0f)
                horizontalLineTo(7.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 11.75f)
                curveTo(20.0f, 11.3358f, 20.3358f, 11.0f, 20.75f, 11.0f)
                lineTo(23.25f, 11.0f)
                curveTo(23.6642f, 11.0f, 24.0f, 11.3358f, 24.0f, 11.75f)
                curveTo(24.0f, 12.1642f, 23.6642f, 12.5f, 23.25f, 12.5f)
                horizontalLineTo(20.75f)
                curveTo(20.3358f, 12.5f, 20.0f, 12.1642f, 20.0f, 11.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(0.75f, 11.0f)
                curveTo(0.3358f, 11.0f, 0.0f, 11.3358f, 0.0f, 11.75f)
                curveTo(0.0f, 12.1642f, 0.3358f, 12.5f, 0.75f, 12.5f)
                horizontalLineTo(3.25f)
                curveTo(3.6642f, 12.5f, 4.0f, 12.1642f, 4.0f, 11.75f)
                curveTo(4.0f, 11.3358f, 3.6642f, 11.0f, 3.25f, 11.0f)
                horizontalLineTo(0.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
        }
            .build()
        return _textSquare2!!
    }

private var _textSquare2: ImageVector? = null
