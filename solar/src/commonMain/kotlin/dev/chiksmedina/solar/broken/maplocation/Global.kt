package dev.chiksmedina.solar.broken.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MapLocationGroup

val MapLocationGroup.Global: ImageVector
    get() {
        if (_global != null) {
            return _global!!
        }
        _global = Builder(
            name = "Global", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 3.3378f)
                curveTo(8.4709f, 2.487f, 10.1786f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 10.1786f, 2.487f, 8.4709f, 3.3378f, 7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.8284f, 19.0711f)
                curveTo(14.457f, 19.9997f, 14.016f, 20.7362f, 13.5307f, 21.2388f)
                curveTo(13.0454f, 21.7413f, 12.5253f, 22.0f, 12.0f, 22.0f)
                curveTo(11.4747f, 22.0f, 10.9546f, 21.7413f, 10.4693f, 21.2388f)
                curveTo(9.984f, 20.7362f, 9.543f, 19.9997f, 9.1716f, 19.0711f)
                curveTo(8.8001f, 18.1425f, 8.5055f, 17.0401f, 8.3045f, 15.8268f)
                curveTo(8.1035f, 14.6136f, 8.0f, 13.3132f, 8.0f, 12.0f)
                curveTo(8.0f, 10.6868f, 8.1035f, 9.3864f, 8.3045f, 8.1732f)
                curveTo(8.5055f, 6.9599f, 8.8001f, 5.8575f, 9.1716f, 4.9289f)
                curveTo(9.543f, 4.0003f, 9.984f, 3.2638f, 10.4693f, 2.7612f)
                curveTo(10.9546f, 2.2587f, 11.4747f, 2.0f, 12.0f, 2.0f)
                curveTo(12.5253f, 2.0f, 13.0454f, 2.2587f, 13.5307f, 2.7612f)
                curveTo(14.016f, 3.2638f, 14.457f, 4.0003f, 14.8284f, 4.9289f)
                curveTo(15.1999f, 5.8575f, 15.4945f, 6.9599f, 15.6955f, 8.1732f)
                curveTo(15.8965f, 9.3864f, 16.0f, 10.6868f, 16.0f, 12.0f)
                curveTo(16.0f, 13.3132f, 15.8965f, 14.6136f, 15.6955f, 15.8268f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                horizontalLineTo(10.0f)
                moveTo(22.0f, 12.0f)
                horizontalLineTo(14.0f)
            }
        }
            .build()
        return _global!!
    }

private var _global: ImageVector? = null
