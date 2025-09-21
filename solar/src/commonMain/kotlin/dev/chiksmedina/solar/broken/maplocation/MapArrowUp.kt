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

val MapLocationGroup.MapArrowUp: ImageVector
    get() {
        if (_mapArrowUp != null) {
            return _mapArrowUp!!
        }
        _mapArrowUp = Builder(
            name = "MapArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.4026f, 10.0f)
                lineTo(10.5275f, 2.9928f)
                curveTo(11.1178f, 1.6691f, 12.8822f, 1.6691f, 13.4725f, 2.9928f)
                lineTo(20.835f, 19.5025f)
                curveTo(21.5021f, 20.9984f, 20.0209f, 22.5499f, 18.6331f, 21.809f)
                lineTo(12.7294f, 18.657f)
                curveTo(12.2702f, 18.4118f, 11.7298f, 18.4118f, 11.2706f, 18.657f)
                lineTo(5.3669f, 21.809f)
                curveTo(3.9791f, 22.5499f, 2.4979f, 20.9984f, 3.165f, 19.5025f)
                lineTo(5.2838f, 14.7513f)
            }
        }
            .build()
        return _mapArrowUp!!
    }

private var _mapArrowUp: ImageVector? = null
