package dev.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TextFormattingGroup

val TextFormattingGroup.TextBoldSquare: ImageVector
    get() {
        if (_textBoldSquare != null) {
            return _textBoldSquare!!
        }
        _textBoldSquare = Builder(
            name = "TextBoldSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.5217f, 5.25f)
                curveTo(8.2671f, 5.25f, 7.25f, 6.2671f, 7.25f, 7.5217f)
                verticalLineTo(16.8235f)
                curveTo(7.25f, 17.8875f, 8.1125f, 18.75f, 9.1765f, 18.75f)
                horizontalLineTo(13.0f)
                curveTo(15.0711f, 18.75f, 16.75f, 17.0711f, 16.75f, 15.0f)
                curveTo(16.75f, 13.5268f, 15.9004f, 12.2519f, 14.6645f, 11.6387f)
                curveTo(15.3356f, 10.9612f, 15.75f, 10.029f, 15.75f, 9.0f)
                curveTo(15.75f, 6.9289f, 14.0711f, 5.25f, 12.0f, 5.25f)
                horizontalLineTo(9.5217f)
                close()
                moveTo(14.25f, 9.0f)
                curveTo(14.25f, 10.2426f, 13.2426f, 11.25f, 12.0f, 11.25f)
                horizontalLineTo(8.75f)
                verticalLineTo(7.5217f)
                curveTo(8.75f, 7.0955f, 9.0955f, 6.75f, 9.5217f, 6.75f)
                horizontalLineTo(12.0f)
                curveTo(13.2426f, 6.75f, 14.25f, 7.7574f, 14.25f, 9.0f)
                close()
                moveTo(8.75f, 16.8235f)
                verticalLineTo(12.75f)
                horizontalLineTo(13.0f)
                curveTo(14.2426f, 12.75f, 15.25f, 13.7574f, 15.25f, 15.0f)
                curveTo(15.25f, 16.2426f, 14.2426f, 17.25f, 13.0f, 17.25f)
                horizontalLineTo(9.1765f)
                curveTo(8.9409f, 17.25f, 8.75f, 17.0591f, 8.75f, 16.8235f)
                close()
            }
        }
            .build()
        return _textBoldSquare!!
    }

private var _textBoldSquare: ImageVector? = null
