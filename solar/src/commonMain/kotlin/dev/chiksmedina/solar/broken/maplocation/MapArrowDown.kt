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

val MapLocationGroup.MapArrowDown: ImageVector
    get() {
        if (_mapArrowDown != null) {
            return _mapArrowDown!!
        }
        _mapArrowDown = Builder(
            name = "MapArrowDown", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5974f, 14.0f)
                lineTo(13.4725f, 21.0072f)
                curveTo(12.8822f, 22.3309f, 11.1178f, 22.3309f, 10.5275f, 21.0072f)
                lineTo(3.165f, 4.4975f)
                curveTo(2.4979f, 3.0016f, 3.9791f, 1.4501f, 5.3669f, 2.191f)
                lineTo(11.2706f, 5.343f)
                curveTo(11.7298f, 5.5882f, 12.2702f, 5.5882f, 12.7294f, 5.343f)
                lineTo(18.6331f, 2.191f)
                curveTo(20.0209f, 1.4501f, 21.5021f, 3.0016f, 20.835f, 4.4975f)
                lineTo(18.7162f, 9.2487f)
            }
        }
            .build()
        return _mapArrowDown!!
    }

private var _mapArrowDown: ImageVector? = null
