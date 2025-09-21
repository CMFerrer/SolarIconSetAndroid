package dev.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.SmartHome: ImageVector
    get() {
        if (_smartHome != null) {
            return _smartHome!!
        }
        _smartHome = Builder(
            name = "SmartHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0001f, 12.2041f)
                verticalLineTo(13.7251f)
                curveTo(22.0001f, 17.626f, 22.0001f, 19.5765f, 20.8285f, 20.7883f)
                curveTo(19.657f, 22.0002f, 17.7713f, 22.0002f, 14.0001f, 22.0002f)
                moveTo(21.4809f, 7.8229f)
                curveTo(20.9617f, 6.8744f, 20.0132f, 6.2857f, 18.1161f, 5.1083f)
                lineTo(16.1161f, 3.867f)
                curveTo(14.1107f, 2.6225f, 13.108f, 2.0002f, 12.0001f, 2.0002f)
                curveTo(10.8922f, 2.0002f, 9.8895f, 2.6225f, 7.8841f, 3.867f)
                lineTo(5.8842f, 5.1083f)
                curveTo(3.9871f, 6.2857f, 3.0385f, 6.8744f, 2.5193f, 7.8229f)
                curveTo(2.2017f, 8.4031f, 2.0784f, 9.0565f, 2.0305f, 10.0002f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 22.0f)
                curveTo(11.0f, 17.0294f, 6.9706f, 13.0f, 2.0f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 22.0f)
                curveTo(8.0f, 18.6863f, 5.3137f, 16.0f, 2.0f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 22.0f)
                curveTo(5.0f, 20.3431f, 3.6569f, 19.0f, 2.0f, 19.0f)
            }
        }
            .build()
        return _smartHome!!
    }

private var _smartHome: ImageVector? = null
