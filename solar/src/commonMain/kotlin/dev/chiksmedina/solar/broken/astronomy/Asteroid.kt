package dev.chiksmedina.solar.broken.astronomy

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
import dev.chiksmedina.solar.broken.AstronomyGroup

val AstronomyGroup.Asteroid: ImageVector
    get() {
        if (_asteroid != null) {
            return _asteroid!!
        }
        _asteroid = Builder(
            name = "Asteroid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0002f, 19.0f)
                curveTo(10.0002f, 15.6863f, 7.3139f, 13.0f, 4.0002f, 13.0f)
                curveTo(3.3307f, 13.0f, 2.6867f, 13.1097f, 2.0854f, 13.312f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 8.0001f)
                curveTo(17.0f, 10.9108f, 19.0727f, 13.3375f, 21.8227f, 13.8846f)
                moveTo(18.3176f, 4.2481f)
                curveTo(18.1278f, 4.4847f, 17.9555f, 4.736f, 17.8027f, 5.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 16.0f)
                curveTo(16.0f, 16.5523f, 15.5523f, 17.0f, 15.0f, 17.0f)
                curveTo(14.4477f, 17.0f, 14.0f, 16.5523f, 14.0f, 16.0f)
                curveTo(14.0f, 15.4477f, 14.4477f, 15.0f, 15.0f, 15.0f)
                curveTo(15.5523f, 15.0f, 16.0f, 15.4477f, 16.0f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 8.5f)
                curveTo(13.0f, 7.1193f, 11.8807f, 6.0f, 10.5f, 6.0f)
                curveTo(9.1193f, 6.0f, 8.0f, 7.1193f, 8.0f, 8.5f)
                curveTo(8.0f, 9.8807f, 9.1193f, 11.0f, 10.5f, 11.0f)
            }
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
        }
            .build()
        return _asteroid!!
    }

private var _asteroid: ImageVector? = null
