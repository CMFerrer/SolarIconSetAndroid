package com.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MapLocationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.5025f, 20.835f)
                lineTo(2.9928f, 13.4725f)
                curveTo(1.6691f, 12.8822f, 1.6691f, 11.1178f, 2.9928f, 10.5275f)
                lineTo(19.5025f, 3.165f)
                curveTo(20.9984f, 2.4979f, 22.5499f, 3.9791f, 21.809f, 5.3669f)
                lineTo(18.657f, 11.2706f)
                curveTo(18.4118f, 11.7298f, 18.4118f, 12.2702f, 18.657f, 12.7294f)
                lineTo(21.809f, 18.6331f)
                curveTo(22.5499f, 20.0209f, 20.9984f, 21.5021f, 19.5025f, 20.835f)
                close()
            }
        }
            .build()
        return _mapArrowLeft!!
    }

private var _mapArrowLeft: ImageVector? = null
