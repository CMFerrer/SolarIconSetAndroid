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

val MapLocationGroup.MapArrowLeft: ImageVector
    get() {
        if (_mapArrowLeft != null) {
            return _mapArrowLeft!!
        }
        _mapArrowLeft = Builder(
            name = "MapArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 7.4026f)
                lineTo(2.9928f, 10.5275f)
                curveTo(1.6691f, 11.1178f, 1.6691f, 12.8822f, 2.9928f, 13.4725f)
                lineTo(19.5025f, 20.835f)
                curveTo(20.9984f, 21.5021f, 22.5499f, 20.0209f, 21.809f, 18.6331f)
                lineTo(18.657f, 12.7294f)
                curveTo(18.4118f, 12.2702f, 18.4118f, 11.7298f, 18.657f, 11.2706f)
                lineTo(21.809f, 5.3669f)
                curveTo(22.5499f, 3.9791f, 20.9984f, 2.4979f, 19.5025f, 3.165f)
                lineTo(14.7513f, 5.2838f)
            }
        }
            .build()
        return _mapArrowLeft!!
    }

private var _mapArrowLeft: ImageVector? = null
