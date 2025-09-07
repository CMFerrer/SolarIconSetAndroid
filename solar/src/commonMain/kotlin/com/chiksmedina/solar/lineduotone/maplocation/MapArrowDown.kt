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
                moveTo(12.0f, 5.5269f)
                curveTo(11.7501f, 5.5269f, 11.5002f, 5.4656f, 11.2706f, 5.343f)
                lineTo(5.3669f, 2.191f)
                curveTo(3.9791f, 1.4501f, 2.4979f, 3.0016f, 3.165f, 4.4975f)
                lineTo(10.5275f, 21.0072f)
                curveTo(10.8226f, 21.6691f, 11.4113f, 22.0f, 12.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 5.5269f)
                curveTo(12.2499f, 5.5269f, 12.4998f, 5.4656f, 12.7294f, 5.343f)
                lineTo(18.6331f, 2.191f)
                curveTo(20.0209f, 1.4501f, 21.5021f, 3.0016f, 20.835f, 4.4975f)
                lineTo(13.4725f, 21.0072f)
                curveTo(13.1774f, 21.6691f, 12.5887f, 22.0f, 12.0f, 22.0f)
            }
        }
            .build()
        return _mapArrowDown!!
    }

private var _mapArrowDown: ImageVector? = null
