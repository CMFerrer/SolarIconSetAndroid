package dev.chiksmedina.solar.lineduotone.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Code2: ImageVector
    get() {
        if (_code2 != null) {
            return _code2!!
        }
        _code2 = Builder(
            name = "Code2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 11.0f)
                lineTo(17.6965f, 12.5268f)
                curveTo(19.239f, 13.9151f, 20.0103f, 14.6093f, 20.0103f, 15.5f)
                curveTo(20.0103f, 16.3907f, 19.239f, 17.0849f, 17.6965f, 18.4732f)
                lineTo(16.0f, 20.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.9868f, 5.0f)
                lineTo(10.0f, 20.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 4.8296f)
                lineTo(6.3036f, 6.3564f)
                curveTo(4.761f, 7.7447f, 3.9897f, 8.4389f, 3.9897f, 9.3296f)
                curveTo(3.9897f, 10.2203f, 4.761f, 10.9145f, 6.3036f, 12.3028f)
                lineTo(8.0f, 13.8296f)
            }
        }
            .build()
        return _code2!!
    }

private var _code2: ImageVector? = null
