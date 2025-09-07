package com.chiksmedina.solar.lineduotone.maplocation

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
import com.chiksmedina.solar.lineduotone.MapLocationGroup

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
                moveTo(5.5268f, 12.0f)
                curveTo(5.5268f, 11.7501f, 5.4655f, 11.5002f, 5.3429f, 11.2706f)
                lineTo(2.1909f, 5.3669f)
                curveTo(1.4499f, 3.9791f, 3.0015f, 2.4979f, 4.4973f, 3.165f)
                lineTo(21.0071f, 10.5275f)
                curveTo(21.6689f, 10.8226f, 21.9999f, 11.4113f, 21.9999f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5269f, 12.0f)
                curveTo(5.5269f, 12.2499f, 5.4656f, 12.4998f, 5.343f, 12.7294f)
                lineTo(2.191f, 18.6331f)
                curveTo(1.4501f, 20.0209f, 3.0016f, 21.5021f, 4.4975f, 20.835f)
                lineTo(21.0072f, 13.4725f)
                curveTo(21.6691f, 13.1774f, 22.0f, 12.5887f, 22.0f, 12.0f)
            }
        }
            .build()
        return _mapArrowRight!!
    }

private var _mapArrowRight: ImageVector? = null
