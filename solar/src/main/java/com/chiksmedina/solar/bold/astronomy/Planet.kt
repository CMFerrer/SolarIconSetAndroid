package com.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.AstronomyGroup

public val AstronomyGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(name = "Planet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9922f, 11.643f)
                curveTo(20.2746f, 11.3899f, 20.5379f, 11.1389f, 20.7806f, 10.8912f)
                curveTo(21.5345f, 10.1218f, 22.1234f, 9.3507f, 22.4527f, 8.6231f)
                curveTo(22.7767f, 7.907f, 22.9112f, 7.0788f, 22.4649f, 6.3655f)
                curveTo(22.0451f, 5.6944f, 21.2797f, 5.4041f, 20.5094f, 5.3007f)
                curveTo(19.7184f, 5.1944f, 18.7593f, 5.26f, 17.7124f, 5.4533f)
                lineTo(16.8241f, 5.6176f)
                curveTo(15.4829f, 4.6023f, 13.8118f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 12.0867f, 4.0014f, 12.173f, 4.0041f, 12.259f)
                lineTo(3.4769f, 12.8522f)
                curveTo(2.6374f, 13.6693f, 1.9796f, 14.4875f, 1.6046f, 15.2551f)
                curveTo(1.2386f, 16.0043f, 1.0642f, 16.882f, 1.535f, 17.6345f)
                curveTo(1.9678f, 18.3262f, 2.7673f, 18.614f, 3.5675f, 18.709f)
                curveTo(4.392f, 18.807f, 5.3946f, 18.7249f, 6.4901f, 18.5079f)
                curveTo(6.7055f, 18.4652f, 6.9259f, 18.417f, 7.1509f, 18.3634f)
                curveTo(6.6671f, 17.9942f, 6.2267f, 17.5711f, 5.8386f, 17.103f)
                curveTo(4.9862f, 17.2488f, 4.2792f, 17.283f, 3.7444f, 17.2195f)
                curveTo(3.1117f, 17.1443f, 2.8795f, 16.9553f, 2.8066f, 16.8389f)
                curveTo(2.7442f, 16.7391f, 2.6751f, 16.481f, 2.9524f, 15.9136f)
                curveTo(3.1934f, 15.4203f, 3.6404f, 14.822f, 4.2937f, 14.1555f)
                curveTo(4.5995f, 15.2508f, 5.1324f, 16.2513f, 5.8386f, 17.103f)
                curveTo(5.9559f, 17.083f, 6.0759f, 17.0608f, 6.1986f, 17.0365f)
                curveTo(8.2196f, 16.636f, 10.8118f, 15.685f, 13.4782f, 14.2644f)
                curveTo(16.1438f, 12.8443f, 18.3267f, 11.2515f, 19.7062f, 9.8444f)
                curveTo(19.4005f, 8.7491f, 18.8675f, 7.7486f, 18.1614f, 6.8969f)
                curveTo(19.0459f, 6.7457f, 19.7713f, 6.715f, 20.3097f, 6.7873f)
                curveTo(20.9042f, 6.8671f, 21.1231f, 7.0488f, 21.1933f, 7.161f)
                curveTo(21.2526f, 7.2559f, 21.3187f, 7.4905f, 21.0861f, 8.0047f)
                curveTo(20.8587f, 8.5073f, 20.4027f, 9.1336f, 19.7092f, 9.8414f)
                lineTo(19.7062f, 9.8444f)
                curveTo(19.867f, 10.4204f, 19.9649f, 11.0225f, 19.9922f, 11.643f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 11.8804f, 19.9974f, 11.7614f, 19.9922f, 11.643f)
                curveTo(18.5107f, 12.9704f, 16.5025f, 14.3528f, 14.1835f, 15.5883f)
                curveTo(11.6919f, 16.9158f, 9.2245f, 17.8695f, 7.1509f, 18.3634f)
                curveTo(8.4963f, 19.3902f, 10.1769f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _planet!!
    }

private var _planet: ImageVector? = null
