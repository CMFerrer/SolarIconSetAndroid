package com.chiksmedina.solar.broken.astronomy

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
import com.chiksmedina.solar.broken.AstronomyGroup

val AstronomyGroup.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(
            name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.4692f, 10.9182f)
                curveTo(20.4692f, 10.9182f, 18.6222f, 10.3027f, 16.1595f, 7.8401f)
                curveTo(13.6969f, 5.3775f, 13.0813f, 3.5303f, 13.0813f, 3.5303f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.4698f, 10.9178f)
                curveTo(18.4297f, 12.9579f, 15.122f, 12.9579f, 13.0819f, 10.9178f)
                curveTo(11.0418f, 8.8777f, 11.0418f, 5.57f, 13.0819f, 3.5299f)
                moveTo(20.4698f, 10.9178f)
                curveTo(22.5099f, 8.8777f, 22.5099f, 5.57f, 20.4698f, 3.5299f)
                curveTo(19.7634f, 2.8235f, 18.905f, 2.3617f, 17.9999f, 2.1445f)
                moveTo(20.4698f, 10.9178f)
                lineTo(17.6464f, 16.0f)
                moveTo(13.0819f, 3.5299f)
                curveTo(13.6429f, 2.9689f, 14.2999f, 2.5621f, 14.9999f, 2.3097f)
                moveTo(13.0819f, 3.5299f)
                lineTo(6.8359f, 7.0f)
                moveTo(16.1601f, 7.8398f)
                lineTo(10.9999f, 12.9999f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 9.6872f)
                lineTo(5.0f, 8.0205f)
                moveTo(14.3132f, 22.0003f)
                lineTo(16.5f, 18.0005f)
                moveTo(5.0f, 19.0003f)
                lineTo(9.0f, 15.0004f)
            }
        }
            .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
