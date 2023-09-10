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

val MapLocationGroup.Streets: ImageVector
    get() {
        if (_streets != null) {
            return _streets!!
        }
        _streets = Builder(
            name = "Streets", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.134f, 2.0f, 18.4553f, 2.9877f, 19.9517f)
                lineTo(19.9517f, 2.9877f)
                curveTo(18.4553f, 2.0f, 16.134f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.0123f, 4.0483f)
                lineTo(13.0607f, 12.0f)
                lineTo(21.0123f, 19.9517f)
                curveTo(22.0f, 18.4553f, 22.0f, 16.134f, 22.0f, 12.0f)
                curveTo(22.0f, 7.866f, 22.0f, 5.5447f, 21.0123f, 4.0483f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 13.0607f)
                lineTo(4.0483f, 21.0123f)
                curveTo(5.5447f, 22.0f, 7.866f, 22.0f, 12.0f, 22.0f)
                curveTo(16.134f, 22.0f, 18.4553f, 22.0f, 19.9517f, 21.0123f)
                lineTo(12.0f, 13.0607f)
                close()
            }
        }
            .build()
        return _streets!!
    }

private var _streets: ImageVector? = null
