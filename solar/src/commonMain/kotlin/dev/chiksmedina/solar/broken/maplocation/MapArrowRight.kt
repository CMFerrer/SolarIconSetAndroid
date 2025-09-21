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

val MapLocationGroup.MapArrowRight: ImageVector
    get() {
        if (_mapArrowRight != null) {
            return _mapArrowRight!!
        }
        _mapArrowRight = Builder(
            name = "MapArrowRight", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 16.5974f)
                lineTo(21.0072f, 13.4725f)
                curveTo(22.3309f, 12.8822f, 22.3309f, 11.1178f, 21.0072f, 10.5275f)
                lineTo(4.4975f, 3.165f)
                curveTo(3.0016f, 2.4979f, 1.4501f, 3.9791f, 2.191f, 5.3669f)
                lineTo(5.343f, 11.2706f)
                curveTo(5.5882f, 11.7298f, 5.5882f, 12.2702f, 5.343f, 12.7294f)
                lineTo(2.191f, 18.6331f)
                curveTo(1.4501f, 20.0209f, 3.0016f, 21.5021f, 4.4975f, 20.835f)
                lineTo(9.2487f, 18.7162f)
            }
        }
            .build()
        return _mapArrowRight!!
    }

private var _mapArrowRight: ImageVector? = null
