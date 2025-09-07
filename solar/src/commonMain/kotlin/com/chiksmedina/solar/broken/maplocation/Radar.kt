package com.chiksmedina.solar.broken.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MapLocationGroup

val MapLocationGroup.Radar: ImageVector
    get() {
        if (_radar != null) {
            return _radar!!
        }
        _radar = Builder(
            name = "Radar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.4118f, 21.6588f)
                curveTo(9.9411f, 21.8006f, 10.4719f, 21.8972f, 11.0f, 21.9509f)
                curveTo(15.7947f, 22.4387f, 20.3717f, 19.3931f, 21.6593f, 14.5877f)
                curveTo(23.0887f, 9.2531f, 19.9229f, 3.7697f, 14.5882f, 2.3403f)
                curveTo(11.9556f, 1.6349f, 9.2868f, 2.0486f, 7.0869f, 3.2897f)
                moveTo(12.0f, 11.9996f)
                lineTo(5.002f, 6.3355f)
                curveTo(4.5729f, 5.9881f, 3.9387f, 6.0518f, 3.636f, 6.5135f)
                curveTo(3.0668f, 7.3816f, 2.6241f, 8.3539f, 2.3408f, 9.4114f)
                curveTo(1.3732f, 13.0224f, 2.5111f, 16.7015f, 5.002f, 19.1453f)
            }
        }
            .build()
        return _radar!!
    }

private var _radar: ImageVector? = null
