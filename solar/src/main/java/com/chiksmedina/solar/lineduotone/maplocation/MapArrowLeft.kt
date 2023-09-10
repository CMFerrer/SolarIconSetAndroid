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
                moveTo(18.4731f, 12.0f)
                curveTo(18.4731f, 12.2499f, 18.5344f, 12.4998f, 18.657f, 12.7294f)
                lineTo(21.809f, 18.6331f)
                curveTo(22.5499f, 20.0209f, 20.9984f, 21.5021f, 19.5025f, 20.835f)
                lineTo(2.9928f, 13.4725f)
                curveTo(2.3309f, 13.1774f, 2.0f, 12.5887f, 2.0f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.4731f, 12.0f)
                curveTo(18.4731f, 11.7501f, 18.5344f, 11.5002f, 18.657f, 11.2706f)
                lineTo(21.809f, 5.3669f)
                curveTo(22.5499f, 3.9791f, 20.9984f, 2.4979f, 19.5025f, 3.165f)
                lineTo(2.9928f, 10.5275f)
                curveTo(2.3309f, 10.8226f, 2.0f, 11.4113f, 2.0f, 12.0f)
            }
        }
            .build()
        return _mapArrowLeft!!
    }

private var _mapArrowLeft: ImageVector? = null
