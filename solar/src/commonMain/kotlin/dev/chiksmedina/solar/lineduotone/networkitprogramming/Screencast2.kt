package dev.chiksmedina.solar.lineduotone.networkitprogramming

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
import dev.chiksmedina.solar.lineduotone.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Screencast2: ImageVector
    get() {
        if (_screencast2 != null) {
            return _screencast2!!
        }
        _screencast2 = Builder(
            name = "Screencast2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.142f, 18.9706f)
                curveTo(5.1854f, 18.8995f, 4.0f, 18.6568f, 3.1716f, 17.8284f)
                curveTo(2.0f, 16.6569f, 2.0f, 14.7712f, 2.0f, 11.0f)
                curveTo(2.0f, 7.2288f, 2.0f, 5.3432f, 3.1716f, 4.1716f)
                curveTo(4.3432f, 3.0f, 6.2288f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 3.0f, 19.6569f, 3.0f, 20.8284f, 4.1716f)
                curveTo(22.0f, 5.3432f, 22.0f, 7.2288f, 22.0f, 11.0f)
                curveTo(22.0f, 14.7712f, 22.0f, 16.6569f, 20.8284f, 17.8284f)
                curveTo(20.0203f, 18.6366f, 18.8723f, 18.8873f, 17.0f, 18.965f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.9495f, 16.0503f)
                curveTo(10.8806f, 15.1192f, 11.3461f, 14.6537f, 11.9209f, 14.6234f)
                curveTo(11.9735f, 14.6206f, 12.0261f, 14.6206f, 12.0787f, 14.6234f)
                curveTo(12.6535f, 14.6537f, 13.119f, 15.1192f, 14.0501f, 16.0503f)
                curveTo(16.0759f, 18.0761f, 17.0888f, 19.089f, 16.8053f, 19.963f)
                curveTo(16.7809f, 20.0381f, 16.7506f, 20.1112f, 16.7147f, 20.1815f)
                curveTo(16.2973f, 21.0f, 14.8648f, 21.0f, 11.9998f, 21.0f)
                curveTo(9.1348f, 21.0f, 7.7023f, 21.0f, 7.2849f, 20.1815f)
                curveTo(7.249f, 20.1112f, 7.2187f, 20.0381f, 7.1944f, 19.963f)
                curveTo(6.9108f, 19.089f, 7.9237f, 18.0761f, 9.9495f, 16.0503f)
                close()
            }
        }
            .build()
        return _screencast2!!
    }

private var _screencast2: ImageVector? = null
