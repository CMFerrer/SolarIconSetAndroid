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

val AstronomyGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(
            name = "Planet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.7124f, 5.4533f)
                curveTo(18.7593f, 5.26f, 19.7184f, 5.1944f, 20.5094f, 5.3007f)
                curveTo(21.2797f, 5.4041f, 22.0451f, 5.6944f, 22.4649f, 6.3655f)
                curveTo(22.9112f, 7.0788f, 22.7767f, 7.907f, 22.4527f, 8.6231f)
                curveTo(22.1234f, 9.3507f, 21.5345f, 10.1218f, 20.7806f, 10.8912f)
                curveTo(19.2652f, 12.4379f, 16.9446f, 14.1173f, 14.1835f, 15.5883f)
                curveTo(11.4214f, 17.0599f, 8.6892f, 18.0721f, 6.4901f, 18.5079f)
                curveTo(5.3946f, 18.7249f, 4.392f, 18.807f, 3.5675f, 18.709f)
                curveTo(2.7673f, 18.614f, 1.9678f, 18.3262f, 1.535f, 17.6345f)
                curveTo(1.0642f, 16.882f, 1.2386f, 16.0043f, 1.6046f, 15.2551f)
                curveTo(1.9796f, 14.4875f, 2.6374f, 13.6693f, 3.4769f, 12.8522f)
                lineTo(4.0f, 12.4165f)
                curveTo(4.0f, 12.6349f, 4.0834f, 13.1257f, 4.1681f, 13.5624f)
                curveTo(4.2126f, 13.7918f, 4.2575f, 14.0062f, 4.2909f, 14.1584f)
                curveTo(3.6391f, 14.8237f, 3.193f, 15.421f, 2.9524f, 15.9136f)
                curveTo(2.6751f, 16.481f, 2.7442f, 16.7391f, 2.8066f, 16.8389f)
                curveTo(2.8795f, 16.9553f, 3.1117f, 17.1443f, 3.7444f, 17.2195f)
                curveTo(4.3527f, 17.2918f, 5.1841f, 17.2375f, 6.1986f, 17.0365f)
                curveTo(8.2196f, 16.636f, 10.8118f, 15.685f, 13.4782f, 14.2644f)
                curveTo(16.1457f, 12.8433f, 18.3298f, 11.2493f, 19.7092f, 9.8414f)
                curveTo(20.4027f, 9.1336f, 20.8587f, 8.5073f, 21.0861f, 8.0047f)
                curveTo(21.3187f, 7.4905f, 21.2526f, 7.2559f, 21.1933f, 7.161f)
                curveTo(21.1231f, 7.0488f, 20.9042f, 6.8671f, 20.3097f, 6.7873f)
                curveTo(19.7683f, 6.7146f, 19.0378f, 6.746f, 18.1466f, 6.8995f)
                lineTo(16.8697f, 5.656f)
                curveTo(17.2085f, 5.5545f, 17.5278f, 5.4853f, 17.7124f, 5.4533f)
                close()
            }
        }
            .build()
        return _planet!!
    }

private var _planet: ImageVector? = null
