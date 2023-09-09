package com.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.AstronomyGroup

public val AstronomyGroup.BlackHole3: ImageVector
    get() {
        if (_blackHole3 != null) {
            return _blackHole3!!
        }
        _blackHole3 = Builder(name = "BlackHole3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9276f, 12.4529f)
                curveTo(9.3338f, 13.2885f, 9.9443f, 13.9944f, 10.7532f, 14.395f)
                curveTo(9.9602f, 14.5776f, 9.043f, 14.6153f, 8.1052f, 14.4824f)
                curveTo(5.3141f, 14.087f, 2.75f, 12.2842f, 2.75f, 9.0f)
                curveTo(2.75f, 8.5858f, 2.4142f, 8.25f, 2.0f, 8.25f)
                curveTo(1.5858f, 8.25f, 1.25f, 8.5858f, 1.25f, 9.0f)
                curveTo(1.25f, 13.3158f, 4.6859f, 15.513f, 7.8948f, 15.9676f)
                curveTo(9.5072f, 16.196f, 11.1645f, 16.0102f, 12.4529f, 15.3839f)
                curveTo(13.3211f, 14.9619f, 14.0493f, 14.3192f, 14.4405f, 13.4626f)
                curveTo(14.583f, 14.2041f, 14.6034f, 15.041f, 14.4824f, 15.8948f)
                curveTo(14.087f, 18.6858f, 12.2842f, 21.25f, 9.0f, 21.25f)
                curveTo(8.5858f, 21.25f, 8.25f, 21.5858f, 8.25f, 22.0f)
                curveTo(8.25f, 22.4142f, 8.5858f, 22.75f, 9.0f, 22.75f)
                curveTo(13.3158f, 22.75f, 15.513f, 19.3142f, 15.9676f, 16.1052f)
                curveTo(16.196f, 14.4928f, 16.0102f, 12.8355f, 15.3839f, 11.5471f)
                curveTo(15.0377f, 10.835f, 14.5432f, 10.2171f, 13.9039f, 9.802f)
                curveTo(14.5291f, 9.7259f, 15.2064f, 9.7316f, 15.8948f, 9.8291f)
                curveTo(18.6858f, 10.2245f, 21.25f, 12.0274f, 21.25f, 15.3115f)
                curveTo(21.25f, 15.7257f, 21.5858f, 16.0615f, 22.0f, 16.0615f)
                curveTo(22.4142f, 16.0615f, 22.75f, 15.7257f, 22.75f, 15.3115f)
                curveTo(22.75f, 10.9957f, 19.3141f, 8.7985f, 16.1052f, 8.3439f)
                curveTo(14.4928f, 8.1155f, 12.8355f, 8.3013f, 11.5471f, 8.9276f)
                curveTo(10.8555f, 9.2638f, 10.2527f, 9.74f, 9.8384f, 10.3528f)
                curveTo(9.7261f, 9.6583f, 9.7181f, 8.8889f, 9.8291f, 8.1052f)
                curveTo(10.2245f, 5.3141f, 12.0274f, 2.75f, 15.3115f, 2.75f)
                curveTo(15.7257f, 2.75f, 16.0615f, 2.4142f, 16.0615f, 2.0f)
                curveTo(16.0615f, 1.5858f, 15.7257f, 1.25f, 15.3115f, 1.25f)
                curveTo(10.9957f, 1.25f, 8.7985f, 4.6859f, 8.3439f, 7.8948f)
                curveTo(8.1155f, 9.5072f, 8.3013f, 11.1645f, 8.9276f, 12.4529f)
                close()
            }
        }
        .build()
        return _blackHole3!!
    }

private var _blackHole3: ImageVector? = null
