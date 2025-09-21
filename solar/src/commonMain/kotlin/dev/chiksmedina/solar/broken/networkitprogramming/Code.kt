package dev.chiksmedina.solar.broken.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(
            name = "Code", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 7.8296f)
                lineTo(18.6965f, 9.3564f)
                curveTo(20.239f, 10.7447f, 21.0103f, 11.4389f, 21.0103f, 12.3296f)
                curveTo(21.0103f, 13.2203f, 20.239f, 13.9145f, 18.6965f, 15.3028f)
                lineTo(17.0f, 16.8296f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.9868f, 5.0f)
                lineTo(12.9934f, 8.7074f)
                moveTo(11.8432f, 13.0f)
                lineTo(10.0132f, 19.8297f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0001f, 7.8296f)
                lineTo(5.3036f, 9.3564f)
                curveTo(3.761f, 10.7447f, 2.9897f, 11.4389f, 2.9897f, 12.3296f)
                curveTo(2.9897f, 13.2203f, 3.761f, 13.9145f, 5.3036f, 15.3028f)
                lineTo(7.0001f, 16.8296f)
            }
        }
            .build()
        return _code!!
    }

private var _code: ImageVector? = null
