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

val MapLocationGroup.Radar2: ImageVector
    get() {
        if (_radar2 != null) {
            return _radar2!!
        }
        _radar2 = Builder(
            name = "Radar2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 11.9996f)
                lineTo(5.002f, 6.3355f)
                curveTo(4.5729f, 5.9881f, 3.9387f, 6.0518f, 3.636f, 6.5135f)
                curveTo(3.0668f, 7.3816f, 2.6241f, 8.3539f, 2.3408f, 9.4114f)
                curveTo(0.9114f, 14.746f, 4.0772f, 20.2294f, 9.4118f, 21.6588f)
                curveTo(14.7465f, 23.0882f, 20.2299f, 19.9224f, 21.6593f, 14.5877f)
                curveTo(23.0887f, 9.2531f, 19.9229f, 3.7697f, 14.5882f, 2.3403f)
                curveTo(11.9556f, 1.6349f, 9.2868f, 2.0486f, 7.0869f, 3.2897f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.8658f, 5.5946f)
                curveTo(9.4728f, 5.7254f, 9.2604f, 6.1501f, 9.3912f, 6.5431f)
                curveTo(9.5221f, 6.9361f, 9.9468f, 7.1486f, 10.3398f, 7.0177f)
                lineTo(9.8658f, 5.5946f)
                close()
                moveTo(17.25f, 12.0f)
                curveTo(17.25f, 14.8995f, 14.8995f, 17.25f, 12.0f, 17.25f)
                verticalLineTo(18.75f)
                curveTo(15.7279f, 18.75f, 18.75f, 15.7279f, 18.75f, 12.0f)
                horizontalLineTo(17.25f)
                close()
                moveTo(12.0f, 17.25f)
                curveTo(9.1005f, 17.25f, 6.75f, 14.8995f, 6.75f, 12.0f)
                horizontalLineTo(5.25f)
                curveTo(5.25f, 15.7279f, 8.2721f, 18.75f, 12.0f, 18.75f)
                verticalLineTo(17.25f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(14.8995f, 6.75f, 17.25f, 9.1005f, 17.25f, 12.0f)
                horizontalLineTo(18.75f)
                curveTo(18.75f, 8.2721f, 15.7279f, 5.25f, 12.0f, 5.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(6.75f, 12.0f)
                curveTo(6.75f, 10.7313f, 7.1991f, 9.5694f, 7.9477f, 8.6618f)
                lineTo(6.7906f, 7.7074f)
                curveTo(5.8285f, 8.8737f, 5.25f, 10.3703f, 5.25f, 12.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(10.3398f, 7.0177f)
                curveTo(10.8606f, 6.8442f, 11.4186f, 6.75f, 12.0f, 6.75f)
                verticalLineTo(5.25f)
                curveTo(11.2554f, 5.25f, 10.5376f, 5.3708f, 9.8658f, 5.5946f)
                lineTo(10.3398f, 7.0177f)
                close()
            }
        }
            .build()
        return _radar2!!
    }

private var _radar2: ImageVector? = null
