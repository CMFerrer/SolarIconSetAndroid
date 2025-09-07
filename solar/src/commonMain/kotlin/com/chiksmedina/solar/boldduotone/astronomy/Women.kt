package com.chiksmedina.solar.boldduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.Women: ImageVector
    get() {
        if (_women != null) {
            return _women!!
        }
        _women = Builder(
            name = "Women", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 9.0f)
                moveToRelative(-7.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -14.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.25f, 15.9604f)
                verticalLineTo(17.7502f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 17.7502f, 8.75f, 18.0859f, 8.75f, 18.5002f)
                curveTo(8.75f, 18.9144f, 9.0858f, 19.2502f, 9.5f, 19.2502f)
                horizontalLineTo(11.25f)
                verticalLineTo(22.0002f)
                curveTo(11.25f, 22.4144f, 11.5858f, 22.7502f, 12.0f, 22.7502f)
                curveTo(12.4142f, 22.7502f, 12.75f, 22.4144f, 12.75f, 22.0002f)
                verticalLineTo(19.2502f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 19.2502f, 15.25f, 18.9144f, 15.25f, 18.5002f)
                curveTo(15.25f, 18.0859f, 14.9142f, 17.7502f, 14.5f, 17.7502f)
                lineTo(12.75f, 17.7502f)
                verticalLineTo(15.9604f)
                curveTo(12.5036f, 15.9867f, 12.2534f, 16.0002f, 12.0f, 16.0002f)
                curveTo(11.7466f, 16.0002f, 11.4964f, 15.9867f, 11.25f, 15.9604f)
                close()
            }
        }
            .build()
        return _women!!
    }

private var _women: ImageVector? = null
