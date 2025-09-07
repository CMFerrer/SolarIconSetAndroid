package com.chiksmedina.solar.boldduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.BlackHole3: ImageVector
    get() {
        if (_blackHole3 != null) {
            return _blackHole3!!
        }
        _blackHole3 = Builder(
            name = "BlackHole3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.1035f, 12.7842f)
                curveTo(9.0412f, 12.6764f, 8.9825f, 12.5659f, 8.9276f, 12.4529f)
                curveTo(8.3013f, 11.1645f, 8.1155f, 9.5072f, 8.3439f, 7.8948f)
                curveTo(8.7985f, 4.6859f, 10.9957f, 1.25f, 15.3115f, 1.25f)
                curveTo(15.7257f, 1.25f, 16.0615f, 1.5858f, 16.0615f, 2.0f)
                curveTo(16.0615f, 2.4142f, 15.7257f, 2.75f, 15.3115f, 2.75f)
                curveTo(12.0274f, 2.75f, 10.2245f, 5.3141f, 9.8291f, 8.1052f)
                curveTo(9.738f, 8.7487f, 9.7271f, 9.3825f, 9.7882f, 9.9732f)
                curveTo(10.3366f, 9.375f, 11.1245f, 9.0f, 12.0f, 9.0f)
                curveTo(12.9663f, 9.0f, 13.8258f, 9.4568f, 14.3745f, 10.1663f)
                curveTo(14.7911f, 10.5458f, 15.128f, 11.0207f, 15.3839f, 11.5471f)
                curveTo(16.0102f, 12.8355f, 16.196f, 14.4928f, 15.9676f, 16.1052f)
                curveTo(15.513f, 19.3142f, 13.3158f, 22.75f, 9.0f, 22.75f)
                curveTo(8.5858f, 22.75f, 8.25f, 22.4142f, 8.25f, 22.0f)
                curveTo(8.25f, 21.5858f, 8.5858f, 21.25f, 9.0f, 21.25f)
                curveTo(12.2842f, 21.25f, 14.087f, 18.6858f, 14.4824f, 15.8948f)
                curveTo(14.5912f, 15.1267f, 14.5857f, 14.3725f, 14.4798f, 13.689f)
                curveTo(13.9396f, 14.4804f, 13.0305f, 15.0f, 12.0f, 15.0f)
                curveTo(10.6145f, 15.0f, 9.4483f, 14.0607f, 9.1035f, 12.7842f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.25f, 12.0f)
                curveTo(13.25f, 12.8871f, 12.7399f, 13.5765f, 11.7971f, 14.0348f)
                curveTo(10.8355f, 14.5023f, 9.4928f, 14.679f, 8.1052f, 14.4824f)
                curveTo(5.3141f, 14.087f, 2.75f, 12.2842f, 2.75f, 9.0f)
                curveTo(2.75f, 8.5858f, 2.4142f, 8.25f, 2.0f, 8.25f)
                curveTo(1.5858f, 8.25f, 1.25f, 8.5858f, 1.25f, 9.0f)
                curveTo(1.25f, 13.3158f, 4.6859f, 15.513f, 7.8948f, 15.9676f)
                curveTo(9.5072f, 16.196f, 11.1645f, 16.0102f, 12.4529f, 15.3839f)
                curveTo(13.7601f, 14.7485f, 14.75f, 13.6129f, 14.75f, 12.0f)
                curveTo(14.75f, 11.5858f, 14.4142f, 11.25f, 14.0f, 11.25f)
                curveTo(13.5858f, 11.25f, 13.25f, 11.5858f, 13.25f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.75f, 12.3115f)
                curveTo(10.75f, 11.4244f, 11.2601f, 10.735f, 12.2029f, 10.2767f)
                curveTo(13.1645f, 9.8092f, 14.5072f, 9.6325f, 15.8948f, 9.8291f)
                curveTo(18.6858f, 10.2245f, 21.25f, 12.0274f, 21.25f, 15.3115f)
                curveTo(21.25f, 15.7257f, 21.5858f, 16.0615f, 22.0f, 16.0615f)
                curveTo(22.4142f, 16.0615f, 22.75f, 15.7257f, 22.75f, 15.3115f)
                curveTo(22.75f, 10.9957f, 19.3141f, 8.7985f, 16.1052f, 8.3439f)
                curveTo(14.4928f, 8.1155f, 12.8355f, 8.3013f, 11.5471f, 8.9276f)
                curveTo(10.2399f, 9.5631f, 9.25f, 10.6986f, 9.25f, 12.3115f)
                curveTo(9.25f, 12.7257f, 9.5858f, 13.0615f, 10.0f, 13.0615f)
                curveTo(10.4142f, 13.0615f, 10.75f, 12.7257f, 10.75f, 12.3115f)
                close()
            }
        }
            .build()
        return _blackHole3!!
    }

private var _blackHole3: ImageVector? = null
