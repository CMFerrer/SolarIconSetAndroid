package com.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Asteroid: ImageVector
    get() {
        if (_asteroid != null) {
            return _asteroid!!
        }
        _asteroid = Builder(
            name = "Asteroid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 12.122f, 2.7524f, 12.2435f, 2.757f, 12.3643f)
                curveTo(3.1604f, 12.2892f, 3.5759f, 12.25f, 4.0002f, 12.25f)
                curveTo(7.7281f, 12.25f, 10.7502f, 15.2721f, 10.7502f, 19.0f)
                curveTo(10.7502f, 19.7377f, 10.6315f, 20.4487f, 10.4121f, 21.1143f)
                curveTo(10.9276f, 21.2035f, 11.4581f, 21.25f, 12.0f, 21.25f)
                curveTo(16.2686f, 21.25f, 19.8632f, 18.3579f, 20.9288f, 14.4261f)
                curveTo(18.2142f, 13.5516f, 16.25f, 11.006f, 16.25f, 8.0001f)
                curveTo(16.25f, 6.6803f, 16.6294f, 5.4478f, 17.2847f, 4.4072f)
                curveTo(15.7866f, 3.3624f, 13.9656f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(18.4534f, 5.373f)
                curveTo(18.0059f, 6.1455f, 17.75f, 7.0423f, 17.75f, 8.0001f)
                curveTo(17.75f, 10.268f, 19.1886f, 12.2012f, 21.2034f, 12.9348f)
                curveTo(21.2342f, 12.6275f, 21.25f, 12.3157f, 21.25f, 12.0f)
                curveTo(21.25f, 9.4018f, 20.1795f, 7.054f, 18.4534f, 5.373f)
                close()
                moveTo(9.1868f, 22.378f)
                curveTo(5.0545f, 21.2603f, 1.9094f, 17.7421f, 1.3417f, 13.4094f)
                curveTo(1.2812f, 12.9479f, 1.25f, 12.4774f, 1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(14.5751f, 1.25f, 16.9406f, 2.1564f, 18.7918f, 3.6669f)
                curveTo(21.2062f, 5.6369f, 22.75f, 8.6385f, 22.75f, 12.0f)
                curveTo(22.75f, 12.6916f, 22.6846f, 13.3686f, 22.5594f, 14.025f)
                curveTo(21.6118f, 18.994f, 17.2453f, 22.75f, 12.0f, 22.75f)
                curveTo(11.0276f, 22.75f, 10.0843f, 22.6207f, 9.1868f, 22.378f)
                close()
                moveTo(8.9559f, 20.7376f)
                curveTo(9.1464f, 20.1943f, 9.2501f, 19.6098f, 9.2501f, 19.0f)
                curveTo(9.2501f, 16.1005f, 6.8997f, 13.75f, 4.0002f, 13.75f)
                curveTo(3.6352f, 13.75f, 3.2795f, 13.7871f, 2.9365f, 13.8576f)
                curveTo(3.591f, 17.0691f, 5.9113f, 19.677f, 8.9559f, 20.7376f)
                close()
                moveTo(10.5f, 6.75f)
                curveTo(9.5335f, 6.75f, 8.75f, 7.5335f, 8.75f, 8.5f)
                curveTo(8.75f, 9.4665f, 9.5335f, 10.25f, 10.5f, 10.25f)
                curveTo(11.4665f, 10.25f, 12.25f, 9.4665f, 12.25f, 8.5f)
                curveTo(12.25f, 7.5335f, 11.4665f, 6.75f, 10.5f, 6.75f)
                close()
                moveTo(7.25f, 8.5f)
                curveTo(7.25f, 6.7051f, 8.7051f, 5.25f, 10.5f, 5.25f)
                curveTo(12.2949f, 5.25f, 13.75f, 6.7051f, 13.75f, 8.5f)
                curveTo(13.75f, 10.2949f, 12.2949f, 11.75f, 10.5f, 11.75f)
                curveTo(8.7051f, 11.75f, 7.25f, 10.2949f, 7.25f, 8.5f)
                close()
                moveTo(15.0f, 15.75f)
                curveTo(14.8619f, 15.75f, 14.75f, 15.8619f, 14.75f, 16.0f)
                curveTo(14.75f, 16.1381f, 14.8619f, 16.25f, 15.0f, 16.25f)
                curveTo(15.1381f, 16.25f, 15.25f, 16.1381f, 15.25f, 16.0f)
                curveTo(15.25f, 15.8619f, 15.1381f, 15.75f, 15.0f, 15.75f)
                close()
                moveTo(13.25f, 16.0f)
                curveTo(13.25f, 15.0335f, 14.0335f, 14.25f, 15.0f, 14.25f)
                curveTo(15.9665f, 14.25f, 16.75f, 15.0335f, 16.75f, 16.0f)
                curveTo(16.75f, 16.9665f, 15.9665f, 17.75f, 15.0f, 17.75f)
                curveTo(14.0335f, 17.75f, 13.25f, 16.9665f, 13.25f, 16.0f)
                close()
            }
        }
            .build()
        return _asteroid!!
    }

private var _asteroid: ImageVector? = null
