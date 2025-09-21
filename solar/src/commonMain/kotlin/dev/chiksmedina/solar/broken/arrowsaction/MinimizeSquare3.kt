package dev.chiksmedina.solar.broken.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.ArrowsActionGroup

val ArrowsActionGroup.MinimizeSquare3: ImageVector
    get() {
        if (_minimizeSquare3 != null) {
            return _minimizeSquare3!!
        }
        _minimizeSquare3 = Builder(
            name = "MinimizeSquare3", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 7.0f)
                lineTo(12.0f, 12.0f)
                moveTo(12.0f, 12.0f)
                horizontalLineTo(15.75f)
                moveTo(12.0f, 12.0f)
                verticalLineTo(8.25f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 18.0f)
                curveTo(2.0f, 16.1144f, 2.0f, 15.1716f, 2.5858f, 14.5858f)
                curveTo(3.1716f, 14.0f, 4.1144f, 14.0f, 6.0f, 14.0f)
                curveTo(7.8856f, 14.0f, 8.8284f, 14.0f, 9.4142f, 14.5858f)
                curveTo(10.0f, 15.1716f, 10.0f, 16.1144f, 10.0f, 18.0f)
                curveTo(10.0f, 19.8856f, 10.0f, 20.8284f, 9.4142f, 21.4142f)
                curveTo(8.8284f, 22.0f, 7.8856f, 22.0f, 6.0f, 22.0f)
                curveTo(4.1144f, 22.0f, 3.1716f, 22.0f, 2.5858f, 21.4142f)
                curveTo(2.0f, 20.8284f, 2.0f, 19.8856f, 2.0f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.9999f, 2.0f)
                curveTo(16.714f, 2.0f, 19.071f, 2.0f, 20.5354f, 3.4645f)
                curveTo(21.9999f, 4.9289f, 21.9999f, 7.286f, 21.9999f, 12.0f)
                curveTo(21.9999f, 16.714f, 21.9999f, 19.0711f, 20.5354f, 20.5355f)
                curveTo(19.1784f, 21.8926f, 17.055f, 21.9921f, 12.9999f, 21.9994f)
                moveTo(2.0005f, 11.0f)
                curveTo(2.0078f, 6.9449f, 2.1073f, 4.8215f, 3.4644f, 3.4645f)
                curveTo(4.4381f, 2.4907f, 5.8065f, 2.1644f, 8.0f, 2.0551f)
            }
        }
            .build()
        return _minimizeSquare3!!
    }

private var _minimizeSquare3: ImageVector? = null
