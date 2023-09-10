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
                moveTo(12.0f, 18.4731f)
                curveTo(11.7501f, 18.4731f, 11.5002f, 18.5344f, 11.2706f, 18.657f)
                lineTo(5.3669f, 21.809f)
                curveTo(3.9791f, 22.5499f, 2.4979f, 20.9984f, 3.165f, 19.5025f)
                lineTo(10.5275f, 2.9928f)
                curveTo(10.8226f, 2.3309f, 11.4113f, 2.0f, 12.0f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 18.4731f)
                curveTo(12.2499f, 18.4731f, 12.4998f, 18.5344f, 12.7294f, 18.657f)
                lineTo(18.6331f, 21.809f)
                curveTo(20.0209f, 22.5499f, 21.5021f, 20.9984f, 20.835f, 19.5025f)
                lineTo(13.4725f, 2.9928f)
                curveTo(13.1774f, 2.3309f, 12.5887f, 2.0f, 12.0f, 2.0f)
            }
        }
            .build()
        return _mapArrowUp!!
    }

private var _mapArrowUp: ImageVector? = null
