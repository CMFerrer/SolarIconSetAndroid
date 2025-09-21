package dev.chiksmedina.solar.linear.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.ArrowsActionGroup

val ArrowsActionGroup.SquareBottomDown: ImageVector
    get() {
        if (_squareBottomDown != null) {
            return _squareBottomDown!!
        }
        _squareBottomDown = Builder(
            name = "SquareBottomDown", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 21.9994f)
                curveTo(17.055f, 21.9921f, 19.1785f, 21.8926f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.071f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.2859f, 2.0f, 4.9289f, 2.0f, 3.4644f, 3.4645f)
                curveTo(2.1074f, 4.8215f, 2.0078f, 6.9449f, 2.0006f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 13.0f)
                lineTo(3.0f, 21.0f)
                moveTo(3.0f, 21.0f)
                horizontalLineTo(9.0f)
                moveTo(3.0f, 21.0f)
                verticalLineTo(15.0f)
            }
        }
            .build()
        return _squareBottomDown!!
    }

private var _squareBottomDown: ImageVector? = null
