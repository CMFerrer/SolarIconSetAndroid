package dev.chiksmedina.solar.linear.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.ArrowsActionGroup

val ArrowsActionGroup.Exit: ImageVector
    get() {
        if (_exit != null) {
            return _exit!!
        }
        _exit = Builder(
            name = "Exit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 4.5f)
                horizontalLineTo(8.0f)
                curveTo(5.643f, 4.5f, 4.4645f, 4.5f, 3.7322f, 5.2322f)
                curveTo(3.0f, 5.9645f, 3.0f, 7.143f, 3.0f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(3.0f, 16.857f, 3.0f, 18.0355f, 3.7322f, 18.7678f)
                curveTo(4.4645f, 19.5f, 5.643f, 19.5f, 8.0f, 19.5f)
                horizontalLineTo(9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 6.4764f)
                curveTo(9.0f, 4.1826f, 9.0f, 3.0357f, 9.7072f, 2.4087f)
                curveTo(10.4145f, 1.7817f, 11.4955f, 1.9703f, 13.6576f, 2.3474f)
                lineTo(15.9864f, 2.7535f)
                curveTo(18.3809f, 3.1712f, 19.5781f, 3.38f, 20.2891f, 4.2583f)
                curveTo(21.0f, 5.1365f, 21.0f, 6.4067f, 21.0f, 8.9471f)
                verticalLineTo(15.0529f)
                curveTo(21.0f, 17.5933f, 21.0f, 18.8635f, 20.2891f, 19.7417f)
                curveTo(19.5781f, 20.62f, 18.3809f, 20.8288f, 15.9864f, 21.2465f)
                lineTo(13.6576f, 21.6526f)
                curveTo(11.4955f, 22.0297f, 10.4145f, 22.2183f, 9.7072f, 21.5913f)
                curveTo(9.0f, 20.9643f, 9.0f, 19.8174f, 9.0f, 17.5236f)
                verticalLineTo(6.4764f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 11.0f)
                verticalLineTo(13.0f)
            }
        }
            .build()
        return _exit!!
    }

private var _exit: ImageVector? = null
